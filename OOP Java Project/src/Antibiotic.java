/*
*This is our Antibiotic class and it has some variable about medicine's information. It implements Serializable.
*This class also extends Medicine class.
 */
import java.io.Serializable;

public class Antibiotic extends Medicine implements Serializable {

    //This is extra variable from Medicine class and ıt checks age limit for antibiotics.
    private boolean ageLimit;
    //This is constructor of our class and ıt use super method for extends Medicine.
    public Antibiotic(int ID, String medicineType, int expirationDateMounth, int expirationDateYear, String name, int stock, float price, boolean ageLimit) {
        super(ID, medicineType, expirationDateMounth, expirationDateYear, name, stock, price);
        this.ageLimit = ageLimit;
    }
    //Setter and getter methods for this class.
    public boolean isAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(boolean ageLimit) {
        this.ageLimit = ageLimit;
    }
}
