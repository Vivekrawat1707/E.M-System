package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class splash extends JFrame {
    splash(){
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/front.gif"));
       Image i2 = i1.getImage().getScaledInstance(1000,650,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(0,0,1000,650);
       add(image);

        setSize(1000,650);   //swing
        setLocation(150,40);
        setLayout(null);
        setVisible(true);

        try{
            Thread.sleep(5000);
            setVisible(false);
            new Login();
        }catch(Exception p){
            p.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new splash();

    }
}
