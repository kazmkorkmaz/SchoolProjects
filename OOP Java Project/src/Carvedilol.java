/*
 *This is our Carvedilol class and it has some variable about medicine's information. It implements Serializable.
 *This class also extends Medicine class.
 */
import java.io.Serializable;

public class Carvedilol extends Medicine implements Serializable {
    //This is extra variable from Medicine class and ıt checks heart problem exists for Carvedilol.
    private boolean heartProblemExists;
    //This is constructor of our class and ıt use super method for extends Medicine.

    public Carvedilol(int ID, String medicineType, int expirationDateMounth, int expirationDateYear, String name, int stock, float price, boolean heartProblemExists) {
        super(ID, medicineType, expirationDateMounth, expirationDateYear, name, stock, price);
        this.heartProblemExists = heartProblemExists;
    }
    //Setter and getter methods for this class.
    public boolean isHeartProblemExists() {
        return heartProblemExists;
    }

    public void setHeartProblemExists(boolean heartProblemExists) {
        this.heartProblemExists = heartProblemExists;
    }
}
