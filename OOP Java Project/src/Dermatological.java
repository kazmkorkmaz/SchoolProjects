/*
 *This is our Dermatological class and it has some variable about medicine's information. It implements Serializable.
 *This class also extends Medicine class.
 */
import java.io.Serializable;

public class Dermatological extends Medicine implements Serializable {
    //This is extra variable from Medicine class and ıt checks use for which body part for Dermatological.
    private String whichBodyPart;
    //This is constructor of our class and ıt use super method for extends Medicine.
    public Dermatological(int ID, String medicineType, int expirationDateMounth, int expirationDateYear, String name, int stock, float price, String whichBodyPart) {
        super(ID, medicineType, expirationDateMounth, expirationDateYear, name, stock, price);
        this.whichBodyPart = whichBodyPart;
    }
    //Setter and getter methods for this class.
    public String getWhichBodyPart() {
        return whichBodyPart;
    }

    public void setWhichBodyPart(String whichBodyPart) {
        this.whichBodyPart = whichBodyPart;
    }
}