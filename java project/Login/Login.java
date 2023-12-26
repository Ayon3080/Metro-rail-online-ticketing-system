package Login;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.*;

import User.*;
import Dashboard.AdminDashboard;
import Dashboard.PassengerDashboard;

public class Login implements ActionListener {
    JFrame loginFrame;
    JPanel loginDashboard, adminLogin;
    JLabel background, poster;
    JLabel l1, l2, l3, l4, lt,lt2;
    JPasswordField p1, p2;
    JTextField tf1, tf2;
    JButton b1, b2, b5, b6, b10;

    int count=1;
    Passenger[] passengers= new Passenger[100];
    MRTpass[] mrtpasses=new MRTpass[100];
    public Login(Passenger[]passengers, MRTpass[]mrtpasses) {

        this.passengers= passengers;
        this.mrtpasses=mrtpasses;

        loginFrame = new JFrame();

        ImageIcon image = new ImageIcon("Images/background.png");
        background = new JLabel(image);
        background.setBounds(0, 0, 1100, 700);

        ImageIcon icon = new ImageIcon("Images/logo.png");

        loginDashboard = new JPanel();
        l1 = new JLabel("Username:");
        l1.setBounds(370, 275, 150, 20);
        l1.setForeground(Color.black);
        Font smallFont = l1.getFont().deriveFont(Font.BOLD, 20f);
        l1.setFont(smallFont);

        l2 = new JLabel("Password:");
        l2.setBounds(370, 345, 150, 20);
        l2.setForeground(Color.black);
        l2.setFont(smallFont);

        lt = new JLabel("Welcome to Dhaka Metro");
        lt.setBounds(335, 100, 450, 40);
        lt.setForeground(Color.black);
        Font titleFont = lt.getFont().deriveFont(Font.BOLD, 36f);
        lt.setFont(titleFont);

        tf1 = new JTextField("", 2);
        tf1.setBounds(475, 270, 250, 32);
        tf1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        Font bigFont = tf1.getFont().deriveFont(Font.PLAIN, 20f);
        tf1.setFont(bigFont);
        tf1.setBackground(Color.white);
        tf1.setOpaque(false);

        p1 = new JPasswordField("", 2);
        p1.setBounds(475, 340, 250, 32);
        p1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        p1.setFont(bigFont);
        p1.setBackground(Color.white);
        p1.setOpaque(false);

        b1 = new JButton("Login");
        b1.setBounds(425, 425, 110, 30);
        b1.addActionListener(this);
        b1.setOpaque(true);
        b1.setContentAreaFilled(true);
        b1.setBackground(Color.BLACK);
        b1.setBorderPainted(true);
        b1.setForeground(Color.white);

        b2 = new JButton("Sign-up");
        b2.setBounds(475, 475, 150, 30);
        b2.addActionListener(this);
        b2.setOpaque(true);
        b2.setContentAreaFilled(true);
        b2.setBackground(Color.blue);
        b2.setBorderPainted(true);
        b2.setForeground(Color.white);

        b5 = new JButton("Admin");
        b5.setBounds(560, 425, 110, 30);
        b5.addActionListener(this);
        b5.setOpaque(true);
        b5.setContentAreaFilled(true);
        b5.setBackground(Color.red);
        b5.setBorderPainted(false);
        b5.setForeground(Color.WHITE);

        // admin login panel

        adminLogin = new JPanel();
        l3 = new JLabel("Username: ");
        l3.setBounds(350, 250, 150, 20);
        l3.setForeground(Color.black);
        l3.setFont(smallFont);

        l4 = new JLabel("Password: ");
        l4.setBounds(350, 320, 150, 20);
        l4.setForeground(Color.black);
        l4.setFont(smallFont);

        tf2 = new JTextField("", 4);
        tf2.setBounds(455, 245, 300, 32);
        tf2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        tf2.setFont(bigFont);
        tf2.setOpaque(false);

        p2 = new JPasswordField("", 4);
        p2.setBounds(455, 315, 300, 32);
        p2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        p2.setFont(bigFont);
        p2.setOpaque(false);

        b6 = new JButton("Login");
        b6.setBounds(475, 400, 150, 30);
        b6.addActionListener(this);
        b6.setOpaque(true);
        b6.setContentAreaFilled(true);
        b6.setBackground(Color.BLUE);
        b6.setBorderPainted(true);
        b6.setForeground(Color.WHITE);

        lt2 = new JLabel("ADMIN LOGIN");
        lt2.setBounds(450, 100, 450, 40);
        lt2.setForeground(Color.black);
        lt2.setFont(titleFont);

        b10 = new JButton("<BACK");
        b10.setBounds(10, 600, 100, 30);
        b10.addActionListener(this);
        b10.setOpaque(true);
        b10.setContentAreaFilled(true);
        b10.setBackground(Color.RED);
        b10.setBorderPainted(true);
        b10.setForeground(Color.white);

        ImageIcon img = new ImageIcon("Images/5.png");
        poster = new JLabel(img);
        poster.setBounds(0, 0, 1100, 700);

        adminLogin.add(l3);
        adminLogin.add(l4);
        adminLogin.add(b6);
        adminLogin.add(lt2);
        adminLogin.add(b10);
        adminLogin.add(tf2);
        adminLogin.add(p2);
        adminLogin.add(poster);
        // adminLogin.add(slider);
        adminLogin.setLayout(null);
        adminLogin.setBounds(0, 0, 1100, 700);
        adminLogin.setBackground(Color.gray);
        adminLogin.setVisible(false);

        loginDashboard.add(b1);
        loginDashboard.add(b2);
        loginDashboard.add(b5);

        loginDashboard.add(l1);
        loginDashboard.add(l2);
        loginDashboard.add(lt);
        loginDashboard.add(tf1);
        loginDashboard.add(p1);
        loginDashboard.add(background);

        loginDashboard.setLayout(null);
        loginDashboard.setBounds(0, 0, 1100, 700);
        loginDashboard.setBackground(Color.lightGray);
        loginDashboard.setVisible(true);

        loginFrame.setIconImage(icon.getImage());
        loginFrame.add(loginDashboard);
        loginFrame.add(adminLogin);

        loginFrame.setLayout(null);
        loginFrame.setTitle("Metro Rail Online Ticketing System");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(1100, 700);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            loginFrame.setVisible(false);
            new Signup();
        }
        if (e.getSource() == b6) {
            String adminUsr = tf2.getText();
            String adminPass = p2.getText();

            if (adminUsr.equals("admin") && adminPass.equals("admin")) {

                loginFrame.setVisible(false);
                new AdminDashboard(passengers, mrtpasses);

            } else {
                JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
            }

        }

