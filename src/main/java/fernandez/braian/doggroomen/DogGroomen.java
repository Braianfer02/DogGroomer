
package fernandez.braian.doggroomen;

import fernandez.braian.doggroomen.giu.DogGroomer;
import javax.swing.JFrame;

public class DogGroomen {

    public static void main(String[] args) {
        DogGroomer windowsDogGroomer = new DogGroomer();
        windowsDogGroomer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        windowsDogGroomer.setVisible(true);
        windowsDogGroomer.setLocationRelativeTo(null);
    }
}
