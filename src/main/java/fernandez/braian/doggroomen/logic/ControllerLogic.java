
package fernandez.braian.doggroomen.logic;

import fernandez.braian.doggroomen.persistence.ControllerPersistence;
import java.util.List;

public class ControllerLogic {
    
    ControllerPersistence persisController = new ControllerPersistence();

    public void saveDogs(String txtName, String txtRace, String txtColor, 
            Object jcbAllergic, Object jcbSpecialAttention, String txtOwnerName, 
            String txtOwnerCellPhone, String txtObservation) {
        
        Owner owner = new Owner();
        owner.setName(txtOwnerName);
        owner.setOwner_Cell_Phone(txtOwnerCellPhone);
        
        Dogs dogs = new Dogs();
        dogs.setName(txtName);
        dogs.setRace(txtRace);
        dogs.setColor(txtColor);
        dogs.setAllergic((String)jcbAllergic);
        dogs.setSpecial_attention((String)jcbSpecialAttention);
        dogs.setObservation(txtObservation);
        dogs.setOneOnwer(owner);
        
        persisController.saveDogs(owner, dogs);
    }

    public List<Dogs> bringDogs() {
        return persisController.bringPets();
    }

    public void deleteDogs(int number_Client) {
        persisController.deleteDogs(number_Client);
    }

    public Dogs bringDog(int number_Client) {
        return persisController.bringDog(number_Client);
    }

    public void modifyDogs(Dogs dog, String text, String text0, String text1, String selectedItem, String selectedItem0, String text2, String text3, String text4) {
        
        dog.setName(text);
        dog.setRace(text0);
        dog.setColor(text1);
        dog.setAllergic(selectedItem);
        dog.setSpecial_attention(selectedItem0);
        dog.setObservation(text4);

        persisController.modifyDogs(dog);
        
        Owner owner = this.findOwner(dog.getOneOnwer().getId_owner());
        owner.setName(text2);
        owner.setOwner_Cell_Phone(text3);
        
        this.modifyOwner(owner);
    }

    private Owner findOwner(int id_owner) {
        return persisController.findOwner(id_owner);
    }

    private void modifyOwner(Owner owner) {
        persisController.modifyOwner(owner);
    }

}
