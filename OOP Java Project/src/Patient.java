/*
This is our Patient class. It has some variable for Patient information. It implements Serializable.
 */
import java.io.Serializable;

public class Patient implements Serializable {
    //Variables for Patient class.
    private int patientID;
    private String patientName;
    private String patientSurname;
    private int patientNumber;
    //This construct class of our class.It also checks whether the correct information for medicines has been entered.
    public Patient(int patientID, String patientName, String patientSurname, int patientNumber) {
        if(patientID<1000000 || patientID>9999999)
        {
            throw new IllegalArgumentException("Patient ID should be an integer with 7 digits.");
        }
        if(patientNumber<1000000 || patientNumber>9999999)
        {
            throw new IllegalArgumentException("Patient Number should be an integer with 7 digits.");
        }
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientNumber = patientNumber;
    }
    //Setter and getters method of our class.
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }
}
