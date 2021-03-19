/*
 *This is our Vaccine class and it has some variable about medicine's information. It implements Serializable.
 *This class also extends Medicine class.
 */
import java.io.Serializable;

public class Vaccine extends Medicine implements Serializable {
    //This is extra variable from Medicine class and ıt checks vaccine type for Vaccine.
    private String vaccineType;
    //This is constructor of our class and ıt use super method for extends Medicine.
    public Vaccine(int ID, String medicineType, int expirationDateMounth, int expirationDateYear, String name, int stock, float price, String vaccineType) {
        super(ID, medicineType, expirationDateMounth, expirationDateYear, name, stock, price);
        this.vaccineType=vaccineType;
    }
    //Setter and getter methods for this class.
    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }
}
