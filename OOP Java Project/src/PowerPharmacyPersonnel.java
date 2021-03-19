/*
This class is a sub class of Personnel and implements IPersonnel methods,implements Serializable.
 */
import java.io.Serializable;

public class PowerPharmacyPersonnel extends Personnel implements IPersonnel, Serializable {
    //This is extra variable from Personnel class and it checks some of the features you must have for work in this pharmacy.
    private boolean militaryStatus;
    private int graduationAverage;
    private boolean criminalRecord;

    //This is constructor of our class and ıt use super method for extends Personnel.
    public PowerPharmacyPersonnel(int personnelID, String personnelName, String personnelSurname, String personnelGender, int personnelBirthYear, float personnelSalary, int personnelNumber, boolean militaryStatus, int graduationAverage, boolean criminalRecord) {
        super(personnelID, personnelName, personnelSurname, personnelGender, personnelBirthYear, personnelSalary, personnelNumber);

        if(militaryStatus(militaryStatus) == false)
        {
            throw new IllegalArgumentException("Personnel must perform their military service.");
        }
        if(graduationAverage(graduationAverage) == true)
        {
            throw new IllegalArgumentException("Graduation average should be between 60 and 100.");
        }
        if(criminalRecordStatus(criminalRecord) == false)
        {
            throw new IllegalArgumentException("The staff should not have any judicial record.");
        }
        this.militaryStatus = militaryStatus;
        this.graduationAverage = graduationAverage;
        this.criminalRecord = criminalRecord;
    }

    //Setter and getter methods for this class.
    public boolean isMilitaryStatus() {
        return militaryStatus;
    }

    public void setMilitaryStatus(boolean militaryStatus) {
        this.militaryStatus = militaryStatus;
    }

    public double getGraduationAverage() {
        return graduationAverage;
    }

    public void setGraduationAverage(int graduationAverage) {
        this.graduationAverage = graduationAverage;
    }

    public boolean isCriminalRecord() {
        return criminalRecord;
    }

    public void setCriminalRecord(boolean criminalRecord) {
        this.criminalRecord = criminalRecord;
    }

//This method from IPersonnel interface. It checks military status.In short, people who have not done their military duty cannot work.
    @Override
    public  boolean militaryStatus(boolean militaryStatus) {
        if (militaryStatus)
        {
            return true;
        }
        else
        {
            return false;

        }
    }
//This method from IPersonnel interface.This method checks the graduation average. Those with a graduation average of 60 to 100 can work in this pharmacy. Others cannot work.
    @Override
    public boolean graduationAverage(int graduationAverage) {
        if (graduationAverage<=60 && graduationAverage>=100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
//This method from IPersonnel interface.This method checks if the staff has a criminal record.Persons with a criminal record cannot work in this pharmacy.
    @Override
    public boolean criminalRecordStatus(boolean criminalRecord) {

       if (criminalRecord == true)
       {
           return false;
       }
       else
       {
           return true;
       }
    }
}

