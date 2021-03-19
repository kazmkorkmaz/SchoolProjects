/*
*This class our main form class.
*When we log in with the username and password, this screen appears.
*And here we are doing operations such as selling medicines, controlling the medicine stocks, some personnel operations,etc.
* This class also extends JFrame for using its some features.
*/

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class MainForm extends JFrame{
    //Some of variable and components of our class.
    private JPanel MainPanel;
    private JTabbedPane PharmacyHome;
    private JButton MedicineSale;
    private JPanel MedicineSalePanel;
    private JTextField textFieldTC;
    private JTextField textFieldName;
    private JTextField textFieldSurname;
    private JTextField textFieldTelNumber;
    private JTextField textFieldCount;
    private JTextField textFieldPrice;
    private JComboBox comboBoxCategory;
    private JComboBox comboBoxName;
    private JButton showPriceButton;
    private JButton calculateTotalPriceButton;
    private JButton medicineAddButton;
    private JButton listPatientsButton;
    private JButton clearPatientButton;
    private JButton clearMedicineButton;
    private JButton showPatientButton;
    private JButton confirmSaleButton;
    private JTable table1;
    private JPanel ButtonPanelStock;
    private JPanel StockInfo;
    private JPanel MedicineOrder;
    private JPanel RequestFields;
    private JPanel RequestButtons;
    private JComboBox comboBoxCategoryOrder;
    private JComboBox comboBoxOrderName;
    private JTextField textFieldCountOrder;
    private JButton listButton;
    private JButton addMedicineButton;
    private JButton clearButton;
    private JButton showEmergencyNeedsButton;
    private JButton showStockButton;
    private JButton showPersonelInfoButton;
    private JButton showPharmacyInfoButton;
    private JTable tableSaleInfo;
    private JTable tableStokInfo;
    private JTable tableEmergencyNeeds;
    private JTable tablePersonelInfo;
    private JTable tablePharmacy;
    private JTable tableMedicineOrder;
    private JButton sendOrderButton;
    public JComboBox comboBoxPharmacy;
    private JButton clearListButton;
    private JTextField textFieldTotalPrice;
    private JButton addPersonnelButton;
    private JTextField textFieldPersonnelID;
    private JTextField textFieldPersonnelName;
    private JTextField textFieldPersonnelSurname;
    private JComboBox comboBoxPersonnelGender;
    private JTextField textFieldPersonnelBirthYear;
    private JTextField textFieldPersonnelSalary;
    private JTextField textFieldPersonnelTelNumber;
    private JCheckBox completedCheckBox;
    private JTextField textFieldPersonnelGraduationAverage;
    private JCheckBox personnelHasACriminalCheckBox;
    private JButton clearButton1;
    private JButton deletePersonnelButton;
    private JComboBox comboBoxDeletedPersonnel;
    private boolean controller = true;
    private boolean controller1 = true;
    private boolean controller2 = true;
    private boolean controller3 = true;

//This is constructor of our MainForm class.
    public MainForm() {
        add(MainPanel);
        setSize(1440, 720);


        // These are some objects from Painkiller class. We create and add painkillerArrayList.
        Painkiller minoset = new Painkiller(12345, "Tablet", 5, 2025, "Minoset", 100, 6, 150, 30);
        Painkiller parol = new Painkiller(21215, "Tablet", 6, 2026, "Parol", 75, 7, 125, 50);
        Painkiller calpol = new Painkiller(12457, "Syrup", 4, 2022, "Calpol", 80, 12, 175, 60);
        Painkiller aferin = new Painkiller(14785, "Syrup", 7, 2021, "A-Ferin", 60, 10, 100, 10);

        ArrayList<Painkiller> painkillerArrayList = new ArrayList<Painkiller>();
        painkillerArrayList.add(minoset);
        painkillerArrayList.add(parol);
        painkillerArrayList.add(calpol);
        painkillerArrayList.add(aferin);

        // These are some objects from Cold class. We create and add coldArrayList.
        Cold corsal = new Cold(14798, "Tablet", 7, 2023, "Corsal", 15, 75, "Child");
        Cold katarin = new Cold(14798, "Tablet", 8, 2024, "Katarin", 25, 10, "Teenager");
        Cold butirol = new Cold(13265, "Syrup", 9, 2022, "Butirol", 35, 25, "Middle-Age");
        Cold levoprant = new Cold(13245, "Syrup", 10, 2024, "Levoprant", 40, 17, "Old People");

        ArrayList<Cold> coldArrayList = new ArrayList<Cold>();
        coldArrayList.add(corsal);
        coldArrayList.add(katarin);
        coldArrayList.add(butirol);
        coldArrayList.add(levoprant);

        // These are some objects from MuscleRelaxants class. We create and add muscleRelaxantsArrayList.
        MuscleRelaxants dikloron = new MuscleRelaxants(14781, "Tablet", 3, 2022, "Dikloron", 50, 37, 50);
        MuscleRelaxants akineton = new MuscleRelaxants(14589, "Tablet", 4, 2023, "Akineton", 30, 14, 60);
        MuscleRelaxants nimes = new MuscleRelaxants(10246, "Cream", 6, 2024, "Nimes", 70, 23, 75);
        MuscleRelaxants muscotlex = new MuscleRelaxants(14368, "Ampul", 5, 2029, "Muscotlex", 50, 29, 95);

        ArrayList<MuscleRelaxants> muscleRelaxantsArrayList = new ArrayList<MuscleRelaxants>();
        muscleRelaxantsArrayList.add(dikloron);
        muscleRelaxantsArrayList.add(akineton);
        muscleRelaxantsArrayList.add(nimes);
        muscleRelaxantsArrayList.add(muscotlex);

        // These are some objects from Antidepressant class. We create and add antidepressantArrayList.
        Antidepressant misol = new Antidepressant(17896, "Tablet", 4, 2022, "Misol", 45, 13, true);
        Antidepressant lustral = new Antidepressant(12957, "Tablet", 8, 2021, "Lustral", 15, 9, false);
        Antidepressant selectra = new Antidepressant(12578, "Tablet", 12, 2023, "Selectra", 25, 11, true);
        Antidepressant serveta = new Antidepressant(13687, "Tablet", 1, 2028, "Serveta", 17, 25, true);

        ArrayList<Antidepressant> antidepressantArrayList = new ArrayList<Antidepressant>();
        antidepressantArrayList.add(misol);
        antidepressantArrayList.add(lustral);
        antidepressantArrayList.add(selectra);
        antidepressantArrayList.add(serveta);

        // These are some objects from Dermatological class. We create and add dermatologicalArrayList.
        Dermatological avil = new Dermatological(19875, "Cream", 2, 2024, "Avil", 15, 65, "Hand");
        Dermatological fenistol = new Dermatological(19784, "Cream", 4, 2022, "Fenistol", 14, 95, "Face");
        Dermatological precort = new Dermatological(19587, "Ampul", 3, 2026, "Precort", 31, 78, "Body");
        Dermatological sinakort = new Dermatological(19654, "Ampul", 7, 2028, "Sinakort", 43, 45, "Body");

        ArrayList<Dermatological> dermatologicalArrayList = new ArrayList<Dermatological>();
        dermatologicalArrayList.add(avil);
        dermatologicalArrayList.add(fenistol);
        dermatologicalArrayList.add(precort);
        dermatologicalArrayList.add(sinakort);

        // These are some objects from Vitamin class. We create and add vitaminArrayList.
        Vitamin supradyn = new Vitamin(17463, "Tablet", 1, 2025, "Supradyn", 15, 70, "A");
        Vitamin sunlife = new Vitamin(17489, "Tablet", 2, 2024, "Sunlife", 10, 75, "D");
        Vitamin oneupmultivitamin = new Vitamin(17456, "Capsule", 7, 2023, "Oneupmultivitamin", 20, 80, "Multivitamin");
        Vitamin centrumadvencevitamin = new Vitamin(17432, "Capsule", 4, 2023, "Centrumadvencevitamin", 25, 70, "C");

        ArrayList<Vitamin> vitaminArrayList = new ArrayList<Vitamin>();
        vitaminArrayList.add(supradyn);
        vitaminArrayList.add(sunlife);
        vitaminArrayList.add(oneupmultivitamin);
        vitaminArrayList.add(centrumadvencevitamin);

        // These are some objects from Vaccine class. We create and add vaccineArrayList.
        Vaccine tetanus = new Vaccine(10001, "Liquid", 4, 2021, "Tetanus", 10, 100, "mRNA");
        Vaccine measles = new Vaccine(10021, "Liquid", 5, 2022, "Measles", 5, 125, "Vector");
        Vaccine influenza = new Vaccine(10101, "Liquid", 12, 2023, "Influenza", 15, 150, "mRNA");
        Vaccine Covid19 = new Vaccine(10151, "Liquid", 11, 2025, "Covid19", 3000, 1, "Vector");

        ArrayList<Vaccine> vaccineArrayList = new ArrayList<Vaccine>();
        vaccineArrayList.add(tetanus);
        vaccineArrayList.add(measles);
        vaccineArrayList.add(influenza);
        vaccineArrayList.add(Covid19);

        // These are some objects from Antibiotic class. We create and add antibioticArrayList.
        Antibiotic amoklavinbid = new Antibiotic(20145, "Tablet", 12, 2022, "Amoklavin-bid", 15, 10, false);
        Antibiotic bactrim = new Antibiotic(20001, "Tablet", 11, 2023, "Bactrim", 15, 15, true);
        Antibiotic iespor = new Antibiotic(21475, "Flacon", 12, 2025, "Iespor", 5, 47, true);
        Antibiotic linkomisin = new Antibiotic(20147, "Ampul", 2, 2022, "Linkomisin", 17, 13, false);

        ArrayList<Antibiotic> antibioticArrayList = new ArrayList<Antibiotic>();
        antibioticArrayList.add(amoklavinbid);
        antibioticArrayList.add(bactrim);
        antibioticArrayList.add(iespor);
        antibioticArrayList.add(linkomisin);

        // These are some objects from Carvedilol class. We create and add carvedilolArrayList.
        Carvedilol libavitk = new Carvedilol(25789, "Ampul", 8, 2022, "Libavit-k", 21, 15, true);
        Carvedilol daflon = new Carvedilol(25784, "Tablet", 9, 2025, "Daflon", 43, 15, true);
        Carvedilol proctolog = new Carvedilol(25654, "Cream", 7, 2024, "Proctolog", 15, 12, false);
        Carvedilol hirudoid = new Carvedilol(25749, "Cream", 6, 2023, "Hirudoid", 10, 13, false);

        ArrayList<Carvedilol> carvedilolArrayList = new ArrayList<Carvedilol>();
        carvedilolArrayList.add(libavitk);
        carvedilolArrayList.add(daflon);
        carvedilolArrayList.add(proctolog);
        carvedilolArrayList.add(hirudoid);

        //In this point we are checking allMedicines.ser file. If it exists using it. Otherwise we create and add objects.
        File allMedicinesList = new File("allMedicines.ser");
        ArrayList<Medicine> allMedicine = null;
        if(allMedicinesList.exists())
        {
            try {

                FileInputStream fileInputStream = new FileInputStream("allMedicines.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                try {
                    allMedicine= (ArrayList<Medicine>) objectInputStream.readObject();

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            ArrayList<Medicine> allMedicines = new ArrayList<Medicine>();
            allMedicines.add(libavitk);
            allMedicines.add(daflon);
            allMedicines.add(proctolog);
            allMedicines.add(hirudoid);
            allMedicines.add(amoklavinbid);
            allMedicines.add(bactrim);
            allMedicines.add(iespor);
            allMedicines.add(linkomisin);
            allMedicines.add(tetanus);
            allMedicines.add(measles);
            allMedicines.add(influenza);
            allMedicines.add(Covid19);
            allMedicines.add(supradyn);
            allMedicines.add(sunlife);
            allMedicines.add(oneupmultivitamin);
            allMedicines.add(centrumadvencevitamin);
            allMedicines.add(avil);
            allMedicines.add(fenistol);
            allMedicines.add(precort);
            allMedicines.add(sinakort);
            allMedicines.add(misol);
            allMedicines.add(lustral);
            allMedicines.add(selectra);
            allMedicines.add(serveta);
            allMedicines.add(dikloron);
            allMedicines.add(akineton);
            allMedicines.add(nimes);
            allMedicines.add(muscotlex);
            allMedicines.add(corsal);
            allMedicines.add(katarin);
            allMedicines.add(butirol);
            allMedicines.add(levoprant);
            allMedicines.add(minoset);
            allMedicines.add(parol);
            allMedicines.add(calpol);
            allMedicines.add(aferin);
            try {
                FileOutputStream fileOut = new FileOutputStream("allMedicines.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(allMedicines);
                out.close();
                fileOut.close();


            } catch (IOException i) {
                i.printStackTrace();
            }

        }
        //In this point we are checking powerPharmacyMedicineList.ser file. If it exists using it. Otherwise we create and add objects.
        File powerPharmacyMedicineListFile = new File("powerPharmacyMedicineList.ser");
        ArrayList<Medicine> powerPharmacyMedicineLists = null;
        if (powerPharmacyMedicineListFile.exists())
        {
            try {

                FileInputStream fileInputStream = new FileInputStream("powerPharmacyMedicineList.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                try {
                    powerPharmacyMedicineLists= (ArrayList<Medicine>) objectInputStream.readObject();

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            Painkiller minoset1 = new Painkiller(12345, "Tablet", 5, 2025, "Minoset", 50, 6, 150, 30);
            Painkiller parol1 = new Painkiller(21215, "Tablet", 6, 2026, "Parol", 75, 7, 125, 50);
            Painkiller calpol1 = new Painkiller(12457, "Syrup", 4, 2022, "Calpol", 80, 12, 175, 60);
            Painkiller aferin1 = new Painkiller(14785, "Syrup", 7, 2021, "A-Ferin", 60, 10, 100, 10);
            Cold corsal1 = new Cold(14798, "Tablet", 7, 2023, "Corsal", 15, 75, "Child");
            Cold katarin1 = new Cold(14798, "Tablet", 8, 2024, "Katarin", 25, 10, "Teenager");
            Cold butirol1 = new Cold(13265, "Syrup", 9, 2022, "Butirol", 35, 25, "Middle-Age");
            Cold levoprant1 = new Cold(13245, "Syrup", 10, 2024, "Levoprant", 40, 17, "Old People");
            MuscleRelaxants dikloron1 = new MuscleRelaxants(14781, "Tablet", 3, 2022, "Dikloron", 50, 37, 50);
            MuscleRelaxants akineton1= new MuscleRelaxants(14589, "Tablet", 4, 2023, "Akineton", 30, 14, 60);
            MuscleRelaxants nimes1 = new MuscleRelaxants(10246, "Cream", 6, 2024, "Nimes", 70, 23, 75);
            MuscleRelaxants muscotlex1 = new MuscleRelaxants(14368, "Ampul", 5, 2029, "Muscotlex", 50, 29, 95);
            Antidepressant misol1 = new Antidepressant(17896, "Tablet", 4, 2022, "Misol", 45, 13, true);
            Antidepressant lustral1 = new Antidepressant(12957, "Tablet", 8, 2021, "Lustral", 15, 9, false);
            Antidepressant selectra1 = new Antidepressant(12578, "Tablet", 12, 2023, "Selectra", 25, 11, true);
            Antidepressant serveta1 = new Antidepressant(13687, "Tablet", 1, 2028, "Serveta", 17, 25, true);
            Dermatological avil1 = new Dermatological(19875, "Cream", 2, 2024, "Avil", 15, 65, "Hand");
            Dermatological fenistol1 = new Dermatological(19784, "Cream", 4, 2022, "Fenistol", 14, 95, "Face");
            Dermatological precort1 = new Dermatological(19587, "Ampul", 3, 2026, "Precort", 31, 78, "Body");
            Dermatological sinakort1 = new Dermatological(19654, "Ampul", 7, 2028, "Sinakort", 43, 45, "Body");
            Vitamin supradyn1 = new Vitamin(17463, "Tablet", 1, 2025, "Supradyn", 15, 70, "A");
            Vitamin sunlife1 = new Vitamin(17489, "Tablet", 2, 2024, "Sunlife", 10, 75, "D");
            Vitamin oneupmultivitamin1 = new Vitamin(17456, "Capsule", 7, 2023, "Oneupmultivitamin", 20, 80, "Multivitamin");
            Vitamin centrumadvencevitamin1 = new Vitamin(17432, "Capsule", 4, 2023, "Centrumadvencevitamin", 25, 70, "C");
            Vaccine tetanus1 = new Vaccine(10001, "Liquid", 4, 2021, "Tetanus", 10, 100, "mRNA");
            Vaccine measles1 = new Vaccine(10021, "Liquid", 5, 2022, "Measles", 5, 125, "Vector");
            Vaccine influenza1 = new Vaccine(10101, "Liquid", 12, 2023, "Influenza", 15, 150, "mRNA");
            Vaccine Covid191 = new Vaccine(10151, "Liquid", 11, 2025, "Covid19", 3000, 1, "Vector");
            Antibiotic amoklavinbid1 = new Antibiotic(20145, "Tablet", 12, 2022, "Amoklavin-bid", 15, 10, false);
            Antibiotic bactrim1 = new Antibiotic(20001, "Tablet", 11, 2023, "Bactrim", 15, 15, true);
            Antibiotic iespor1 = new Antibiotic(21475, "Flacon", 12, 2025, "Iespor", 5, 47, true);
            Antibiotic linkomisin1 = new Antibiotic(20147, "Ampul", 2, 2022, "Linkomisin", 17, 13, false);
            Carvedilol libavitk1 = new Carvedilol(25789, "Ampul", 8, 2022, "Libavit-k", 21, 15, true);
            Carvedilol daflon1 = new Carvedilol(25784, "Tablet", 9, 2025, "Daflon", 43, 15, true);
            Carvedilol proctolog1 = new Carvedilol(25654, "Cream", 7, 2024, "Proctolog", 15, 12, false);
            Carvedilol hirudoid1 = new Carvedilol(25749, "Cream", 6, 2023, "Hirudoid", 10, 13, false);

            ArrayList<Medicine> powerPharmacyMedicineList = new ArrayList<Medicine>();
            powerPharmacyMedicineList.add(libavitk1);
            powerPharmacyMedicineList.add(daflon1);
            powerPharmacyMedicineList.add(proctolog1);
            powerPharmacyMedicineList.add(hirudoid1);
            powerPharmacyMedicineList.add(amoklavinbid1);
            powerPharmacyMedicineList.add(bactrim1);
            powerPharmacyMedicineList.add(iespor1);
            powerPharmacyMedicineList.add(linkomisin1);
            powerPharmacyMedicineList.add(tetanus1);
            powerPharmacyMedicineList.add(measles1);
            powerPharmacyMedicineList.add(influenza1);
            powerPharmacyMedicineList.add(Covid191);
            powerPharmacyMedicineList.add(supradyn1);
            powerPharmacyMedicineList.add(sunlife1);
            powerPharmacyMedicineList.add(oneupmultivitamin1);
            powerPharmacyMedicineList.add(centrumadvencevitamin1);
            powerPharmacyMedicineList.add(avil1);
            powerPharmacyMedicineList.add(fenistol1);
            powerPharmacyMedicineList.add(precort1);
            powerPharmacyMedicineList.add(sinakort1);
            powerPharmacyMedicineList.add(misol1);
            powerPharmacyMedicineList.add(lustral1);
            powerPharmacyMedicineList.add(selectra1);
            powerPharmacyMedicineList.add(serveta1);
            powerPharmacyMedicineList.add(dikloron1);
            powerPharmacyMedicineList.add(akineton1);
            powerPharmacyMedicineList.add(nimes1);
            powerPharmacyMedicineList.add(muscotlex1);
            powerPharmacyMedicineList.add(corsal1);
            powerPharmacyMedicineList.add(katarin1);
            powerPharmacyMedicineList.add(butirol1);
            powerPharmacyMedicineList.add(levoprant1);
            powerPharmacyMedicineList.add(minoset1);
            powerPharmacyMedicineList.add(parol1);
            powerPharmacyMedicineList.add(calpol1);
            powerPharmacyMedicineList.add(aferin1);
            try {
                FileOutputStream fileOut = new FileOutputStream("powerPharmacyMedicineList.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(powerPharmacyMedicineList);
                out.close();
                fileOut.close();


            } catch (IOException i) {
                i.printStackTrace();
            }
        }
        //In this point we are checking succeedPharmacyMedicineList.ser file. If it exists using it. Otherwise we create and add objects.
        File succeedPharmacyMedicineListFile  =new File("succeedPharmacyMedicineList.ser");
        ArrayList<Medicine> succeedPharmacyMedicineLists  = null;;
        if (succeedPharmacyMedicineListFile.exists())
        {
            try {

                FileInputStream fileInputStream = new FileInputStream("succeedPharmacyMedicineList.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                try {
                    succeedPharmacyMedicineLists= (ArrayList<Medicine>) objectInputStream.readObject();

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                Painkiller minoset1 = new Painkiller(12345, "Tablet", 5, 2025, "Minoset", 60, 6, 150, 30);
                Painkiller parol1 = new Painkiller(21215, "Tablet", 6, 2026, "Parol", 15, 7, 125, 50);
                Painkiller calpol1 = new Painkiller(12457, "Syrup", 4, 2022, "Calpol", 45, 12, 175, 60);
                Painkiller aferin1 = new Painkiller(14785, "Syrup", 7, 2021, "A-Ferin", 65, 10, 100, 10);
                Cold corsal1 = new Cold(14798, "Tablet", 7, 2023, "Corsal", 15, 78, "Child");
                Cold katarin1 = new Cold(14798, "Tablet", 8, 2024, "Katarin", 25, 45, "Teenager");
                Cold butirol1 = new Cold(13265, "Syrup", 9, 2022, "Butirol", 35, 75, "Middle-Age");
                Cold levoprant1 = new Cold(13245, "Syrup", 10, 2024, "Levoprant", 40, 95, "Old People");
                MuscleRelaxants dikloron1 = new MuscleRelaxants(14781, "Tablet", 3, 2022, "Dikloron", 100, 37, 50);
                MuscleRelaxants akineton1= new MuscleRelaxants(14589, "Tablet", 4, 2023, "Akineton", 300, 14, 60);
                MuscleRelaxants nimes1 = new MuscleRelaxants(10246, "Cream", 6, 2024, "Nimes", 75, 23, 75);
                MuscleRelaxants muscotlex1 = new MuscleRelaxants(14368, "Ampul", 5, 2029, "Muscotlex", 10, 29, 95);
                Antidepressant misol1 = new Antidepressant(17896, "Tablet", 4, 2022, "Misol", 55, 13, true);
                Antidepressant lustral1 = new Antidepressant(12957, "Tablet", 8, 2021, "Lustral", 15, 9, false);
                Antidepressant selectra1 = new Antidepressant(12578, "Tablet", 12, 2023, "Selectra", 45, 11, true);
                Antidepressant serveta1 = new Antidepressant(13687, "Tablet", 1, 2028, "Serveta", 15, 25, true);
                Dermatological avil1 = new Dermatological(19875, "Cream", 2, 2024, "Avil", 15, 25, "Hand");
                Dermatological fenistol1 = new Dermatological(19784, "Cream", 4, 2022, "Fenistol", 19, 95, "Face");
                Dermatological precort1 = new Dermatological(19587, "Ampul", 3, 2026, "Precort", 35, 78, "Body");
                Dermatological sinakort1 = new Dermatological(19654, "Ampul", 7, 2028, "Sinakort", 43, 45, "Body");
                Vitamin supradyn1 = new Vitamin(17463, "Tablet", 1, 2025, "Supradyn", 15, 75, "A");
                Vitamin sunlife1 = new Vitamin(17489, "Tablet", 2, 2024, "Sunlife", 10, 80, "D");
                Vitamin oneupmultivitamin1 = new Vitamin(17456, "Capsule", 7, 2023, "Oneupmultivitamin", 75, 80, "Multivitamin");
                Vitamin centrumadvencevitamin1 = new Vitamin(17432, "Capsule", 4, 2023, "Centrumadvencevitamin", 55, 70, "C");
                Vaccine tetanus1 = new Vaccine(10001, "Liquid", 4, 2021, "Tetanus", 50, 100, "mRNA");
                Vaccine measles1 = new Vaccine(10021, "Liquid", 5, 2022, "Measles", 50, 125, "Vector");
                Vaccine influenza1 = new Vaccine(10101, "Liquid", 12, 2023, "Influenza", 55, 150, "mRNA");
                Vaccine Covid191 = new Vaccine(10151, "Liquid", 11, 2025, "Covid19", 6000, 1, "Vector");
                Antibiotic amoklavinbid1 = new Antibiotic(20145, "Tablet", 12, 2022, "Amoklavin-bid", 10, 10, false);
                Antibiotic bactrim1 = new Antibiotic(20001, "Tablet", 11, 2023, "Bactrim", 95, 15, true);
                Antibiotic iespor1 = new Antibiotic(21475, "Flacon", 12, 2025, "Iespor", 15, 47, true);
                Antibiotic linkomisin1 = new Antibiotic(20147, "Ampul", 2, 2022, "Linkomisin", 78, 13, false);
                Carvedilol libavitk1 = new Carvedilol(25789, "Ampul", 8, 2022, "Libavit-k", 95, 15, true);
                Carvedilol daflon1 = new Carvedilol(25784, "Tablet", 9, 2025, "Daflon", 45, 15, true);
                Carvedilol proctolog1 = new Carvedilol(25654, "Cream", 7, 2024, "Proctolog", 5, 12, false);
                Carvedilol hirudoid1 = new Carvedilol(25749, "Cream", 6, 2023, "Hirudoid", 85, 13, false);

                ArrayList<Medicine> succeedPharmacyMedicineList = new ArrayList<Medicine>();
                succeedPharmacyMedicineList.add(libavitk1);
                succeedPharmacyMedicineList.add(daflon1);
                succeedPharmacyMedicineList.add(proctolog1);
                succeedPharmacyMedicineList.add(hirudoid1);
                succeedPharmacyMedicineList.add(amoklavinbid1);
                succeedPharmacyMedicineList.add(bactrim1);
                succeedPharmacyMedicineList.add(iespor1);
                succeedPharmacyMedicineList.add(linkomisin1);
                succeedPharmacyMedicineList.add(tetanus1);
                succeedPharmacyMedicineList.add(measles1);
                succeedPharmacyMedicineList.add(influenza1);
                succeedPharmacyMedicineList.add(Covid191);
                succeedPharmacyMedicineList.add(supradyn1);
                succeedPharmacyMedicineList.add(sunlife1);
                succeedPharmacyMedicineList.add(oneupmultivitamin1);
                succeedPharmacyMedicineList.add(centrumadvencevitamin1);
                succeedPharmacyMedicineList.add(avil1);
                succeedPharmacyMedicineList.add(fenistol1);
                succeedPharmacyMedicineList.add(precort1);
                succeedPharmacyMedicineList.add(sinakort1);
                succeedPharmacyMedicineList.add(misol1);
                succeedPharmacyMedicineList.add(lustral1);
                succeedPharmacyMedicineList.add(selectra1);
                succeedPharmacyMedicineList.add(serveta1);
                succeedPharmacyMedicineList.add(dikloron1);
                succeedPharmacyMedicineList.add(akineton1);
                succeedPharmacyMedicineList.add(nimes1);
                succeedPharmacyMedicineList.add(muscotlex1);
                succeedPharmacyMedicineList.add(corsal1);
                succeedPharmacyMedicineList.add(katarin1);
                succeedPharmacyMedicineList.add(butirol1);
                succeedPharmacyMedicineList.add(levoprant1);
                succeedPharmacyMedicineList.add(minoset1);
                succeedPharmacyMedicineList.add(parol1);
                succeedPharmacyMedicineList.add(calpol1);
                succeedPharmacyMedicineList.add(aferin1);
                FileOutputStream fileOut = new FileOutputStream("succeedPharmacyMedicineList.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(succeedPharmacyMedicineList);
                out.close();
                fileOut.close();


            } catch (IOException i) {
                i.printStackTrace();
            }

        }
        //In this point we are checking fearlessPharmacyMedicineList.ser file. If it exists using it. Otherwise we create and add objects.
        File fearlessPharmacyMedicineListFile = new File("fearlessPharmacyMedicineList.ser");
        ArrayList<Medicine> fearlessPharmacyMedicineLists = null;
        if (fearlessPharmacyMedicineListFile.exists())
        {
            try {

                FileInputStream fileInputStream = new FileInputStream("fearlessPharmacyMedicineList.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                try {
                    fearlessPharmacyMedicineLists= (ArrayList<Medicine>) objectInputStream.readObject();

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                Painkiller minoset1 = new Painkiller(12345, "Tablet", 5, 2025, "Minoset", 10, 6, 150, 30);
                Painkiller parol1 = new Painkiller(21215, "Tablet", 6, 2026, "Parol", 55, 7, 125, 50);
                Painkiller calpol1 = new Painkiller(12457, "Syrup", 4, 2022, "Calpol", 75, 12, 175, 60);
                Painkiller aferin1 = new Painkiller(14785, "Syrup", 7, 2021, "A-Ferin", 90, 10, 100, 10);
                Cold corsal1 = new Cold(14798, "Tablet", 7, 2023, "Corsal", 15, 95, "Child");
                Cold katarin1 = new Cold(14798, "Tablet", 8, 2024, "Katarin", 25, 58, "Teenager");
                Cold butirol1 = new Cold(13265, "Syrup", 9, 2022, "Butirol", 35, 95, "Middle-Age");
                Cold levoprant1 = new Cold(13245, "Syrup", 10, 2024, "Levoprant", 40, 75, "Old People");
                MuscleRelaxants dikloron1 = new MuscleRelaxants(14781, "Tablet", 3, 2022, "Dikloron", 35, 37, 50);
                MuscleRelaxants akineton1= new MuscleRelaxants(14589, "Tablet", 4, 2023, "Akineton", 45, 14, 60);
                MuscleRelaxants nimes1 = new MuscleRelaxants(10246, "Cream", 6, 2024, "Nimes", 75, 23, 75);
                MuscleRelaxants muscotlex1 = new MuscleRelaxants(14368, "Ampul", 5, 2029, "Muscotlex", 65, 29, 95);
                Antidepressant misol1 = new Antidepressant(17896, "Tablet", 4, 2022, "Misol", 15, 13, true);
                Antidepressant lustral1 = new Antidepressant(12957, "Tablet", 8, 2021, "Lustral", 45, 9, false);
                Antidepressant selectra1 = new Antidepressant(12578, "Tablet", 12, 2023, "Selectra", 25, 11, true);
                Antidepressant serveta1 = new Antidepressant(13687, "Tablet", 1, 2028, "Serveta", 60, 25, true);
                Dermatological avil1 = new Dermatological(19875, "Cream", 2, 2024, "Avil", 15, 40, "Hand");
                Dermatological fenistol1 = new Dermatological(19784, "Cream", 4, 2022, "Fenistol", 15, 95, "Face");
                Dermatological precort1 = new Dermatological(19587, "Ampul", 3, 2026, "Precort", 35, 78, "Body");
                Dermatological sinakort1 = new Dermatological(19654, "Ampul", 7, 2028, "Sinakort", 19, 45, "Body");
                Vitamin supradyn1 = new Vitamin(17463, "Tablet", 1, 2025, "Supradyn", 31, 70, "A");
                Vitamin sunlife1 = new Vitamin(17489, "Tablet", 2, 2024, "Sunlife", 25, 75, "D");
                Vitamin oneupmultivitamin1 = new Vitamin(17456, "Capsule", 7, 2023, "Oneupmultivitamin", 24, 80, "Multivitamin");
                Vitamin centrumadvencevitamin1 = new Vitamin(17432, "Capsule", 4, 2023, "Centrumadvencevitamin", 25, 70, "C");
                Vaccine tetanus1 = new Vaccine(10001, "Liquid", 4, 2021, "Tetanus", 23, 100, "mRNA");
                Vaccine measles1 = new Vaccine(10021, "Liquid", 5, 2022, "Measles", 54, 125, "Vector");
                Vaccine influenza1 = new Vaccine(10101, "Liquid", 12, 2023, "Influenza", 17, 150, "mRNA");
                Vaccine Covid191 = new Vaccine(10151, "Liquid", 11, 2025, "Covid19", 9000, 1, "Vector");
                Antibiotic amoklavinbid1 = new Antibiotic(20145, "Tablet", 12, 2022, "Amoklavin-bid", 17, 10, false);
                Antibiotic bactrim1 = new Antibiotic(20001, "Tablet", 11, 2023, "Bactrim", 54, 15, true);
                Antibiotic iespor1 = new Antibiotic(21475, "Flacon", 12, 2025, "Iespor", 78, 47, true);
                Antibiotic linkomisin1 = new Antibiotic(20147, "Ampul", 2, 2022, "Linkomisin", 95, 13, false);
                Carvedilol libavitk1 = new Carvedilol(25789, "Ampul", 8, 2022, "Libavit-k", 51, 15, true);
                Carvedilol daflon1 = new Carvedilol(25784, "Tablet", 9, 2025, "Daflon", 17, 15, true);
                Carvedilol proctolog1 = new Carvedilol(25654, "Cream", 7, 2024, "Proctolog", 92, 12, false);
                Carvedilol hirudoid1 = new Carvedilol(25749, "Cream", 6, 2023, "Hirudoid", 85, 13, false);

                ArrayList<Medicine> fearlessPharmacyMedicineList = new ArrayList<Medicine>();
                fearlessPharmacyMedicineList.add(libavitk1);
                fearlessPharmacyMedicineList.add(daflon1);
                fearlessPharmacyMedicineList.add(proctolog1);
                fearlessPharmacyMedicineList.add(hirudoid1);
                fearlessPharmacyMedicineList.add(amoklavinbid1);
                fearlessPharmacyMedicineList.add(bactrim1);
                fearlessPharmacyMedicineList.add(iespor1);
                fearlessPharmacyMedicineList.add(linkomisin1);
                fearlessPharmacyMedicineList.add(tetanus1);
                fearlessPharmacyMedicineList.add(measles1);
                fearlessPharmacyMedicineList.add(influenza1);
                fearlessPharmacyMedicineList.add(Covid191);
                fearlessPharmacyMedicineList.add(supradyn1);
                fearlessPharmacyMedicineList.add(sunlife1);
                fearlessPharmacyMedicineList.add(oneupmultivitamin1);
                fearlessPharmacyMedicineList.add(centrumadvencevitamin1);
                fearlessPharmacyMedicineList.add(avil1);
                fearlessPharmacyMedicineList.add(fenistol1);
                fearlessPharmacyMedicineList.add(precort1);
                fearlessPharmacyMedicineList.add(sinakort1);
                fearlessPharmacyMedicineList.add(misol1);
                fearlessPharmacyMedicineList.add(lustral1);
                fearlessPharmacyMedicineList.add(selectra1);
                fearlessPharmacyMedicineList.add(serveta1);
                fearlessPharmacyMedicineList.add(dikloron1);
                fearlessPharmacyMedicineList.add(akineton1);
                fearlessPharmacyMedicineList.add(nimes1);
                fearlessPharmacyMedicineList.add(muscotlex1);
                fearlessPharmacyMedicineList.add(corsal1);
                fearlessPharmacyMedicineList.add(katarin1);
                fearlessPharmacyMedicineList.add(butirol1);
                fearlessPharmacyMedicineList.add(levoprant1);
                fearlessPharmacyMedicineList.add(minoset1);
                fearlessPharmacyMedicineList.add(parol1);
                fearlessPharmacyMedicineList.add(calpol1);
                fearlessPharmacyMedicineList.add(aferin1);
                FileOutputStream fileOut = new FileOutputStream("fearlessPharmacyMedicineList.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(fearlessPharmacyMedicineList);
                out.close();
                fileOut.close();
            } catch (IOException i) {
                i.printStackTrace();
            }
        }




        //In this point we are checking powerPharmacyPersonnelList.ser file. If it exists using it. Otherwise we create and add objects.
        File powerPharmacyPersonnelListFile = new File("powerPharmacyPersonnelList.ser");
        ArrayList<Personnel> PowerPharmacyPersonnels = null;
        if (powerPharmacyPersonnelListFile.exists()) {
            try {

                FileInputStream fileInputStream = new FileInputStream("powerPharmacyPersonnelList.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                try {
                    PowerPharmacyPersonnels = (ArrayList<Personnel>) objectInputStream.readObject();

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            PowerPharmacyPersonnel powerPharmacyPersonnel1 = new PowerPharmacyPersonnel(7854213, "Faruk", "Güç", "Male", 1999, 6000, 4689218, true, 65, false);
            PowerPharmacyPersonnel powerPharmacyPersonnel2 = new PowerPharmacyPersonnel(8769325, "Zeynep", "Kuşçu", "Female", 1997, 4500, 6589421, true, 85, false);
            PowerPharmacyPersonnel powerPharmacyPersonnel3 = new PowerPharmacyPersonnel(2154879, "Mert", "Bakan", "Non-Binary", 1992, 3500, 4876524, true, 90, false);
            PowerPharmacyPersonnel powerPharmacyPersonnel4 = new PowerPharmacyPersonnel(6523879, "Hande", "Gözlemci", "Female", 1993, 3500, 4567812, true, 70, false);

            ArrayList<Personnel> powerPharmacyPersonnelList = new ArrayList<Personnel>();
            powerPharmacyPersonnelList.add(powerPharmacyPersonnel1);
            powerPharmacyPersonnelList.add(powerPharmacyPersonnel2);
            powerPharmacyPersonnelList.add(powerPharmacyPersonnel3);
            powerPharmacyPersonnelList.add(powerPharmacyPersonnel4);

            try {
                FileOutputStream fileOut = new FileOutputStream("powerPharmacyPersonnelList.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(powerPharmacyPersonnelList);
                out.close();
                fileOut.close();


            } catch (IOException i) {
                i.printStackTrace();
            }
        }

        //In this point we are checking successPharmacyPersonnelList.ser file. If it exists using it. Otherwise we create and add objects.
        File successPharmacyPersonnelListFile = new File("successPharmacyPersonnelList.ser");
        ArrayList<Personnel> successPharmacyPersonnels =null;
        if (successPharmacyPersonnelListFile.exists())
        {
            try {

                FileInputStream fileInputStream = new FileInputStream("powerPharmacyPersonnelList.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                try {
                    successPharmacyPersonnels = (ArrayList<Personnel>) objectInputStream.readObject();

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                SuccessPharmacyPersonnel successPharmacyPersonnel1 = new SuccessPharmacyPersonnel(2154879, "Berke", "Başara", "Male", 1999, 6000, 4682137, true, 55, false);
                SuccessPharmacyPersonnel successPharmacyPersonnel2 = new SuccessPharmacyPersonnel(2154876, "İzzet", "Otlakçı", "Male", 1990, 4000, 8961235, true, 70, false);
                SuccessPharmacyPersonnel successPharmacyPersonnel3 = new SuccessPharmacyPersonnel(1236987, "İlknur", "Gezici", "Female", 1992, 3500, 4783156, true, 75, true);
                SuccessPharmacyPersonnel successPharmacyPersonnel4 = new SuccessPharmacyPersonnel(1478963, "Hilal", "Kalamış", "Female", 1997, 4500, 7823591, true, 85, false);

                ArrayList<Personnel> successPharmacyPersonnelList = new ArrayList<Personnel>();
                successPharmacyPersonnelList.add(successPharmacyPersonnel1);
                successPharmacyPersonnelList.add(successPharmacyPersonnel2);
                successPharmacyPersonnelList.add(successPharmacyPersonnel3);
                successPharmacyPersonnelList.add(successPharmacyPersonnel4);

                FileOutputStream fileOut = new FileOutputStream("successPharmacyPersonnelList.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(successPharmacyPersonnelList);
                out.close();
                fileOut.close();


            } catch (IOException i) {
                i.printStackTrace();
            }
        }



        //In this point we are checking fearlessPharmacyPersonnelList.ser file. If it exists using it. Otherwise we create and add objects.
        File fearlessPharmacyPersonnelListFile = new File("fearlessPharmacyPersonnelList.ser");
        ArrayList<Personnel> fearlessPharmacyPersonnels = null;

        if (fearlessPharmacyPersonnelListFile.exists())
        {
            try {

                FileInputStream fileInputStream = new FileInputStream("fearlessPharmacyPersonnelList.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                try {
                    fearlessPharmacyPersonnels = (ArrayList<Personnel>) objectInputStream.readObject();

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            FearlessPharmacyPersonnel fearlessPharmacyPersonnel1 = new FearlessPharmacyPersonnel(3298741, "Kazım", "Korkmaz", "Male", 1999, 6000, 2634867, true, 45, false);
            FearlessPharmacyPersonnel fearlessPharmacyPersonnel2 = new FearlessPharmacyPersonnel(5879641, "Halil", "Kaçan", "Male", 1991, 3500, 3218589, true, 75, false);
            FearlessPharmacyPersonnel fearlessPharmacyPersonnel3 = new FearlessPharmacyPersonnel(3654789, "Gözde", "İlkgelen", "Female", 1998, 4000, 6528198, true, 65, false);
            FearlessPharmacyPersonnel fearlessPharmacyPersonnel4 = new FearlessPharmacyPersonnel(3247896, "Kemal", "Kuşçu", "Male", 1976, 4500, 4689218, true, 64, false);

            ArrayList<Personnel> fearlessPharmacyPersonnelList = new ArrayList<Personnel>();
            fearlessPharmacyPersonnelList.add(fearlessPharmacyPersonnel1);
            fearlessPharmacyPersonnelList.add(fearlessPharmacyPersonnel2);
            fearlessPharmacyPersonnelList.add(fearlessPharmacyPersonnel3);
            fearlessPharmacyPersonnelList.add(fearlessPharmacyPersonnel4);
            try {
                FileOutputStream fileOut = new FileOutputStream("fearlessPharmacyPersonnelList.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(fearlessPharmacyPersonnelList);
                out.close();
                fileOut.close();


            } catch (IOException i) {
                i.printStackTrace();
            }
        }





        //In this point we are checking personnelArrayList.ser file. If it exists using it. Otherwise we create and add objects.
        File personnelArrayListFile = new File("personnelArrayList.ser");
        ArrayList<Personnel> personnelArrayLists;
        if (personnelArrayListFile.exists())
        {
            try {

                FileInputStream fileInputStream = new FileInputStream("personnelArrayList.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                try {
                    personnelArrayLists = (ArrayList<Personnel>) objectInputStream.readObject();

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            PowerPharmacyPersonnel powerPharmacyPersonnel1 = new PowerPharmacyPersonnel(7854213, "Faruk", "Güç", "Male", 1999, 6000, 4689218, true, 65, false);
            PowerPharmacyPersonnel powerPharmacyPersonnel2 = new PowerPharmacyPersonnel(8769325, "Zeynep", "Kuşçu", "Female", 1997, 4500, 6589421, true, 85, false);
            PowerPharmacyPersonnel powerPharmacyPersonnel3 = new PowerPharmacyPersonnel(2154879, "Mert", "Bakan", "Non-Binary", 1992, 3500, 4876524, true, 90, false);
            PowerPharmacyPersonnel powerPharmacyPersonnel4 = new PowerPharmacyPersonnel(6523879, "Hande", "Gözlemci", "Female", 1993, 3500, 4567812, true, 70, false);

            SuccessPharmacyPersonnel successPharmacyPersonnel1 = new SuccessPharmacyPersonnel(2154879, "Berke", "Başara", "Male", 1999, 6000, 4682137, true, 55, false);
            SuccessPharmacyPersonnel successPharmacyPersonnel2 = new SuccessPharmacyPersonnel(2154876, "İzzet", "Otlakçı", "Male", 1990, 4000, 8961235, true, 70, false);
            SuccessPharmacyPersonnel successPharmacyPersonnel3 = new SuccessPharmacyPersonnel(1236987, "İlknur", "Gezici", "Female", 1992, 3500, 4783156, true, 75, true);
            SuccessPharmacyPersonnel successPharmacyPersonnel4 = new SuccessPharmacyPersonnel(1478963, "Hilal", "Kalamış", "Female", 1997, 4500, 7823591, true, 85, false);

            FearlessPharmacyPersonnel fearlessPharmacyPersonnel1 = new FearlessPharmacyPersonnel(3298741, "Kazım", "Korkmaz", "Male", 1999, 6000, 2634867, true, 45, false);
            FearlessPharmacyPersonnel fearlessPharmacyPersonnel2 = new FearlessPharmacyPersonnel(5879641, "Halil", "Kaçan", "Male", 1991, 3500, 3218589, true, 75, false);
            FearlessPharmacyPersonnel fearlessPharmacyPersonnel3 = new FearlessPharmacyPersonnel(3654789, "Gözde", "İlkgelen", "Female", 1998, 4000, 6528198, true, 65, false);
            FearlessPharmacyPersonnel fearlessPharmacyPersonnel4 = new FearlessPharmacyPersonnel(3247896, "Kemal", "Kuşçu", "Male", 1976, 4500, 4689218, true, 64, false);

            ArrayList<Personnel> personnelArrayList = new ArrayList<Personnel>();
            personnelArrayList.add(powerPharmacyPersonnel1);
            personnelArrayList.add(powerPharmacyPersonnel2);
            personnelArrayList.add(powerPharmacyPersonnel3);
            personnelArrayList.add(powerPharmacyPersonnel4);
            personnelArrayList.add(successPharmacyPersonnel1);
            personnelArrayList.add(successPharmacyPersonnel2);
            personnelArrayList.add(successPharmacyPersonnel3);
            personnelArrayList.add(successPharmacyPersonnel4);
            personnelArrayList.add(fearlessPharmacyPersonnel1);
            personnelArrayList.add(fearlessPharmacyPersonnel2);
            personnelArrayList.add(fearlessPharmacyPersonnel3);
            personnelArrayList.add(fearlessPharmacyPersonnel4);
            try {
                FileOutputStream fileOut = new FileOutputStream("personnelArrayList.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(personnelArrayList);
                out.close();
                fileOut.close();


            } catch(IOException i){
                i.printStackTrace();
            }
        }


        //In this point we are creating patient objects and array list for using later.
        Patient patient1 = new Patient(1234567,"Sabahattin","Ali",1477258);
        Patient patient2 = new Patient(2345678,"Fyodor","Dostoyevski",2588369);
        Patient patient3 = new Patient(3456789,"Lev","Tolstoy",3639852);
        Patient patient4 = new Patient(4567891,"Nikolay ","Gogol",4785283);
        Patient patient5 = new Patient(5678910,"Maksim ","Gorki",7258366);
        Patient patient6 = new Patient(6789101,"Ivan","Turgenyev",2581479 );
        Patient patient7 = new Patient(7891011,"Niccolo","Machiavelli",8963149);
        Patient patient8 = new Patient(8910111,"Ernest","Hemingway",5296318);
        Patient patient9 = new Patient(9101121,"Victor","Hugo",2369147);
        Patient patient10 = new Patient(1011121,"Erich","Remarque",6314724);
        Patient patient11= new Patient(1121314,"Ferenc","Molnar",7852365);
        Patient patient12= new Patient(1213141,"Gabriel","Marquez",8945614);
        Patient patient13 = new Patient(1314151,"Jack ","London",9632587);
        Patient patient14 = new Patient(1415161,"Erich ","Fromm",9875463);
        Patient patient15 = new Patient(1516171,"Johann ","Goethe",6925814);
        Patient patient16 = new Patient(1617181,"John ","Steinbeck",5789654);
        Patient patient17 = new Patient(5238716, "Oscar", "Wilde", 1335495);
        Patient patient18 = new Patient(3254921, "Charles", "Dickens", 4563217);
        Patient patient19 = new Patient(6464783, "Theodore", "Roosevelt", 4673457);
        Patient patient20 = new Patient(6219764, "Isaac", "Newton", 4632179);
        Patient patient21 = new Patient(4664632, "Albert", "Einstein", 1268794);
        Patient patient22 = new Patient(6423196, "Christopher", "Colombus", 4645801);
        Patient patient23 = new Patient(6598745, "Wolfgang", "Mozart", 6523146);
        Patient patient24 = new Patient(3260491, "Ludwig van", "Beethoven", 6236974);
        Patient patient25 = new Patient(9369741, "Leonardo", "da Vinci",6987132);
        Patient patient26 = new Patient(3219846, "Thomas", "Edison", 4699745);
        Patient patient27 = new Patient(7896466,"Friedrich", "Nietzche",  6513359);
        Patient patient28 = new Patient(9417421, "Vincent", "van Gogh", 6565212);
        Patient patient29 = new Patient(9632310, "King", "Arthur", 6807979);
        Patient patient30 = new Patient(6565974, "Muhammed", "Ali", 9721304);
        Patient patient31 = new Patient(6511879, "Napoleon", "Bonapart", 6488743);
        Patient patient32 = new Patient(2177932,"Nikola", "Tesla", 1796324);
        Patient patient33 = new Patient(6548921, "Maria", "Curie",6323151);
        Patient patient34 = new Patient(4646461, "Paulo", "Coelho", 1358794);
        Patient patient35 = new Patient(6547921, "Cengiz", "Han", 7956353);
        Patient patient36 = new Patient(2358747, "Sigmund", "Freud", 7332647);

        ArrayList<Patient> powerPatientList = new ArrayList<Patient>();
        powerPatientList.add(patient1);
        powerPatientList.add(patient2);
        powerPatientList.add(patient3);
        powerPatientList.add(patient4);
        powerPatientList.add(patient13);
        powerPatientList.add(patient14);
        powerPatientList.add(patient15);
        powerPatientList.add(patient16);
        powerPatientList.add(patient17);
        powerPatientList.add(patient18);
        powerPatientList.add(patient19);
        powerPatientList.add(patient20);


        ArrayList<Patient> successPatientList = new ArrayList<Patient>();
        successPatientList.add(patient5);
        successPatientList.add(patient6);
        successPatientList.add(patient7);
        successPatientList.add(patient8);
        successPatientList.add(patient21);
        successPatientList.add(patient22);
        successPatientList.add(patient23);
        successPatientList.add(patient24);
        successPatientList.add(patient25);
        successPatientList.add(patient26);
        successPatientList.add(patient27);
        successPatientList.add(patient28);

        ArrayList<Patient> fearlessPatientList = new ArrayList<Patient>();
        fearlessPatientList.add(patient9);
        fearlessPatientList.add(patient10);
        fearlessPatientList.add(patient11);
        fearlessPatientList.add(patient12);
        fearlessPatientList.add(patient29);
        fearlessPatientList.add(patient30);
        fearlessPatientList.add(patient31);
        fearlessPatientList.add(patient32);
        fearlessPatientList.add(patient33);
        fearlessPatientList.add(patient34);
        fearlessPatientList.add(patient35);
        fearlessPatientList.add(patient36);

        //We creating pharmacy object for each pharmacy and addin allPharmacies array list.
        Pharmacy powerPharmacy = new Pharmacy(786214, "Power Pharmacy", "İstanbul","admin1", "power123", powerPharmacyMedicineLists, PowerPharmacyPersonnels,powerPatientList);
        Pharmacy successPharmacy = new Pharmacy(953467,"Success Pharmacy", "Muğla", "admin2", "success123", succeedPharmacyMedicineLists,successPharmacyPersonnels,successPatientList);
        Pharmacy fearlessPharmacy = new Pharmacy(462367, "Fearless Pharmacy", "Samsun", "admin3", "fearless123", fearlessPharmacyMedicineLists,fearlessPharmacyPersonnels,fearlessPatientList);

        ArrayList<Pharmacy> allPharmacies = new ArrayList<Pharmacy>();
        allPharmacies.add(powerPharmacy);
        allPharmacies.add(successPharmacy);
        allPharmacies.add(fearlessPharmacy);

        for(int i = 0; i< allPharmacies.size(); i++)
        {
            comboBoxPharmacy.addItem(allPharmacies.get(i).getPharmacyName());
        }


        //This is listPatientsButton. When you click this button in the program. You can see patients list which is patients who have been buying some medicines in that pharmacy.
        listPatientsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                ((DefaultTableModel) table1.getModel()).setNumRows(0);
                ((DefaultTableModel) table1.getModel()).setColumnCount(0);
                model.addColumn("Patient TC");
                model.addColumn("Patient Name");
                model.addColumn("Patient Surname");
                model.addColumn("Patient Number");
                String pharmacyx = comboBoxPharmacy.getSelectedItem().toString();
                Pharmacy selectedPharmacy = new Pharmacy();
                for(int i = 0; i<allPharmacies.size(); i++)
                {
                    if(pharmacyx == allPharmacies.get(i).getPharmacyName())
                    {
                        selectedPharmacy = allPharmacies.get(i);
                    }
                }
                for(int i = 0; i< selectedPharmacy.getPatientList().size();i++)
                {
                    Object[] patientInformations = {selectedPharmacy.getPatientList().get(i).getPatientID(),
                            selectedPharmacy.getPatientList().get(i).getPatientName(),
                            selectedPharmacy.getPatientList().get(i).getPatientSurname(),
                            selectedPharmacy.getPatientList().get(i).getPatientNumber()
                    };
                    model.addRow(patientInformations);
                }
            }
        });
        //This is showPatientButton. If you enter the patient's ID correctly and click this button, you can see other information registered in the system.
        showPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int Tc = Integer.valueOf(textFieldTC.getText());
                    if(Tc < 1000000 || Tc >9999999)
                    {
                        JOptionPane.showMessageDialog(null, "Tc should be an integer with 7 digits.");
                    }
                    String pharmacyx = comboBoxPharmacy.getSelectedItem().toString();
                    Pharmacy selectedPharmacy = new Pharmacy();
                    for(int i = 0; i<allPharmacies.size(); i++)
                    {
                        if(pharmacyx == allPharmacies.get(i).getPharmacyName())
                        {
                            selectedPharmacy = allPharmacies.get(i);
                        }
                    }
                    int controllerPatient = 0;
                    for(int i = 0 ;i<selectedPharmacy.getPatientList().size();i++)
                    {
                        int tcSearch = selectedPharmacy.getPatientList().get(i).getPatientID();
                        if (Tc == tcSearch)
                        {
                            textFieldName.setText(selectedPharmacy.getPatientList().get(i).getPatientName());
                            textFieldSurname.setText(selectedPharmacy.getPatientList().get(i).getPatientSurname());
                            textFieldTelNumber.setText(String.valueOf(selectedPharmacy.getPatientList().get(i).getPatientNumber()));
                            controllerPatient = 1;
                        }
                    }
                    if(controllerPatient == 0)
                    {
                        if(Tc > 1000000 || Tc <9999999)
                            JOptionPane.showMessageDialog(null, "The patient couldn't be found.");
                    }

                }catch (Exception exception1)
                {
                    JOptionPane.showMessageDialog(null, "Tc should be an integer with 7 digits.");
                    throw new IllegalArgumentException("Tc should be an integer with 7 digits.");
                }
            }
        });
        //This is comboBoxCategory item listener.It is use for the type of medicine we select from this combo box, show this type of medicines name  in other combo box.
        comboBoxCategory.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String category = comboBoxCategory.getSelectedItem().toString();
                if (category.equalsIgnoreCase("Painkiller"))
                {
                    comboBoxName.removeAllItems();
                    for (int i=0;i<painkillerArrayList.size();i++)
                    {
                        comboBoxName.addItem(painkillerArrayList.get(i).getName());
                    }

                }
                if (category.equalsIgnoreCase("Antidepressant"))
                {
                    comboBoxName.removeAllItems();
                    for (int i=0;i<antidepressantArrayList.size();i++)
                    {
                        comboBoxName.addItem(antidepressantArrayList.get(i).getName());
                    }

                }
                if (category.equalsIgnoreCase("Carvedilol"))
                {
                    comboBoxName.removeAllItems();
                    for (int i=0;i<carvedilolArrayList.size();i++)
                    {
                        comboBoxName.addItem(carvedilolArrayList.get(i).getName());
                    }

                }
                if (category.equalsIgnoreCase("Cold"))
                {
                    comboBoxName.removeAllItems();
                    for (int i=0;i<coldArrayList.size();i++)
                    {
                        comboBoxName.addItem(coldArrayList.get(i).getName());
                    }

                }
                if (category.equalsIgnoreCase("MuscleRelaxants"))
                {
                    comboBoxName.removeAllItems();
                    for (int i=0;i<muscleRelaxantsArrayList.size();i++)
                    {
                        comboBoxName.addItem(muscleRelaxantsArrayList.get(i).getName());
                    }

                }
                if (category.equalsIgnoreCase("Painkiller"))
                {
                    comboBoxName.removeAllItems();
                    for (int i=0;i<painkillerArrayList.size();i++)
                    {
                        comboBoxName.addItem(painkillerArrayList.get(i).getName());
                    }

                }
                if (category.equalsIgnoreCase("Vaccine"))
                {
                    comboBoxName.removeAllItems();
                    for (int i=0;i<vaccineArrayList.size();i++)
                    {
                        comboBoxName.addItem(vaccineArrayList.get(i).getName());
                    }

                }
                if (category.equalsIgnoreCase("Dermotological"))
                {
                    comboBoxName.removeAllItems();
                    for (int i=0;i<dermatologicalArrayList.size();i++)
                    {
                        comboBoxName.addItem(dermatologicalArrayList.get(i).getName());
                    }

                }
                if (category.equalsIgnoreCase("Vitamin"))
                {
                    comboBoxName.removeAllItems();
                    for (int i=0;i<vitaminArrayList.size();i++)
                    {
                        comboBoxName.addItem(vitaminArrayList.get(i).getName());
                    }

                }
            }
        });
        //This is showPriceButton. It use to show the price of the drug we have selected in the system.
        ArrayList<Medicine> finalAllMedicine = allMedicine;
        showPriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    for (int i = 0; i< finalAllMedicine.size(); i++)
                    {
                        if (finalAllMedicine.get(i).getName().equalsIgnoreCase(comboBoxName.getSelectedItem().toString()))
                        {
                            textFieldPrice.setText(String.valueOf(finalAllMedicine.get(i).getPrice()));
                        }
                    }
                } catch (Exception exception1)
                {
                    JOptionPane.showMessageDialog(null, "The Medinicine Name is not selected.");
                    throw new IllegalArgumentException("Something went wrong...");
                }
            }
        });
        //This is clearMedicineButton. It use for clear text field count and price.
        clearMedicineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldCount.setText("");
                textFieldPrice.setText("");
            }
        });
        //This is showStockButton. It is used to show the stock counts of the medicine and some information in a pharmacy you are processing .
        showStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    DefaultTableModel model = (DefaultTableModel) tableStokInfo.getModel();
                    ((DefaultTableModel) tableStokInfo.getModel()).setNumRows(0);
                    ((DefaultTableModel) tableStokInfo.getModel()).setColumnCount(0);
                    model.addColumn("Medicine ID");
                    model.addColumn("Medicine Category");
                    model.addColumn("Medicine Type");
                    model.addColumn("Medicine Name");
                    model.addColumn("Expiration Date Mounth");
                    model.addColumn("Expiration Date Year");
                    model.addColumn("Stock");
                    model.addColumn("Price");
                    String pharmacyx = comboBoxPharmacy.getSelectedItem().toString();
                    Pharmacy selectedPharmacy = new Pharmacy();
                    for(int i = 0; i<allPharmacies.size(); i++)
                    {
                        if(pharmacyx == allPharmacies.get(i).getPharmacyName())
                        {
                            selectedPharmacy = allPharmacies.get(i);
                        }
                    }
                    if(selectedPharmacy.getPharmacyID() == powerPharmacy.getPharmacyID())
                    {
                        ArrayList<Medicine> deserialized = new ArrayList<Medicine>();
                        FileInputStream fileIn = null;
                        try {
                            fileIn = new FileInputStream("powerPharmacyMedicineList.ser");
                        } catch (FileNotFoundException fileNotFoundException) {
                            fileNotFoundException.printStackTrace();
                        }
                        ObjectInputStream in = null;
                        try {
                            in = new ObjectInputStream(fileIn);
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }

                        try {
                            deserialized = (ArrayList<Medicine>) in.readObject();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        } catch (ClassNotFoundException classNotFoundException) {
                            classNotFoundException.printStackTrace();
                        }

                        for(int i = 0; i<selectedPharmacy.getMedicineList().size();i++) {

                            Object[] allMedicinesList = {deserialized.get(i).getID(),
                                    deserialized.get(i).getClass().getName(),
                                    deserialized.get(i).getMedicineType(),
                                    deserialized.get(i).getName(),
                                    deserialized.get(i).getExpirationDateMounth(),
                                    deserialized.get(i).getExpirationDateYear(),
                                    deserialized.get(i).getStock(),
                                    deserialized.get(i).getPrice()
                            };
                            model.addRow(allMedicinesList);
                        }
                    }else if(selectedPharmacy.getPharmacyID() == successPharmacy.getPharmacyID())
                    {
                        ArrayList<Medicine> deserialized = new ArrayList<Medicine>();
                        FileInputStream fileIn = null;
                        try {
                            fileIn = new FileInputStream("succeedPharmacyMedicineList.ser");
                        } catch (FileNotFoundException fileNotFoundException) {
                            fileNotFoundException.printStackTrace();
                        }
                        ObjectInputStream in = null;
                        try {
                            in = new ObjectInputStream(fileIn);
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }

                        try {
                            deserialized = (ArrayList<Medicine>) in.readObject();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        } catch (ClassNotFoundException classNotFoundException) {
                            classNotFoundException.printStackTrace();
                        }

                        for(int i = 0; i<selectedPharmacy.getMedicineList().size();i++) {

                            Object[] allMedicinesList = {deserialized.get(i).getID(),
                                    deserialized.get(i).getClass().getName(),
                                    deserialized.get(i).getMedicineType(),
                                    deserialized.get(i).getName(),
                                    deserialized.get(i).getExpirationDateMounth(),
                                    deserialized.get(i).getExpirationDateYear(),
                                    deserialized.get(i).getStock(),
                                    deserialized.get(i).getPrice()
                            };
                            model.addRow(allMedicinesList);
                        }
                    }else if(selectedPharmacy.getPharmacyID() == fearlessPharmacy.getPharmacyID())
                    {
                        ArrayList<Medicine> deserialized = new ArrayList<Medicine>();
                        FileInputStream fileIn = null;
                        try {
                            fileIn = new FileInputStream("fearlessPharmacyMedicineList.ser");
                        } catch (FileNotFoundException fileNotFoundException) {
                            fileNotFoundException.printStackTrace();
                        }
                        ObjectInputStream in = null;
                        try {
                            in = new ObjectInputStream(fileIn);
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }

                        try {
                            deserialized = (ArrayList<Medicine>) in.readObject();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        } catch (ClassNotFoundException classNotFoundException) {
                            classNotFoundException.printStackTrace();
                        }

                        for(int i = 0; i<selectedPharmacy.getMedicineList().size();i++) {

                            Object[] allMedicinesList = {deserialized.get(i).getID(),
                                    deserialized.get(i).getClass().getName(),
                                    deserialized.get(i).getMedicineType(),
                                    deserialized.get(i).getName(),
                                    deserialized.get(i).getExpirationDateMounth(),
                                    deserialized.get(i).getExpirationDateYear(),
                                    deserialized.get(i).getStock(),
                                    deserialized.get(i).getPrice()
                            };
                            model.addRow(allMedicinesList);
                        }
                    }
                } catch (Exception exception3)
                {
                    exception3.printStackTrace();
                }
            }
        });
        //This is showEmergencyNeedsButton. It is used to show medicine with a stock count below 20.
        showEmergencyNeedsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    DefaultTableModel model = (DefaultTableModel) tableEmergencyNeeds.getModel();
                    int countRow;
                    if(controller1)
                    {
                        model.addColumn("Medicine ID");
                        model.addColumn("Medicine Category");
                        model.addColumn("Medicine Type");
                        model.addColumn("Medicine Name");
                        model.addColumn("Expiration Date Mounth");
                        model.addColumn("Expiration Date Year");
                        model.addColumn("Stock");
                        model.addColumn("Price");
                        controller1 = false;
                    }
                    String pharmacyx = comboBoxPharmacy.getSelectedItem().toString();
                    Pharmacy selectedPharmacy = new Pharmacy();
                    for(int i = 0; i<allPharmacies.size(); i++)
                    {
                        if(pharmacyx == allPharmacies.get(i).getPharmacyName())
                        {
                            selectedPharmacy = allPharmacies.get(i);
                        }
                    }
                    model.setNumRows(0);

                    for(int i = 0; i<selectedPharmacy.getMedicineList().size();i++)
                    {

                        if (Integer.valueOf(selectedPharmacy.getMedicineList().get(i).getStock())<=20)
                        {

                            Object[] allMedicinesList = {selectedPharmacy.getMedicineList().get(i).getID(),
                                    selectedPharmacy.getMedicineList().get(i).getClass().getName(),
                                    selectedPharmacy.getMedicineList().get(i).getMedicineType(),
                                    selectedPharmacy.getMedicineList().get(i).getName(),
                                    selectedPharmacy.getMedicineList().get(i).getExpirationDateMounth(),
                                    selectedPharmacy.getMedicineList().get(i).getExpirationDateYear(),
                                    selectedPharmacy.getMedicineList().get(i).getStock(),
                                    selectedPharmacy.getMedicineList().get(i).getPrice()
                            };
                            model.addRow(allMedicinesList);
                        }
                    }
                } catch (Exception exception2)
                {
                    exception2.printStackTrace();
                }
            }
        });
        //This is showPersonelInfoButton. It is used to show the information of employees working in the pharmacy.
        showPersonelInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    DefaultTableModel model = (DefaultTableModel) tablePersonelInfo.getModel();
                    if(controller2)
                    {
                        model.addColumn("Personnel ID");
                        model.addColumn("Personnel Name");
                        model.addColumn("Personnel Surname");
                        model.addColumn("Personnel Gender");
                        model.addColumn("Personnel Birth Year");
                        model.addColumn("Personnel Salary");
                        model.addColumn("Personnel Number");
                        controller2 = false;
                    }
                    String pharmacyx = comboBoxPharmacy.getSelectedItem().toString();
                    Pharmacy selectedPharmacy = new Pharmacy();
                    for(int i = 0; i<allPharmacies.size(); i++)
                    {
                        if(pharmacyx == allPharmacies.get(i).getPharmacyName())
                        {
                            selectedPharmacy = allPharmacies.get(i);
                        }
                    }
                    model.setNumRows(0);
                    if(selectedPharmacy.getPharmacyID() == powerPharmacy.getPharmacyID())
                    {
                        ArrayList<PowerPharmacyPersonnel> deserialized = new ArrayList<PowerPharmacyPersonnel>();
                        FileInputStream fileIn = null;
                        try {
                            fileIn = new FileInputStream("powerPharmacyPersonnelList.ser");
                        } catch (FileNotFoundException fileNotFoundException) {
                            fileNotFoundException.printStackTrace();
                        }
                        ObjectInputStream in = null;
                        try {
                            in = new ObjectInputStream(fileIn);
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }

                        try {
                            deserialized = (ArrayList<PowerPharmacyPersonnel>) in.readObject();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        } catch (ClassNotFoundException classNotFoundException) {
                            classNotFoundException.printStackTrace();
                        }

                        for(int i = 0; i<selectedPharmacy.getPersonnelList().size();i++) {

                            Object[] allPersonnells = {deserialized.get(i).getPersonnelID(),
                                    deserialized.get(i).getPersonnelName(),
                                    deserialized.get(i).getPersonnelSurname(),
                                    deserialized.get(i).getPersonnelGender(),
                                    deserialized.get(i).getPersonnelBirthYear(),
                                    deserialized.get(i).getPersonnelSalary(),
                                    deserialized.get(i).getPersonnelNumber(),
                            };
                            model.addRow(allPersonnells);
                        }
                    }else if(selectedPharmacy.getPharmacyID() == successPharmacy.getPharmacyID())
                    {
                        ArrayList<SuccessPharmacyPersonnel> deserialized = new ArrayList<SuccessPharmacyPersonnel>();
                        FileInputStream fileIn = null;
                        try {
                            fileIn = new FileInputStream("successPharmacyPersonnelList.ser");
                        } catch (FileNotFoundException fileNotFoundException) {
                            fileNotFoundException.printStackTrace();
                        }
                        ObjectInputStream in = null;
                        try {
                            in = new ObjectInputStream(fileIn);
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }

                        try {
                            deserialized = (ArrayList<SuccessPharmacyPersonnel>) in.readObject();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        } catch (ClassNotFoundException classNotFoundException) {
                            classNotFoundException.printStackTrace();
                        }
                        for(int i = 0; i<selectedPharmacy.getPersonnelList().size();i++) {

                            Object[] allPersonnells = {deserialized.get(i).getPersonnelID(),
                                    deserialized.get(i).getPersonnelName(),
                                    deserialized.get(i).getPersonnelSurname(),
                                    deserialized.get(i).getPersonnelGender(),
                                    deserialized.get(i).getPersonnelBirthYear(),
                                    deserialized.get(i).getPersonnelSalary(),
                                    deserialized.get(i).getPersonnelNumber(),
                            };
                            model.addRow(allPersonnells);
                        }
                    }else if(selectedPharmacy.getPharmacyID() == fearlessPharmacy.getPharmacyID())
                    {
                        ArrayList<FearlessPharmacyPersonnel> deserialized = new ArrayList<FearlessPharmacyPersonnel>();
                        FileInputStream fileIn = null;
                        try {
                            fileIn = new FileInputStream("fearlessPharmacyPersonnelList.ser");
                        } catch (FileNotFoundException fileNotFoundException) {
                            fileNotFoundException.printStackTrace();
                        }
                        ObjectInputStream in = null;
                        try {
                            in = new ObjectInputStream(fileIn);
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                        try {
                            deserialized = (ArrayList<FearlessPharmacyPersonnel>) in.readObject();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        } catch (ClassNotFoundException classNotFoundException) {
                            classNotFoundException.printStackTrace();
                        }
                        for(int i = 0; i<selectedPharmacy.getPersonnelList().size();i++) {
                            Object[] allPersonnells = {deserialized.get(i).getPersonnelID(),
                                    deserialized.get(i).getPersonnelName(),
                                    deserialized.get(i).getPersonnelSurname(),
                                    deserialized.get(i).getPersonnelGender(),
                                    deserialized.get(i).getPersonnelBirthYear(),
                                    deserialized.get(i).getPersonnelSalary(),
                                    deserialized.get(i).getPersonnelNumber(),
                            };
                            model.addRow(allPersonnells);
                        }
                    }
                    comboBoxDeletedPersonnel.removeAllItems();
                    for(int i = 0; i < tablePersonelInfo.getModel().getRowCount(); i++)
                    {
                        String personnelName = String.valueOf(tablePersonelInfo.getModel().getValueAt(i,1));
                        String personnelSurname = String.valueOf(tablePersonelInfo.getModel().getValueAt(i,2));
                        int personnelID = Integer.valueOf(tablePersonelInfo.getModel().getValueAt(i,0).toString());
                        comboBoxDeletedPersonnel.addItem(personnelName + " " + personnelSurname + " " + personnelID);
                    }
                }catch (Exception exception2)
                {
                    throw new IllegalArgumentException("Something went wrong...");
                }
            }
        });
        //This is showPharmacyInfoButton.It is used to see the information of pharmacies registered in the system.
        showPharmacyInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DefaultTableModel model = (DefaultTableModel) tablePharmacy.getModel();
                if(controller3)
                {
                    model.addColumn("Pharmacy ID");
                    model.addColumn("Pharmacy Name");
                    model.addColumn("Pharmacy Location");
                    model.addColumn("Pharmacy System ID");
                    model.addColumn("Pharmacy System Passaword");
                    controller3 = false;
                }
                model.setNumRows(0);
                for(int i = 0; i<allPharmacies.size(); i++)
                {
                    Object[] pharmacyInfo = {allPharmacies.get(i).getPharmacyID(),
                            allPharmacies.get(i).getPharmacyName(),
                            allPharmacies.get(i).getPharmaLocation(),
                            allPharmacies.get(i).getSystem_ID(),
                            allPharmacies.get(i).getSystem_passaword()
                    };
                    model.addRow(pharmacyInfo);
                }
            }
        });
        //This is the addMedicineButton.It is used to add the information and the count of the medicine you have selected to the list when you want to order medication.
        DefaultTableModel model = (DefaultTableModel) tableMedicineOrder.getModel();
        model.addColumn("Medicine Category");
        model.addColumn("Medicine Name");
        model.addColumn("Count of Ordered Medicine");
        addMedicineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Integer countOrder = Integer.valueOf(textFieldCountOrder.getText());
                    String orderMedCategory = String.valueOf(comboBoxCategoryOrder.getSelectedItem());
                    String orderedMedName = String.valueOf(comboBoxOrderName.getSelectedItem());
                    if(comboBoxOrderName.getSelectedItem().toString().equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Either Medicine Name is not selected, or Medicine Count is not given.");
                    }else
                    {
                        Object[] orders = {orderMedCategory,orderedMedName,countOrder};
                        model.addRow(orders);
                    }
                }catch (Exception exception1)
                {
                    JOptionPane.showMessageDialog(null, "Either Medicine Name is not selected, or Medicine Count is not given.");
                    throw new IllegalArgumentException("Something went wrong...");
                }
            }
        });
        //This is the comboBoxCategoryOrder item listener. It is used to choose which medicine category you want to order.
        comboBoxCategoryOrder.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String category = comboBoxCategoryOrder.getSelectedItem().toString();
                if (category.equalsIgnoreCase("Painkiller"))
                {
                    comboBoxOrderName.removeAllItems();
                    for (int i=0;i<painkillerArrayList.size();i++)
                    {
                        comboBoxOrderName.addItem(painkillerArrayList.get(i).getName());
                    }
                }
                if (category.equalsIgnoreCase("Antidepressant"))
                {
                    comboBoxOrderName.removeAllItems();
                    for (int i=0;i<antidepressantArrayList.size();i++)
                    {
                        comboBoxOrderName.addItem(antidepressantArrayList.get(i).getName());
                    }
                }
                if (category.equalsIgnoreCase("Carvedilol"))
                {
                    comboBoxOrderName.removeAllItems();
                    for (int i=0;i<carvedilolArrayList.size();i++)
                    {
                        comboBoxOrderName.addItem(carvedilolArrayList.get(i).getName());
                    }
                }
                if (category.equalsIgnoreCase("Cold"))
                {
                    comboBoxOrderName.removeAllItems();
                    for (int i=0;i<coldArrayList.size();i++)
                    {
                        comboBoxOrderName.addItem(coldArrayList.get(i).getName());
                    }
                }
                if (category.equalsIgnoreCase("MuscleRelaxants"))
                {
                    comboBoxOrderName.removeAllItems();
                    for (int i=0;i<muscleRelaxantsArrayList.size();i++)
                    {
                        comboBoxOrderName.addItem(muscleRelaxantsArrayList.get(i).getName());
                    }
                }
                if (category.equalsIgnoreCase("Painkiller"))
                {
                    comboBoxOrderName.removeAllItems();
                    for (int i=0;i<painkillerArrayList.size();i++)
                    {
                        comboBoxOrderName.addItem(painkillerArrayList.get(i).getName());
                    }
                }
                if (category.equalsIgnoreCase("Vaccine"))
                {
                    comboBoxOrderName.removeAllItems();
                    for (int i=0;i<vaccineArrayList.size();i++)
                    {
                        comboBoxOrderName.addItem(vaccineArrayList.get(i).getName());
                    }
                }
                if (category.equalsIgnoreCase("Dermotological"))
                {
                    comboBoxOrderName.removeAllItems();
                    for (int i=0;i<dermatologicalArrayList.size();i++)
                    {
                        comboBoxOrderName.addItem(dermatologicalArrayList.get(i).getName());
                    }
                }
                if (category.equalsIgnoreCase("Vitamin"))
                {
                    comboBoxOrderName.removeAllItems();
                    for (int i=0;i<vitaminArrayList.size();i++)
                    {
                        comboBoxOrderName.addItem(vitaminArrayList.get(i).getName());
                    }
                }
            }
        });
        //This is clear button. It use for clear count text field and clear list of orders.
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldCountOrder.setText("");
                for (int i = 0;i<model.getRowCount();i++)
                {
                    model.removeRow(i);
                }
            }
        });
        //This is sendOrderButton. It use for send medicine order and add the medicine we ordered to the stock.
        sendOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    String pharmacyx = comboBoxPharmacy.getSelectedItem().toString();
                    Pharmacy selectedPharmacy = new Pharmacy();
                    for(int i = 0; i<allPharmacies.size(); i++)
                    {
                        if(pharmacyx == allPharmacies.get(i).getPharmacyName())
                        {
                            selectedPharmacy = allPharmacies.get(i);
                        }
                    }
                    String medicineCatagory, medicineName;
                    int count;
                    int controllerTableMedicineOrder=0;
                    for (int i = 0;i< tableMedicineOrder.getModel().getRowCount();i++)
                    {
                        medicineName = tableMedicineOrder.getModel().getValueAt(i,1).toString();
                        medicineCatagory = tableMedicineOrder.getModel().getValueAt(i,0).toString();
                        count = Integer.valueOf(tableMedicineOrder.getModel().getValueAt(i,2).toString());
                        for(int j = 0; j<selectedPharmacy.getMedicineList().size(); j++)
                        {
                            if(selectedPharmacy.getMedicineList().get(j).getName().equalsIgnoreCase(medicineName))
                            {
                                controllerTableMedicineOrder = 1;
                                if(selectedPharmacy.getPharmacyID() == powerPharmacy.getPharmacyID())
                                {
                                    selectedPharmacy.getMedicineList().get(j).setStock(selectedPharmacy.getMedicineList().get(j).getStock()+count);
                                    FileOutputStream fileOut = new FileOutputStream("powerPharmacyMedicineList.ser");
                                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                    out.writeObject(selectedPharmacy.getMedicineList());
                                    out.close();
                                    fileOut.close();
                                }else if (selectedPharmacy.getPharmacyID() == successPharmacy.getPharmacyID())
                                {
                                    selectedPharmacy.getMedicineList().get(j).setStock(selectedPharmacy.getMedicineList().get(j).getStock()+count);
                                    FileOutputStream fileOut = new FileOutputStream("succeedPharmacyMedicineList.ser");
                                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                    out.writeObject(selectedPharmacy.getMedicineList());
                                    out.close();
                                    fileOut.close();
                                }else if(selectedPharmacy.getPharmacyID() == fearlessPharmacy.getPharmacyID())
                                {
                                    selectedPharmacy.getMedicineList().get(j).setStock(selectedPharmacy.getMedicineList().get(j).getStock()+count);
                                    FileOutputStream fileOut = new FileOutputStream("fearlessPharmacyMedicineList.ser");
                                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                    out.writeObject(selectedPharmacy.getMedicineList());
                                    out.close();
                                    fileOut.close();
                                }
                            }
                        }
                    }
                    if(controllerTableMedicineOrder == 0)
                    {
                        JOptionPane.showMessageDialog(null,"Table of Medicine Order is empty.");
                    }else
                    {
                        JOptionPane.showMessageDialog(null,"Order sent...");
                    }
                }catch (Exception exception1)
                {
                    JOptionPane.showMessageDialog(null, "Something went wrong...");
                    throw new IllegalArgumentException("Something went wrong...");
                }
            }
        });
        //This is medicineAddButton.When we want to sell medicines, the information of the patient is used to list how many and to which patient it will be sold.
        DefaultTableModel model1 = (DefaultTableModel) tableSaleInfo.getModel();
        medicineAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    if(controller)
                    {
                        model1.addColumn("Patient TC");
                        model1.addColumn("Patient Name");
                        model1.addColumn("Patient Surname");
                        model1.addColumn("Patient Number");
                        model1.addColumn("Medicine Category");
                        model1.addColumn("Medicine Name");
                        model1.addColumn("Count");
                        model1.addColumn("Price");
                        model1.addColumn("Total Price");
                        controller = false;
                    }
                    Double priceofMedicine = Double.valueOf(textFieldPrice.getText());
                    Integer count = Integer.valueOf(textFieldCount.getText());
                    String medicine = comboBoxName.getSelectedItem().toString();
                    Double totalPrice = count*priceofMedicine;
                    String patientName = textFieldName.getText();
                    if(patientName.equalsIgnoreCase(""))
                    {
                        JOptionPane.showMessageDialog(null, "One of the next inputs is missing: Patiend ID, Patient Name, Patient Surname, Patient Telephone Number, Medicine Catagory, Medicine Name, Medicine Count, or Medicine Price.");
                    }else
                        {
                            Object[] saleInfo = {textFieldTC.getText().toString(),
                                    textFieldName.getText().toString(),
                                    textFieldSurname.getText().toString(),
                                    textFieldTelNumber.getText().toString(),
                                    String.valueOf(comboBoxCategory.getSelectedItem()),
                                    String.valueOf(comboBoxName.getSelectedItem()),
                                    textFieldCount.getText().toString(),
                                    textFieldPrice.getText().toString(),
                                    totalPrice.toString()};
                            model1.addRow(saleInfo);
                        }
                }catch (Exception exception1)
                {
                    JOptionPane.showMessageDialog(null, "One of the next inputs is missing: Patiend ID, Patient Name, Patient Surname, Patient Telephone Number, Medicine Catagory, Medicine Name, Medicine Count, or Medicine Price.");
                    throw new IllegalArgumentException("Something went wrong...");
                }
            }
        }
        );
        //This is the calculateTotalPriceButton. It is used to calculate the total price of the medicine we sell.
        calculateTotalPriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    int total = 0;
                    int controllerCalculatetotal=0;
                    for (int i = 0;i< tableSaleInfo.getModel().getRowCount();i++)
                    {
                        controllerCalculatetotal = 1;
                        String price = String.valueOf(tableSaleInfo.getModel().getValueAt(i,8));
                        double priceInt = Double.parseDouble(price);
                        total += priceInt;
                    }
                    if(controllerCalculatetotal == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Table of Sale Information is empty.");
                    }
                    textFieldTotalPrice.setText(String.valueOf(total));
                }catch (Exception exception1)
                {
                    JOptionPane.showMessageDialog(null, "Something went wrong.");
                    throw new IllegalArgumentException("Something went wrong.");
                }
            }
        });
        //This is the confirmSaleButton.It approves the sale we make and updates its information from the stock.
        confirmSaleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    String pharmacyx = comboBoxPharmacy.getSelectedItem().toString();
                    Pharmacy selectedPharmacy = new Pharmacy();
                    for(int i = 0; i<allPharmacies.size(); i++)
                    {
                        if(pharmacyx == allPharmacies.get(i).getPharmacyName())
                        {
                            selectedPharmacy = allPharmacies.get(i);
                        }
                    }
                    int controllerTableSaleInfo = 0;
                    for (int i = 0;i< tableSaleInfo.getModel().getRowCount();i++)
                    {
                        String count = String.valueOf(tableSaleInfo.getModel().getValueAt(i,6));
                        int countInt = Integer.parseInt(count);
                        String name = String.valueOf(tableSaleInfo.getModel().getValueAt(i,5));
                        for(int j = 0;j<selectedPharmacy.getMedicineList().size();j++)
                        {    System.out.println("1");
                            if(name.equalsIgnoreCase(selectedPharmacy.getMedicineList().get(j).getName()))
                            {
                                System.out.println("2");
                                int stock = selectedPharmacy.getMedicineList().get(j).getStock();
                                int newStock = stock-countInt;
                                controllerTableSaleInfo = 1;
                                if(newStock<0)
                                {
                                    JOptionPane.showMessageDialog(null, "There is not enough "+selectedPharmacy.getMedicineList().get(j).getName()+" in the stock.");
                                }else
                                {
                                    if(selectedPharmacy.getPharmacyID() == powerPharmacy.getPharmacyID())
                                    {
                                        selectedPharmacy.getMedicineList().get(j).setStock(newStock);
                                        FileOutputStream fileOut = new FileOutputStream("powerPharmacyMedicineList.ser");
                                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                        out.writeObject(selectedPharmacy.getMedicineList());
                                        out.close();
                                        fileOut.close();
                                    }else if(selectedPharmacy.getPharmacyID() == successPharmacy.getPharmacyID())
                                    {
                                        selectedPharmacy.getMedicineList().get(j).setStock(newStock);
                                        FileOutputStream fileOut = new FileOutputStream("succeedPharmacyMedicineList.ser");
                                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                        out.writeObject(selectedPharmacy.getMedicineList());
                                        out.close();
                                        fileOut.close();
                                    } else if(selectedPharmacy.getPharmacyID() == fearlessPharmacy.getPharmacyID())
                                    {
                                        selectedPharmacy.getMedicineList().get(j).setStock(newStock);
                                        FileOutputStream fileOut = new FileOutputStream("fearlessPharmacyMedicineList.ser");
                                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                        out.writeObject(selectedPharmacy.getMedicineList());
                                        out.close();
                                        fileOut.close();
                                    }
                                    JOptionPane.showMessageDialog(null,"Sale confirmed for " + selectedPharmacy.getMedicineList().get(j).getName()+ ".");
                                }
                            }
                        }
                    }
                    if(controllerTableSaleInfo == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Table of Sale Information is empty.");
                    }
                    textFieldCount.setText("");
                    textFieldPrice.setText("");
                }catch (Exception exception1)
                {
                    JOptionPane.showMessageDialog(null, "Something went wrong.");
                    throw new IllegalArgumentException("Something went wrong...");
                }

            }
        });
        //This is clearListButton. Clear list in sale table.
        clearListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((DefaultTableModel) tableStokInfo.getModel()).setNumRows(0);
                ((DefaultTableModel) tableStokInfo.getModel()).setColumnCount(0);
            }
        });
        //This is clearPatientButton. Clear patient informations in textfields.
        clearPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldTC.setText("");
                textFieldName.setText("");
                textFieldSurname.setText("");
                textFieldTelNumber.setText("");
                model1.setNumRows(0);
                model1.setColumnCount(0);
                controller = true;
            }
        });
        //This is addPersonnelButton.It is use when recruiting a new personal and checking if there is a compatible personality for the eczane.
        addPersonnelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    String pharmacyx = comboBoxPharmacy.getSelectedItem().toString();
                    Pharmacy selectedPharmacy = new Pharmacy();
                    for(int i = 0; i<allPharmacies.size(); i++)
                    {
                        if(pharmacyx == allPharmacies.get(i).getPharmacyName())
                        {
                            selectedPharmacy = allPharmacies.get(i);
                        }
                    }
                    int personnelID = Integer.valueOf(textFieldPersonnelID.getText());
                    String personnelName = textFieldPersonnelName.getText().toString();
                    String personnelSurname = textFieldPersonnelSurname.getText().toString();
                    String personnelGender = comboBoxPersonnelGender.getSelectedItem().toString();
                    int personnelBirthYear = Integer.valueOf(textFieldPersonnelBirthYear.getText());
                    float personnelSalary = Float.valueOf(textFieldPersonnelSalary.getText());
                    int personnelTelNumber = Integer.valueOf(textFieldPersonnelTelNumber.getText());
                    boolean militaryStatus;
                    if(completedCheckBox.isSelected())
                    {
                        militaryStatus = true;
                    }else
                    {
                        militaryStatus = false;
                    }
                    int personnelGraduationAverage = Integer.valueOf(textFieldPersonnelGraduationAverage.getText());
                    boolean criminalRecord;
                    if(personnelHasACriminalCheckBox.isSelected())
                    {
                        criminalRecord = true;
                    }else
                    {
                        criminalRecord = false;
                    }
                    if(personnelID < 1000000 ||  personnelID > 9999999)
                    {
                        JOptionPane.showMessageDialog(null,"Personnel ID should be an integer with 7 digits.");
                    } else if(personnelBirthYear < 1940 || personnelBirthYear > 2003) {
                        JOptionPane.showMessageDialog(null,"Personnel Birth Year should be an integer which is between 1940 and 2003");
                    } else if(personnelSalary < 2825.9)
                    {
                        JOptionPane.showMessageDialog(null,"Personnel Salary can not be less than 2825 Lira 90 Kuruş.");
                    } else if(personnelTelNumber < 1000000 || personnelTelNumber > 9999999)
                    {
                        JOptionPane.showMessageDialog(null,"Personnel Telephone Number should be an integer with 7 digits.");
                    }else if(selectedPharmacy.getPharmacyName().equals(powerPharmacy.getPharmacyName()) && militaryStatus == false)
                    {
                        JOptionPane.showMessageDialog(null, "Power Pharmacy doesn't accept personnel who is not completed Military or exempted from military.");
                    } else if(selectedPharmacy.getPharmacyName().equals(powerPharmacy.getPharmacyName()) && (personnelGraduationAverage < 60 || personnelGraduationAverage > 100))
                    {
                        JOptionPane.showMessageDialog(null, "Power Pharmacy doesn't accept personnel whose Graduation Average is not between 60 and 100");
                    } else if(selectedPharmacy.getPharmacyName().equals(powerPharmacy.getPharmacyName()) && criminalRecord == true)
                    {
                        JOptionPane.showMessageDialog(null, "Power Pharmacy doesn't accept personnel who has a Criminal History.");
                    } else if(selectedPharmacy.getPharmacyName().equals(successPharmacy.getPharmacyName()) && militaryStatus == false)
                    {
                        JOptionPane.showMessageDialog(null, "Success Pharmacy doesn't accept personnel who is not completed Military or exempted from military.");
                    } else if(selectedPharmacy.getPharmacyName().equals(successPharmacy.getPharmacyName()) && (personnelGraduationAverage < 50 || personnelGraduationAverage >100))
                    {
                        JOptionPane.showMessageDialog(null, "Success Pharmacy doesn't accept personnel whose Graduation Average is not between 50 and 100");
                    } else if(selectedPharmacy.getPharmacyName().equals(fearlessPharmacy.getPharmacyName()) && (personnelGraduationAverage < 40 || personnelGraduationAverage >100))
                    {
                        JOptionPane.showMessageDialog(null, "Fearless Pharmacy doesn't accept personnel whose Graduation Average is not between 40 and 100.");
                    }else
                    {
                        if(selectedPharmacy.getPharmacyID() == powerPharmacy.getPharmacyID())
                        {
                            try {
                                FileOutputStream fileOut = new FileOutputStream("powerPharmacyPersonnelList.ser");
                                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                selectedPharmacy.getPersonnelList().add(new PowerPharmacyPersonnel(personnelID,personnelName,personnelSurname,personnelGender,personnelBirthYear,personnelSalary,personnelTelNumber,militaryStatus,personnelGraduationAverage,criminalRecord));
                                out.writeObject(selectedPharmacy.getPersonnelList());
                                out.close();
                                fileOut.close();
                            } catch(IOException i){
                                i.printStackTrace();
                            }
                        } else if (selectedPharmacy.getPharmacyID() == successPharmacy.getPharmacyID()) {
                            if(selectedPharmacy.getPharmacyID() == powerPharmacy.getPharmacyID())
                            {
                                System.out.println("1");
                                try {
                                    FileOutputStream fileOut = new FileOutputStream("successPharmacyPersonnelList.ser");
                                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                    selectedPharmacy.getPersonnelList().add(new SuccessPharmacyPersonnel(personnelID,personnelName,personnelSurname,personnelGender,personnelBirthYear,personnelSalary,personnelTelNumber,militaryStatus,personnelGraduationAverage,criminalRecord));
                                    out.writeObject(selectedPharmacy.getPersonnelList());
                                    out.close();
                                    fileOut.close();
                                } catch(IOException i){
                                    i.printStackTrace();
                                }

                            }}
                        else if (selectedPharmacy.getPharmacyID() == fearlessPharmacy.getPharmacyID())
                        {
                            if(selectedPharmacy.getPharmacyID() == powerPharmacy.getPharmacyID())
                            {
                                System.out.println("1");
                                try {
                                    FileOutputStream fileOut = new FileOutputStream("fearlessPharmacyPersonnelList.ser");
                                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                    selectedPharmacy.getPersonnelList().add(new FearlessPharmacyPersonnel(personnelID,personnelName,personnelSurname,personnelGender,personnelBirthYear,personnelSalary,personnelTelNumber,militaryStatus,personnelGraduationAverage,criminalRecord));
                                    out.writeObject(selectedPharmacy.getPersonnelList());
                                    out.close();
                                    fileOut.close();
                                } catch(IOException i){
                                    i.printStackTrace();
                                }

                            }
                        }
                        JOptionPane.showMessageDialog(null, "The New Personnel is added.");
                    }
                }catch (Exception exception1)
                {
                    JOptionPane.showMessageDialog(null, "One of the Personnel Information is missing or in wrong format.");
                    throw new IllegalArgumentException("Something went wrong...");
                }
            }
        });
        //This is clearButton1. It use for clear personnel informations in textfields.
        clearButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldPersonnelBirthYear.setText("");
                textFieldPersonnelGraduationAverage.setText("");
                textFieldPersonnelID.setText("");
                textFieldPersonnelName.setText("");
                textFieldPersonnelSalary.setText("");
                textFieldPersonnelSurname.setText("");
                textFieldPersonnelTelNumber.setText("");
                personnelHasACriminalCheckBox.setSelected(false);
                completedCheckBox.setSelected(false);
                comboBoxPersonnelGender.setSelectedIndex(0);
            }
        });
        //This is deletePersonnelButton. It use fire Personnel from pharmacy. And delete personnel informations in the data.
        deletePersonnelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    String selectedPersonnel = String.valueOf(comboBoxDeletedPersonnel.getSelectedItem());
                    String selectedPersonnelName = "", selectedPersonnelSurname = "", selectedPersonnelID = "";
                    int character = 0;
                    while(selectedPersonnel.charAt(character) != ' ')
                    {
                        selectedPersonnelName = selectedPersonnelName + selectedPersonnel.charAt(character);
                        character++;
                    }
                    character++;
                    while(selectedPersonnel.charAt(character) != ' ')
                    {
                        selectedPersonnelSurname = selectedPersonnelSurname + selectedPersonnel.charAt(character);
                        character++;
                    }
                    character++;
                    for(int i = 0; i < 7; i++)
                    {
                        selectedPersonnelID = selectedPersonnelID + selectedPersonnel.charAt(character);
                        character++;
                    }
                    int intSelectedPersonnelID = Integer.valueOf(selectedPersonnelID);
                    String pharmacyx = comboBoxPharmacy.getSelectedItem().toString();
                    Pharmacy selectedPharmacy = new Pharmacy();
                    for(int i = 0; i<allPharmacies.size(); i++)
                    {
                        if(pharmacyx == allPharmacies.get(i).getPharmacyName())
                        {
                            selectedPharmacy = allPharmacies.get(i);
                        }
                    }
                    for(int i = 0; i < selectedPharmacy.getPersonnelList().size(); i++)
                    {
                        if(selectedPharmacy.getPersonnelList().get(i).getPersonnelName().equalsIgnoreCase(selectedPersonnelName)
                                && selectedPharmacy.getPersonnelList().get(i).getPersonnelSurname().equalsIgnoreCase(selectedPersonnelSurname)
                                && selectedPharmacy.getPersonnelList().get(i).getPersonnelID() == intSelectedPersonnelID)
                        {
                            if(selectedPharmacy.getPharmacyID() == powerPharmacy.getPharmacyID())
                            {
                                selectedPharmacy.getPersonnelList().remove(selectedPharmacy.getPersonnelList().get(i));
                                FileOutputStream fileOut = new FileOutputStream("powerPharmacyPersonnelList.ser");
                                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                out.writeObject(selectedPharmacy.getPersonnelList());
                                out.close();
                                fileOut.close();
                                JOptionPane.showMessageDialog(null, "Selected Personnel is fired.");
                            }else if(selectedPharmacy.getPharmacyID() == successPharmacy.getPharmacyID())
                            {
                                selectedPharmacy.getPersonnelList().remove(selectedPharmacy.getPersonnelList().get(i));
                                FileOutputStream fileOut = new FileOutputStream("successPharmacyPersonnelList.ser");
                                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                out.writeObject(selectedPharmacy.getPersonnelList());
                                out.close();
                                fileOut.close();
                                JOptionPane.showMessageDialog(null, "Selected Personnel is fired.");
                            }else if(selectedPharmacy.getPharmacyID() == fearlessPharmacy.getPharmacyID())
                            {
                                selectedPharmacy.getPersonnelList().remove(selectedPharmacy.getPersonnelList().get(i));
                                FileOutputStream fileOut = new FileOutputStream("fearlessPharmacyPersonnelList.ser");
                                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                out.writeObject(selectedPharmacy.getPersonnelList());
                                out.close();
                                fileOut.close();
                                JOptionPane.showMessageDialog(null, "Selected Personnel is fired.");
                            }
                        }
                    }
                }catch (Exception exception2)
                {
                    throw new IllegalArgumentException("Something went wrong...");
                }
            }
        });
    }
}
