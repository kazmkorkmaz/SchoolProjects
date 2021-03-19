/*
 *This is our Vitamin class and it has some variable about medicine's information. It implements Serializable.
 *This class also extends Medicine class.
 */
import java.io.Serializable;

public class Vitamin extends Medicine implements Serializable {
    //This is extra variable from Medicine class and ıt checks vitamin type for Vitamin.
    private String vitaminType;
    //This is constructor of our class and ıt use super method for extends Medicine.
    public Vitamin(int ID, String medicineType, int expirationDateMounth, int expirationDateYear, String name, int stock, float price, String vitaminType) {
        super(ID, medicineType, expirationDateMounth, expirationDateYear, name, stock, price);
        this.vitaminType = vitaminType;
    }
    //Setter and getter methods for this class.
    public String getVitaminType() {
        return vitaminType;
    }

    public void setVitaminType(String vitaminType) {
        this.vitaminType = vitaminType;
    }
}
