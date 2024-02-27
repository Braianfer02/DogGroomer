
package fernandez.braian.doggroomen.persistence;

import fernandez.braian.doggroomen.logic.Dogs;
import fernandez.braian.doggroomen.persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class DogsJpaController implements Serializable {

    public DogsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public DogsJpaController() {
        emf = Persistence.createEntityManagerFactory("DogGroomerPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Dogs dogs) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(dogs);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Dogs dogs) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            dogs = em.merge(dogs);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = dogs.getNumber_client();
                if (findDogs(id) == null) {
                    throw new NonexistentEntityException("The dogs with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Dogs dogs;
            try {
                dogs = em.getReference(Dogs.class, id);
                dogs.getNumber_client();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The dogs with id " + id + " no longer exists.", enfe);
            }
            em.remove(dogs);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Dogs> findDogsEntities() {
        return findDogsEntities(true, -1, -1);
    }

    public List<Dogs> findDogsEntities(int maxResults, int firstResult) {
        return findDogsEntities(false, maxResults, firstResult);
    }

    private List<Dogs> findDogsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Dogs.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Dogs findDogs(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Dogs.class, id);
        } finally {
            em.close();
        }
    }

    public int getDogsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Dogs> rt = cq.from(Dogs.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
