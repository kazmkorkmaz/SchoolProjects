/*
 *This is our Antidepressant class and it has some variable about medicine's information. It implements Serializable.
 *This class also extends Medicine class.
 */
import java.io.Serializable;

public class Antidepressant extends Medicine implements Serializable {
    //This is extra variable from Medicine class and ıt checks prescription requariment for Antidepressant.
    private boolean prescriptionRequariment;
    //This is constructor of our class and ıt use super method for extends Medicine.
    public Antidepressant(int ID, String medicineType, int expirationDateMounth, int expirationDateYear, String name, int stock, float price, boolean prescriptionRequariment) {
        super(ID, medicineType, expirationDateMounth, expirationDateYear, name, stock, price);
        this.prescriptionRequariment = prescriptionRequariment;
    }
    //Setter and getter methods for this class.
    public boolean isPrescriptionRequariment() {
        return prescriptionRequariment;
    }

    public void setPrescriptionRequariment(boolean prescriptionRequariment) {
        this.prescriptionRequariment = prescriptionRequariment;
    }
}
