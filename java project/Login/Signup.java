package Login;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.Font;
import javax.swing.*;

import User.Passenger;
import User.MRTpass;

public class Signup implements ActionListener {
    MRTpass[] mrtPasses = new MRTpass[100];
    Passenger[] passengers = new Passenger[100];

    JFrame signupFrame;
    JPanel signupPanel, passengerSignUp, mrtSignUp, signupComplete;
    JLabel l1, l2, l3, l4,l5, l6, l7, l8, l9, l13, l14, l15, l16, l17, poster1, poster2, poster3, poster4;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8;
    JPasswordField cp1, ccp1, dp1, dcp1;
    JButton mpassSignUp, passSignUp, returnToLogin, returnToSignup, signUp1, signUp2;

    JComboBox<String> time, root;
    String[] Destination = { "uttara-pallabi","uttara-mirpur","uttara-agargaon","uttara-DU",};
    String[] schedule = { "8:30", "9:00", "9:30", "10:00" };
    public Signup() {
        signupFrame = new JFrame();

        // main signup panel
        signupPanel = new JPanel();

        l14 = new JLabel("Sign up on Dhaka Metro");
        l14.setBounds(300, 100, 400, 80);
        Font bigFont = l14.getFont().deriveFont(Font.BOLD, 30f);
        l14.setFont(bigFont);
        l14.setForeground(Color.black);

        l15 = new JLabel("Sign Up & Have a Great Journey");
        l15.setBounds(300, 150, 500, 80);
        l15.setForeground(Color.black);



        passSignUp = new JButton("Sign-up as Passenger");
        passSignUp.setBounds(300, 400, 200, 30);
        passSignUp.addActionListener(this);
        passSignUp.setOpaque(true);
        passSignUp.setContentAreaFilled(true);
        passSignUp.setBackground(Color.GREEN);
        passSignUp.setBorderPainted(true);
        passSignUp.setForeground(Color.BLACK);

        mpassSignUp = new JButton("Sign-up as MRT Pass Holder");
        mpassSignUp.setBounds(300, 450, 200, 30);
        mpassSignUp.addActionListener(this);
        mpassSignUp.setOpaque(true);
        mpassSignUp.setContentAreaFilled(true);
        mpassSignUp.setBackground(Color.GREEN);
        mpassSignUp.setBorderPainted(true);
        mpassSignUp.setForeground(Color.BLACK);

        ImageIcon image1 = new ImageIcon("Images/1.png");
        poster1 = new JLabel(image1);
        poster1.setBounds(0, 0, 1100, 700);
        ImageIcon icon = new ImageIcon("Images/logo.png");

        signupPanel.add(l14);
        signupPanel.add(l15);
        signupPanel.add(passSignUp);
        signupPanel.add(mpassSignUp);
        signupPanel.add(poster1);
        signupPanel.setLayout(null);
        signupPanel.setBounds(0, 0, 1100, 700);
        signupPanel.setVisible(true);

        // passenger signup panel;

        passengerSignUp = new JPanel();

        l1 = new JLabel("Name:");
        l1.setBounds(300, 180, 150, 40);
        Font midFont = l1.getFont().deriveFont(Font.PLAIN, 23f);
        l1.setFont(midFont);
        l1.setForeground(Color.black);

        l2 = new JLabel("Phone Number:");
        l2.setBounds(300, 250, 300, 40);
        l2.setFont(midFont);
        l2.setForeground(Color.black);

        l3 = new JLabel("E-mail Address: ");
        l3.setBounds(300, 300, 400, 80);
        l3.setFont(midFont);
        l3.setForeground(Color.black);

        l4 = new JLabel("Password:");
        l4.setBounds(300, 350, 400, 80);
        l4.setFont(midFont);
        l4.setForeground(Color.black);

        l16 = new JLabel("Confirm Password:");
        l16.setBounds(300, 400, 400, 80);
        l16.setFont(midFont);
        l16.setForeground(Color.black);

        tf1 = new JTextField("", 2);
        tf1.setBounds(500, 183, 220, 32);
        tf1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        tf1.setFont(midFont);
        tf1.setOpaque(false);
        tf1.setForeground(Color.black);

        tf2 = new JTextField("", 2);
        tf2.setBounds(500, 252, 220, 32);
        tf2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        tf2.setFont(midFont);
        tf2.setOpaque(false);
        tf2.setForeground(Color.black);


        tf3 = new JTextField("", 2);
        tf3.setBounds(500, 318, 220, 32);
        tf3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        tf3.setFont(midFont);
        tf3.setOpaque(false);
        tf3.setForeground(Color.black);

        cp1 = new JPasswordField("", 2);
        cp1.setBounds(500, 375, 220, 32);
        cp1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        cp1.setFont(midFont);
        cp1.setOpaque(false);
        cp1.setForeground(Color.black);

        ccp1 = new JPasswordField("", 2);
        ccp1.setBounds(500, 423, 220, 32);
        ccp1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        ccp1.setFont(midFont);
        ccp1.setOpaque(false);
        ccp1.setForeground(Color.black);

        signUp1 = new JButton("Sign-up");
        signUp1.setBounds(440, 500, 150, 30);
        signUp1.addActionListener(this);
        signUp1.setOpaque(true);
        signUp1.setContentAreaFilled(true);
        signUp1.setBackground(Color.GREEN);
        signUp1.setBorderPainted(true);
        signUp1.setForeground(Color.BLACK);

        ImageIcon image2 = new ImageIcon("Images/2.png");
        poster2 = new JLabel(image2);
        poster2.setBounds(0, 0, 1100, 700);

        passengerSignUp.add(l1);
        passengerSignUp.add(l2);
        passengerSignUp.add(l3);
        passengerSignUp.add(l4);
        passengerSignUp.add(l16);
        passengerSignUp.add(tf1);
        passengerSignUp.add(tf2);
        passengerSignUp.add(tf3);
        passengerSignUp.add(cp1);
        passengerSignUp.add(ccp1);
        passengerSignUp.add(signUp1);
        passengerSignUp.add(poster2);
        passengerSignUp.setLayout(null);
        passengerSignUp.setBounds(0, 0, 1100, 700);
        passengerSignUp.setVisible(false);

        // MRT pass holder sign up panel

        mrtSignUp = new JPanel();

        l5 = new JLabel("Name:");
        l5.setBounds(150, 70, 150, 40);
        l5.setFont(midFont);
        l5.setForeground(Color.black);

        l6 = new JLabel("Phone Number:");
        l6.setBounds(150, 120, 200, 40);
        l6.setFont(midFont);
        l6.setForeground(Color.black);


        l7 = new JLabel("E-mail Address: ");
        l7.setBounds(150, 170, 200, 40);
        l7.setFont(midFont);
        l7.setForeground(Color.black);

        l8 = new JLabel("NID Number:");
        l8.setBounds(150, 220, 150, 40);
        l8.setFont(midFont);
        l8.setForeground(Color.black);

        l9 = new JLabel("MRT Pass No:");
        l9.setBounds(150, 270, 200, 40);
        l9.setFont(midFont);
        l9.setForeground(Color.black);


        l13 = new JLabel("Password:");
        l13.setBounds(150, 320, 150, 40);
        l13.setFont(midFont);
        l13.setForeground(Color.black);

        l17 = new JLabel("Confirm Password:");
        l17.setBounds(150, 370, 200, 40);
        l17.setFont(midFont);
        l17.setForeground(Color.black);

        tf4 = new JTextField();
        tf4.setBounds(430, 75, 220, 32);
        tf4.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        tf4.setFont(midFont);
        tf4.setOpaque(false);
        tf4.setForeground(Color.black);

        tf5 = new JTextField();
        tf5.setBounds(430, 130, 220, 32);
        tf5.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        tf5.setFont(midFont);
        tf5.setOpaque(false);
        tf5.setForeground(Color.black);

        tf6 = new JTextField();
        tf6.setBounds(430, 180, 220, 32);
        tf6.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        tf6.setFont(midFont);
        tf6.setOpaque(false);
        tf6.setForeground(Color.black);

        tf7 = new JTextField();
        tf7.setBounds(430, 228, 220, 32);
        tf7.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        tf7.setFont(midFont);
        tf7.setOpaque(false);
        tf7.setForeground(Color.black);

        tf8 = new JTextField();
        tf8.setBounds(430, 277, 220, 32);
        tf8.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        tf8.setFont(midFont);
        tf8.setOpaque(false);
        tf8.setForeground(Color.black);



        dp1 = new JPasswordField("", 2);
        dp1.setBounds(430, 325, 180, 32);
        dp1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        dp1.setFont(midFont);
        dp1.setOpaque(false);
        dp1.setForeground(Color.black);

        dcp1 = new JPasswordField("", 2);
        dcp1.setBounds(430, 377, 180, 32);
        dcp1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        dcp1.setFont(midFont);
        dcp1.setOpaque(false);
        dcp1.setForeground(Color.black);

        root=new JComboBox<>(Destination);
        root.setBounds(5,5,10,20);

        time=new JComboBox<>(schedule);
        time.setBounds(5,30,10,20);

        signUp2 = new JButton("Sign-up");
        signUp2.setBounds(300, 475, 150, 30);
        signUp2.addActionListener(this);
        signUp2.setOpaque(true);
        signUp2.setContentAreaFilled(true);
        signUp2.setBackground(Color.green);
        signUp2.setBorderPainted(true);
        signUp2.setForeground(Color.white);

        ImageIcon image3 = new ImageIcon("Images/3.png");
        poster3 = new JLabel(image3);
        poster3.setBounds(0, 0, 1100, 700);

        mrtSignUp.add(l5);
        mrtSignUp.add(l6);
        mrtSignUp.add(l7);
        mrtSignUp.add(l8);
        mrtSignUp.add(l9);
        mrtSignUp.add(l13);
        mrtSignUp.add(l17);
        mrtSignUp.add(tf4);
        mrtSignUp.add(tf5);
        mrtSignUp.add(tf6);
        mrtSignUp.add(tf7);
        mrtSignUp.add(tf8);
        mrtSignUp.add(dp1);
        mrtSignUp.add(dcp1);
        mrtSignUp.add(time);
        mrtSignUp.add(root);
        mrtSignUp.add(signUp2);
        mrtSignUp.add(poster3);
        mrtSignUp.setLayout(null);
        mrtSignUp.setBounds(0, 0, 1100, 700);
        mrtSignUp.setVisible(false);

        // signup complete panel

        signupComplete = new JPanel();

        l14 = new JLabel("Account has been successfully created!");
        l14.setBounds(280, 100, 600, 80);
        l14.setFont(bigFont);
        l14.setForeground(Color.black);

        returnToLogin = new JButton("Go back to Log-in page");
        returnToLogin.setBounds(340, 300, 200, 30);
        returnToLogin.addActionListener(this);
        returnToLogin.setOpaque(true);
        returnToLogin.setContentAreaFilled(true);
        returnToLogin.setBackground(Color.black);
        returnToLogin.setBorderPainted(true);
        returnToLogin.setForeground(Color.white);

        returnToSignup = new JButton("Go back to Sign-up page");
        returnToSignup.setBounds(340, 380, 200, 30);
        returnToSignup.addActionListener(this);
        returnToSignup.setOpaque(true);
        returnToSignup.setContentAreaFilled(true);
        returnToSignup.setBackground(Color.blue);
        returnToSignup.setBorderPainted(true);
        returnToSignup.setForeground(Color.white);

        ImageIcon image4 = new ImageIcon("Images/4.png");
        poster4 = new JLabel(image4);
        poster4.setBounds(0, 0, 1100, 700);

        signupComplete.add(l14);
        signupComplete.add(returnToLogin);
        signupComplete.add(returnToSignup);
        signupComplete.add(poster4);
        signupComplete.setLayout(null);
        signupComplete.setBounds(0, 0, 1100, 700);
        signupComplete.setVisible(false);

        signupFrame.add(signupPanel);
        signupFrame.add(passengerSignUp);
        signupFrame.add(mrtSignUp);
        signupFrame.add(signupComplete);
        signupFrame.setLayout(null);
        signupFrame.setBounds(0, 0, 1100, 700);
        signupFrame.setLocationRelativeTo(null);
        signupFrame.setVisible(true);
        signupFrame.setIconImage(icon.getImage());
        signupFrame.setTitle("Metro Rail Online Ticketing System");

    }

