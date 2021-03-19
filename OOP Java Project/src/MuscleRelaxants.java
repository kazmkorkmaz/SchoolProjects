/*
 *This is our MuscleRelaxants class and it has some variable about medicine's information. It implements Serializable.
 *This class also extends Medicine class.
 */
import java.io.Serializable;

public class MuscleRelaxants extends Medicine implements Serializable {
    //This is extra variable from Medicine class and ıt checks percentage of effectiveness for MuscleRelaxants.
    private int percentageOfEffectiveness;
    //This is constructor of our class and ıt use super method for extends Medicine.
    public MuscleRelaxants(int ID, String medicineType, int expirationDateMounth, int expirationDateYear, String name, int stock, float price, int percentageOfEffectiveness) {
        super(ID, medicineType, expirationDateMounth, expirationDateYear, name, stock, price);
        this.percentageOfEffectiveness = percentageOfEffectiveness;
    }
    //Setter and getter methods for this class.
    public int getPercentageOfEffectiveness() {
        return percentageOfEffectiveness;
    }

    public void setPercentageOfEffectiveness(int percentageOfEffectiveness) {
        this.percentageOfEffectiveness = percentageOfEffectiveness;
    }
}
