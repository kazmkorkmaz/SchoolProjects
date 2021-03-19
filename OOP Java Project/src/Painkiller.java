/*
 *This is our Painkiller class and it has some variable about medicine's information. It implements Serializable.
 *This class also extends Medicine class.
 */
import java.io.Serializable;

public class Painkiller extends Medicine implements Serializable {
    //These are extra variables from Medicine class and ıt checks upper weight limit and lower weight limit for Painkiller.
    private int upperWeightLimit;
    private int lowerWeightLimit;
    //This is constructor of our class and ıt use super method for extends Medicine.
    public Painkiller(int ID, String medicineType, int expirationDateMounth, int expirationDateYear, String name, int stock, float price, int upperWeightLimit, int lowerWeightLimit) {
        super(ID, medicineType, expirationDateMounth, expirationDateYear, name, stock, price);
        this.upperWeightLimit=upperWeightLimit;
        this.lowerWeightLimit=lowerWeightLimit;
    }
    //Setter and getter methods for this class.
    public int getUpperWeightLimit() {
        return upperWeightLimit;
    }

    public void setUpperWeightLimit(int upperWeightLimit) {
        this.upperWeightLimit = upperWeightLimit;
    }

    public int getLowerWeightLimit() {
        return lowerWeightLimit;
    }

    public void setLowerWeightLimit(int lowerWeightLimit) {
        this.lowerWeightLimit = lowerWeightLimit;
    }
}
