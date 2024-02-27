
package fernandez.braian.doggroomen.persistence;

import fernandez.braian.doggroomen.logic.Dogs;
import fernandez.braian.doggroomen.logic.Owner;
import fernandez.braian.doggroomen.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerPersistence {
    
    DogsJpaController dogsController = new DogsJpaController();
    OwnerJpaController ownerController = new OwnerJpaController();
    
    public List<Dogs> bringPets(){
        return dogsController.findDogsEntities();
    };

    public void saveDogs(Owner owner, Dogs dogs) {
        ownerController.create(owner);
        dogsController.create(dogs);
    }
    
    public Dogs bringDog(int number_Client) {
        return dogsController.findDogs(number_Client);
    }

    public void deleteDogs(int number_Client) {
        try {
            dogsController.destroy(number_Client);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void modifyDogs(Dogs dog) {
        try {
            dogsController.edit(dog);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Owner findOwner(int id_owner) {
        return ownerController.findOwner(id_owner);
    }

    public void modifyOwner(Owner owner) {
        try {
            ownerController.edit(owner);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
