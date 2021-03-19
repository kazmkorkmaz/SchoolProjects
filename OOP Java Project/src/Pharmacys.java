/*This is Pharmacys class of our project.
*In this class, we created some swing component like button or text field.
* After that, we checked login informations for every pharmacies.
* If you write right information you can can access MainForm and ou can do what you want to do ,
* otherwise you can't access Mainform.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ColorModel;
public class Pharmacys extends JFrame{
    private JPanel panel1;
    private JTextField textFieldUserName;
    private JPasswordField passwordFieldUserPassaword;
    private JButton loginButton;
    private JPanel MainPanel;
    //This is Pharmacy constructer and we checked Pharmacy login information in this point.
    public Pharmacys() {
        add(panel1);
        setSize(940,600);
        setTitle("Start Screen");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        String powerUserID = "admin1";
        String powerUserPassaword = "power123";
        String succeedUserID = "admin2";
        String succedUserPassaword = "succed123";
        String fearlessUserID = "admin3";
        String fearlessUserPassaword = "fearless123";
        //This is login button action and checks Pharmacy login information.
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    //We check each Pharmacy information and login what pharmacy login.
                    if( textFieldUserName.getText().equalsIgnoreCase(powerUserID)&&String.valueOf(passwordFieldUserPassaword.getPassword()).equalsIgnoreCase(powerUserPassaword))
                    {

                        MainForm mainForm = new MainForm();
                        mainForm.setVisible(true);
                        mainForm.comboBoxPharmacy.setSelectedIndex(0);
                        dispose();
                    }
                   else if( textFieldUserName.getText().equalsIgnoreCase(succeedUserID)&&String.valueOf(passwordFieldUserPassaword.getPassword()).equalsIgnoreCase(succedUserPassaword))
                    {

                        MainForm mainForm = new MainForm();
                        mainForm.setVisible(true);
                        mainForm.comboBoxPharmacy.setSelectedIndex(1);
                        dispose();
                    }
                    else if( textFieldUserName.getText().equalsIgnoreCase(fearlessUserID)&&String.valueOf(passwordFieldUserPassaword.getPassword()).equalsIgnoreCase(fearlessUserPassaword))
                    {
                        System.out.println("3");   MainForm mainForm = new MainForm();
                        mainForm.setVisible(true);
                        mainForm.comboBoxPharmacy.setSelectedIndex(2);
                        dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"User ID or Passaword is incorrect or missing...");
                    }
                }
                catch (Exception exception)
                {
                    try {
                        throw new Exception("Something went wrong...");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                }

                }


        });
    }


}