    public void addPassengers(Passenger c)// function for adding an account to the array
    {
        int count = 0;

        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = c;
                count++;
                this.passengers = passengers;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Passenger Account not added");
        } else {
            System.out.println("Passenger Account added");
        }
    }
    public Passenger[] getPassenger(){
        return passengers;
    }

    public void addmrtPasses(MRTpass d)// function for adding an account to the array
    {
        int count = 0;

        for (int i = 0; i < mrtPasses.length; i++) {
            if (mrtPasses[i] == null) {
                mrtPasses[i] = d;
                count++;
                this.mrtPasses = mrtPasses;
                break;
            }
        }
        if (count == 0) {
            System.out.println("MRT pass Account not added");
        } else {
            System.out.println("MRT pass Account added");
        }
    }
    public MRTpass[] getMrtPasses(){
        return mrtPasses;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == passSignUp) {
            signupPanel.setVisible(false);
            passengerSignUp.setVisible(true);

        }

        if (e.getSource() == mpassSignUp) {
            signupPanel.setVisible(false);
            mrtSignUp.setVisible(true);

        }

        if (e.getSource() == signUp1) {
            String cname = tf1.getText();
            String cphoneNo = tf2.getText();
            String cemail = tf3.getText();
            String cpass = cp1.getText();
            String cconfPass = ccp1.getText();

            if (cname.length() >= 3 && cphoneNo.length() >= 3 && cemail.length() >= 3 && cpass.equals(cconfPass)) {
                try {
                    Passenger c = new Passenger(cname, cphoneNo, cemail, cpass);
                    addPassengers(c);
                    passengerSignUp.setVisible(false);
                    signupComplete.setVisible(true);
                    System.out.println("Passenger added");

                    File file = new File(".\\Data\\passenger.txt");
                    if (!file.exists()) {
                        boolean fileCreated = file.createNewFile();
                        if (!fileCreated) {
                            System.out.println("File creation failed");
                            // Handle file creation failure if needed
                            return;
                        }
                    }

                    try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
                        pw.println("User Name : " + cname);
                        pw.println("Password : " + cpass);
                        pw.println("Phone : " + cphoneNo);
                    } catch (IOException ex) {
                        System.out.println("Error writing to the file: " + ex);
                        // Handle file writing error if needed
                    }
                } catch (Exception ex) {
                    System.out.print(ex);
                }
            }
        }


        if (e.getSource() == signUp2) {
            String dname = tf4.getText();
            String dphoneNo = tf5.getText();
            String demail = tf6.getText();
            String dnid = tf7.getText();
            String dpassNum = tf8.getText();
            String dpass = dp1.getText();
            String dconfPass = dcp1.getText();
            String droot = root.getSelectedItem().toString();
            String dtime = time.getSelectedItem().toString();


            if (dname.length() >= 3 && dphoneNo.length() >= 3 && demail.length() >= 3 && dnid.length() >= 3 && dpassNum.length() >= 3 && dpass.equals(dconfPass)) {
                try {
                    MRTpass d = new MRTpass(dname, dphoneNo, demail, dpass, dnid, dpassNum, dtime, droot);
                    addmrtPasses(d);
                    mrtSignUp.setVisible(false);
                    signupComplete.setVisible(true);

                    File file = new File(".\\Data\\mrtPass.txt");
                    if (!file.exists()) {
                        boolean fileCreated = file.createNewFile();
                        if (!fileCreated) {
                            System.out.println("File creation failed");
                            // Handle file creation failure if needed
                            return;
                        }
                    }

                    try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
                        pw.println("User Name : " + dname);
                        pw.println("Password : " + dpass);
                        pw.println("Phone : " + dphoneNo);
                    } catch (IOException ex) {
                        System.out.println("Error writing to the file: " + ex);
                        // Handle file writing error if needed
                    }
                } catch (Exception ex) {
                    System.out.print(ex);
                }
            }
        }


        if (e.getSource() == returnToSignup) {
            signupComplete.setVisible(false);
            signupPanel.setVisible(true);
        }

        if (e.getSource() == returnToLogin) {
            if (e.getSource() == returnToLogin) {
                signupFrame.setVisible(false);
                new Login(passengers, mrtPasses);

            }
        }

    }
}
