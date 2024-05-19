package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textpan,textadhar;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    String first;
  String formno;
    Signup2(String formno){

        super("APPLICATION NUMBER");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {
                "Hindu","Muslim","Sikh","Christian","Other"
        };
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setBounds(350,170,100,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,500","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education");
        l6.setBounds(100,270,100,30);
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        add(l6);

        String education[]= {"Non-Graduate","Graduate","Post-Graduate","Non-post-Graduate","Doctrate","Other"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBounds(350,270,320,30);
        comboBox4.setBackground(new Color(252,208,76));
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation");
        l7.setBounds(100,320,200,30);
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        add(l7);

        String occupation[]= {"Govt Servent","Self-employed","Business","Salaried","Retired","Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBounds(350,320,320,30);
        comboBox5.setBackground(new Color(252,208,76));
        add(comboBox5);

        JLabel panNo = new JLabel("Pan Number");
        panNo.setBounds(100,370,190,30);
        panNo.setFont(new Font("Raleway",Font.BOLD,18));
        add(panNo);

        textpan = new JTextField();
        textpan.setBounds(350,370,320,30);
        textpan.setFont(new Font("Raleway",Font.BOLD,14));
        textpan.setBackground(new Color(252,208,76));
        add(textpan);

        JLabel adharNo = new JLabel("Adhar Card Number");
        adharNo.setBounds(100,420,300,30);
        adharNo.setFont(new Font("Raleway",Font.BOLD,18));
        add(adharNo);

        textadhar = new JTextField();
        textadhar.setBounds(350,420,320,30);
        textadhar.setFont(new Font("Raleway",Font.BOLD,14));
        textadhar.setBackground(new Color(252,208,76));
        add(textadhar);

        JLabel l8 = new JLabel("Senior Citizen");
        l8.setBounds(100,470,300,30);
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        add(l8);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(380,470,100,30);
        r1.setBackground(new Color(252,208,76));
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(480,470,100,30);
        r2.setBackground(new Color(252,208,76));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l9 = new JLabel("Existing Account");
        l9.setBounds(100,520,300,30);
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        add(l9);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBounds(380,520,100,30);
        r3.setBackground(new Color(252,208,76));
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBounds(480,520,100,30);
        r4.setBackground(new Color(252,208,76));
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel l10 = new JLabel("Form No :");
        l10.setFont(new Font("Raleway",Font.BOLD,14));
        l10.setBounds(700,10,100,30);
        add(l10);

        JLabel l11 = new JLabel(formno);
        l11.setBounds(760,10,60,30);
        l11.setFont(new Font("Raleway",Font.BOLD,14));
        add(l11);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

    setLayout(null);
    setSize(850,750);
    setLocation(450,80);
    getContentPane().setBackground(new Color(252,208,76));
    setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
      String rel = (String) comboBox.getSelectedItem();
      String cat = (String) comboBox2.getSelectedItem();
      String income = (String) comboBox3.getSelectedItem();
      String edu = (String) comboBox4.getSelectedItem();
      String ocp = (String) comboBox5.getSelectedItem();

      String pan = textpan.getText();
      String adhar = textadhar.getText();

      String scitizen = " ";
      if(r1.isSelected()){
          scitizen = "Yes";
      } else if (r2.isSelected()) {
          scitizen = "No";

      }

        String eAccount = " ";
        if(r1.isSelected()){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount = "No";

        }

        try{
            if(textpan.getText().equals(" ") || textadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con c1 = new Con();
                String q = "insert into signup2 values('"+formno+"','"+rel+"','"+cat+"','"+income+"','"+edu+"','"+ocp+"','"+pan+"','"+adhar+"','"+scitizen+"','"+eAccount+"');";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args){
    new Signup2("");
    }
}
