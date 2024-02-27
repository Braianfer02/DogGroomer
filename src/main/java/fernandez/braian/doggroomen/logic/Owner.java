
package fernandez.braian.doggroomen.logic;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Owner implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_owner;
    @Basic
    private String name;
    private String owner_Cell_Phone;
    
    public Owner() {
    }

    public Owner(int id_owner, String name, String owner_Cell_Phone) {
        this.id_owner = id_owner;
        this.name = name;
        this.owner_Cell_Phone = owner_Cell_Phone;
    }

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner_Cell_Phone() {
        return owner_Cell_Phone;
    }

    public void setOwner_Cell_Phone(String owner_Cell_Phone) {
        this.owner_Cell_Phone = owner_Cell_Phone;
    }
}
