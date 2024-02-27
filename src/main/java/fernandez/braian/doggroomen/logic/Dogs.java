
package fernandez.braian.doggroomen.logic;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dogs implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int number_client;
    @Basic
    private String name;
    private String race;
    private String color;
    private String allergic;
    private String special_attention;
    private String observation;
    @OneToOne
    private Owner oneOnwer;

    public Dogs() {
    }

    public Dogs(int number_client, String name, String race, String color, String allergic, String special_attention, String observation, Owner oneOnwer) {
        this.number_client = number_client;
        this.name = name;
        this.race = race;
        this.color = color;
        this.allergic = allergic;
        this.special_attention = special_attention;
        this.observation = observation;
        this.oneOnwer = oneOnwer;
    }

    public int getNumber_client() {
        return number_client;
    }

    public void setNumber_client(int number_client) {
        this.number_client = number_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getSpecial_attention() {
        return special_attention;
    }

    public void setSpecial_attention(String special_attention) {
        this.special_attention = special_attention;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Owner getOneOnwer() {
        return oneOnwer;
    }

    public void setOneOnwer(Owner oneOnwer) {
        this.oneOnwer = oneOnwer;
    }
}
