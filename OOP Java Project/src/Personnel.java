/*
This is our Personnel class. It has some variable for Personnel information. It implements Serializable.
 */
import java.io.Serializable;

public class Personnel implements Serializable {
    //Variables for Personnel class.
    private int personnelID;
    private String personnelName;
    private String personnelSurname;
    private String personnelGender;
    private int personnelBirthYear;
    private float personnelSalary;
    private int personnelNumber;

    //This construct class of our class.It also checks whether the correct information for medicines has been entered.
    public Personnel(int personnelID, String personnelName, String personnelSurname, String personnelGender,
                     int personnelBirthYear, float personnelSalary, int personnelNumber) {
        if(personnelID<1000000 || personnelID >9999999)
        {
            throw new IllegalArgumentException("Personnel ID should be an integer with 7 digits.");
        }
        if(!personnelGender.equalsIgnoreCase("male")&&!personnelGender.equalsIgnoreCase("female")
                      &&!personnelGender.equalsIgnoreCase("non-binary"))
        {
            throw new IllegalArgumentException("Personnel Gender should be one of the next genders; Male, Female, Non-Binary");
        }
        if(personnelBirthYear<1940 || personnelBirthYear>2003)
        {
            throw new IllegalArgumentException("Personnel Birth Year should be between 1940 and 2003");
        }
        if(personnelSalary<2825.9)
        {
            throw new IllegalArgumentException("Personnel Salary can not be less than 2825 than 90 Kuruş.");
        }
        if(personnelNumber<1000000 || personnelNumber>9999999)
        {
            throw new IllegalArgumentException("Personnel Number should be an integer with 7 digits.");
        }

        this.personnelID = personnelID;
        this.personnelName = personnelName;
        this.personnelSurname = personnelSurname;
        this.personnelGender = personnelGender;
        this.personnelBirthYear = personnelBirthYear;
        this.personnelSalary = personnelSalary;
        this.personnelNumber = personnelNumber;

    }
    //Setter and getters method of our class.
    public int getPersonnelID() {
        return personnelID;
    }

    public void setPersonnelID(int personnelID) {
        this.personnelID = personnelID;
    }

    public String getPersonnelName() {
        return personnelName;
    }

    public void setPersonnelName(String personnelName) {
        this.personnelName = personnelName;
    }

    public String getPersonnelSurname() {
        return personnelSurname;
    }

    public void setPersonnelSurname(String personnelSurname) {
        this.personnelSurname = personnelSurname;
    }

    public String getPersonnelGender() {
        return personnelGender;
    }

    public void setPersonnelGender(String personnelGender) {
        this.personnelGender = personnelGender;
    }

    public int getPersonnelBirthYear() {
        return personnelBirthYear;
    }

    public void setPersonnelBirthYear(int personnelBirthYear) {
        this.personnelBirthYear = personnelBirthYear;
    }

    public float getPersonnelSalary() {
        return personnelSalary;
    }

    public void setPersonnelSalary(float personnelSalary) {
        this.personnelSalary = personnelSalary;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }




}
