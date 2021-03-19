/**
 * Welcome to Pharmacy Management System Project.
 * @author Kazım Korkmaz,Faruk Güç,Berke Başara
 * @version 1.0
 * @since 2021.01.08
 *
 */
/*
This is the Main class of our project.
*/
import javax.swing.*;
public class Main extends JFrame {
    public static void main(String[] args)
    {
        //We create this catch and try block for learning system information and using right interface for forms.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        //We create a new thread for running first form.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            //This is the how call you new form from Pharmacys.
            Pharmacys pharmacys = new Pharmacys();
            pharmacys.setVisible(true);
                      }
        });
    }
}
