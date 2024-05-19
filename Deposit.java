package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textfield;
    JButton b1,b2;


    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("Raleway",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        label1.setForeground(Color.white);
        l3.add(label1);

        textfield = new TextField();
        textfield.setBackground(new Color(65,125,120));
        textfield.setForeground(Color.white);
        textfield.setBounds(460,230,320,25);
        textfield.setFont(new Font("Ralewy",Font.BOLD,22));
        l3.add(textfield);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,362,150,32);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,32);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textfield.getText();
            Date date = new Date();
            if (e.getSource()==b1){
                if(textfield.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");

                }else {
                    Con c =new Con();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+  " Deposit successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            } else if (e.getSource()==b2) {
                setVisible(false);
                new main_Class(pin);

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit(" ");
    }
}
