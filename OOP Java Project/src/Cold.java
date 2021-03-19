/*
 *This is our Cold class and it has some variable about medicine's information. It implements Serializable.
 *This class also extends Medicine class.
 */
import java.io.Serializable;

public class Cold extends Medicine implements Serializable {
    //This is extra variable from Medicine class and ıt checks who use for Cold.
    private String usedFor;
    //This is constructor of our class and ıt use super method for extends Medicine.

    public Cold(int ID, String medicineType, int expirationDateMounth, int expirationDateYear, String name, int stock, float price, String usedFor) {
        super(ID, medicineType, expirationDateMounth, expirationDateYear, name, stock, price);
        this.usedFor = usedFor;
    }
    //Setter and getter methods for this class.
    public String getUsedFor() {
        return usedFor;
    }

    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
    }
}
