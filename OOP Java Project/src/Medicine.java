
/*
This is our Medicine class and it has some variable about medicine's information. It implements Serializable.

 */
import java.io.Serializable;
import java.util.InputMismatchException;

public class Medicine implements Serializable {
    //Variables for Medicine class.
    private final int ID ;
    private final String medicineType;
    private int expirationDateMounth;
    private int expirationDateYear;
    private final String name;
    private int stock;
    private float price;
    //This construct class of our class.It also checks whether the correct information for medicines has been entered.
    public Medicine(int ID, String medicineType, int expirationDateMounth, int expirationDateYear, String name, int stock, float price) {
        if(ID>99999 || ID<10000)
        {
            throw new IllegalArgumentException("ID should be an integer with 5 digits.");
        }
        if(!medicineType.equalsIgnoreCase("tablet")&&
                !medicineType.equalsIgnoreCase("syrup")&&
                !medicineType.equalsIgnoreCase("cream")&&
                !medicineType.equalsIgnoreCase("ampul")&&
                !medicineType.equalsIgnoreCase("capsule")&&
                !medicineType.equalsIgnoreCase("liquid")&&
                !medicineType.equalsIgnoreCase("flacon"))
        {
            throw new IllegalArgumentException("Medicine Type should be one of the next forms; Tablet, Syrup, Cream, Ampul, Capsule, Liquid, Flacon");
        }
        if(expirationDateMounth<1 || expirationDateMounth >12)
        {
            throw new IllegalArgumentException("Expiration Mounth should be between January(1) and December(12).");
        }
        if(expirationDateYear<2021 || expirationDateYear>2030)
        {
            throw new IllegalArgumentException("Expiration Year should be between 2021 and 2030.");
        }
        if(stock<0)
        {
            throw new IllegalArgumentException("Stock can not be less than 0.");
        }
        if(price<0)
        {
            throw new IllegalArgumentException("Price can not be less than 0.");
        }
        this.ID = ID;
        this.medicineType = medicineType;
        this.expirationDateMounth = expirationDateMounth;
        this.expirationDateYear = expirationDateYear;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

//Setter and getters method of our class.
    public int getID() {
        return ID;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public int getExpirationDateMounth() {
        return expirationDateMounth;
    }

    public int getExpirationDateYear() {
        return expirationDateYear;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setExpirationDateMounth(int expirationDateMounth) {
        this.expirationDateMounth = expirationDateMounth;
    }

    public void setExpirationDateYear(int expirationDateYear) {
        this.expirationDateYear = expirationDateYear;
    }

    //This is change stock method of our class. It use for changing stock information.
    public int changeStock(int x,int y)
    {
        x = x + y;
        return x;
    }
    //This is to string method of our class.
    @Override
    public String toString() {
        return getClass().getSimpleName()+
                " ID=" + getID() +
                ", medicineType='" + getMedicineType() + '\'' +
                ", expirationDateMounth=" + getExpirationDateMounth() +
                ", expirationDateYear=" + getExpirationDateYear() +
                ", name='" + getName() + '\'' +
                ", stock=" + getStock() +
                ", price=" + getPrice() +
                '}';
    }

}
