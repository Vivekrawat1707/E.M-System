package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {

    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1000,650);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(280,155,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(300,260,150,40);
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new AddEmployee();
            setVisible(false);
            }
        });
        img.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(490,260,150,40);
        view.setBackground(Color.black);
        view.setForeground(Color.white);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new View_Employee();
              setVisible(false);
            }
        });
        img.add(view);

        JButton rem = new JButton("Remove Employee");
        rem.setBounds(400,380,150,40);
        rem.setBackground(Color.black);
        rem.setForeground(Color.white);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new RemoveEmployee();
            }
        });
        img.add(rem);

       setSize(1000,650);
       setLocation(150,40);
       setLayout(null);
       setVisible(true);

    }
    public static void main(String[] args) {
        new Main_class();
    }
}