        if (e.getSource() == b1) {
            String user = tf1.getText();
            String pass = p1.getText();
            int flag = 0;

            for (int i = 0; i < passengers.length; i++) {
                if (passengers[i] != null) {
                    String cusName = passengers[i].getName();
                    String cusPass = passengers[i].getPassword();
                    if (user.equals(cusName) && pass.equals(cusPass)) {
                        loginFrame.setVisible(false);
                        new PassengerDashboard(passengers , mrtpasses);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!",
                                "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
            }

            for (int i = 0; i < mrtpasses.length; i++) {

                if (mrtpasses[i] != null) {
                    String driName = mrtpasses[i].getName();
                    String driPass = mrtpasses[i].getPassword();
                    if (user.equals(driName) && pass.equals(driPass)) {
                        //passengers[i].showPassengerDetails();
                        loginFrame.setVisible(false);
                        new PassengerDashboard(passengers , mrtpasses);

                    }
                }

            }
        }
        if (e.getSource() == b5) {
            loginDashboard.setVisible(false);
            adminLogin.setVisible(true);
        }
        if (e.getSource() == b10) {
            adminLogin.setVisible(false);
            loginDashboard.setVisible(true);
        }
    }
    public void setPassenger(Passenger passengers[]) {
        this.passengers = passengers;
    }
}

