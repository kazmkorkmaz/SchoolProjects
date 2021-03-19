
/*
This is our Pharmacy class. It has some variable for Pharmacy information. It implements Serializable.
 */
import java.io.Serializable;
import java.util.ArrayList;

public class Pharmacy implements Serializable {
    //Variables for Personnel class.
    private int pharmacyID;
    private String pharmacyName;
    private String pharmaLocation;
    private String system_ID;
    private String system_passaword;
    private ArrayList<Medicine> medicineList;
    private ArrayList<Personnel> personnelList;
    private ArrayList<Patient> patientList;
    //This construct class of our class.It also checks whether the correct information for medicines has been entered.
    public Pharmacy(int pharmacyID, String pharmacyName, String pharmaLocation,String system_ID, String system_passaword, ArrayList<Medicine> medicineList, ArrayList<Personnel> personnelList, ArrayList<Patient> patientList) {
        if(pharmacyID<100000 || pharmacyID>999999)
        {
            throw new IllegalArgumentException("Pharmacy ID should be an integer with 6 digits.");
        }
        this.pharmacyID = pharmacyID;
        this.pharmacyName = pharmacyName;
        this.pharmaLocation = pharmaLocation;
        this.setSystem_ID(system_ID);
        this.setSystem_passaword(system_passaword);
        this.medicineList = medicineList;
        this.personnelList = personnelList;
        this.patientList = patientList;
    }

    public Pharmacy(){
    }
    //Setter and getters method of our class.
    public void setPharmacyID(int pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public int getPharmacyID() {
        return pharmacyID;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getPharmaLocation() {
        return pharmaLocation;
    }

    public void setPharmaLocation(String pharmaLocation) {
        this.pharmaLocation = pharmaLocation;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public ArrayList<Personnel> getPersonnelList() {
        return personnelList;
    }
    public void setPersonnelList(ArrayList<Personnel> personnelList) {
        this.personnelList = personnelList;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public String getSystem_ID() {
        return system_ID;
    }

    public void setSystem_ID(String system_ID) {
        this.system_ID = system_ID;
    }

    public String getSystem_passaword() {
        return system_passaword;
    }

    public void setSystem_passaword(String system_passaword) {
        this.system_passaword = system_passaword;
    }
}

