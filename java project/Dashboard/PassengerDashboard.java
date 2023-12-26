package Dashboard;

import java.awt.Color;
import javax.swing.ImageIcon;

import Login.Login;
import User.MRTpass;
import User.Passenger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.util.Objects;
import javax.swing.*;

public class PassengerDashboard implements ActionListener {

    JFrame dashboardFrame;
    JPanel customerPanel1;
    JPanel customerPanel2;
    JPanel searchResults;
    JPanel resultsp;
    JButton bSearchMetro, bCustomerLogout, bBackToCustomerPanel1, bHirePhotographer, b10, b9;
    JButton[] hirePhotographer = new JButton[100];
    JLabel  lCp1, lCp2, lCp3, lCp5, lSp1, dName, dNamel, dExp, dExpl, poster1, poster2;

    MRTpass[] searchResult = new MRTpass[100];
    MRTpass[] mrtPasses;
    Passenger[] passengers;

    JComboBox<String> time, root;
    String[] Destination = { "uttara-pallabi","uttara-mirpur","uttara-agargaon","uttara-DU",};
    String[] schedule = { "8:30", "9:00", "9:30", "10:00" };

    public PassengerDashboard(Passenger[]passengers, MRTpass[] mrtPasses)
    {
        this.passengers = passengers;
        this.mrtPasses = mrtPasses;

        dashboardFrame = new JFrame();

        /////////// Customer Panel /////////////////

        customerPanel1 = new JPanel();

        lCp1 = new JLabel("Buy Metro Tickets");
        lCp1.setBounds(425, 100, 300, 40);
        Font medFont = lCp1.getFont().deriveFont(Font.PLAIN, 30f);
        lCp1.setForeground(Color.BLACK);
        lCp1.setFont(medFont);

        lCp2 = new JLabel("Select time & destination");
        lCp2.setBounds(435, 170, 400, 20);
        Font smallFont = lCp2.getFont().deriveFont(Font.PLAIN, 20f);
        lCp2.setForeground(Color.BLACK);
        lCp2.setFont(smallFont);

        lCp3 = new JLabel("Your desired root:");
        lCp3.setBounds(370, 250, 250, 20);
        lCp3.setForeground(Color.BLACK);
        lCp3.setFont(smallFont);

        lCp5 = new JLabel("Your required time:");
        lCp5.setBounds(370, 350, 250, 20);
        lCp5.setForeground(Color.BLACK);
        lCp5.setFont(smallFont);

        bSearchMetro = new JButton("Search for metro");
        bSearchMetro.setBounds(450, 460, 200, 50);
        bSearchMetro.addActionListener(this);
        bSearchMetro.setOpaque(true);
        bSearchMetro.setContentAreaFilled(true);
        bSearchMetro.setBackground(Color.BLACK);
        bSearchMetro.setBorderPainted(true);
        bSearchMetro.setForeground(Color.WHITE);

        bCustomerLogout = new JButton("Logout");
        bCustomerLogout.setBounds(5, 600, 100, 40);
        bCustomerLogout.addActionListener(this);
        bCustomerLogout.setOpaque(true);
        bCustomerLogout.setContentAreaFilled(true);
        bCustomerLogout.setBackground(Color.BLACK);
        bCustomerLogout.setBorderPainted(true);
        bCustomerLogout.setForeground(Color.WHITE);

        b9 = new JButton("Exit");
        b9.setBounds(1000, 620, 80, 30);
        b9.addActionListener(this);
        b9.setOpaque(false);
        b9.setContentAreaFilled(false);
        b9.setBorderPainted(false);
        b9.setForeground(Color.BLACK);

        root = new JComboBox<>(Destination);
        root.setBounds(600, 250, 140, 20);

        time = new JComboBox<>(schedule);
        time.setBounds(600, 350, 140, 20);

        ImageIcon img = new ImageIcon("Images/6.png");
        poster1 = new JLabel(img);
        poster1.setBounds(0, 0, 1100, 700);

        customerPanel1.add(lCp1);
        customerPanel1.add(lCp2);
        customerPanel1.add(lCp3);
        customerPanel1.add(lCp5);
        customerPanel1.add(root);
        customerPanel1.add(time);
        customerPanel1.add(bSearchMetro);
        customerPanel1.add(bCustomerLogout);
        customerPanel1.add(b9);
        customerPanel1.add(poster1);
        customerPanel1.setLayout(null);
        customerPanel1.setBounds(0, 0, 1100, 700);
        customerPanel1.setBackground(Color.white);
        customerPanel1.setVisible(true);

        /////////// search results //////////////////
        customerPanel2 = new JPanel();

        lSp1 = new JLabel("Available metros");
        lSp1.setBounds(400, 100, 200, 20);
        lSp1.setForeground(Color.BLACK);
        lSp1.setFont(smallFont);

        bBackToCustomerPanel1 = new JButton("Search Again");
        bBackToCustomerPanel1.setBounds(475, 580, 150, 40);
        bBackToCustomerPanel1.addActionListener(this);
        bBackToCustomerPanel1.setOpaque(true);
        bBackToCustomerPanel1.setContentAreaFilled(true);
        bBackToCustomerPanel1.setBackground(Color.BLACK);
        bBackToCustomerPanel1.setBorderPainted(true);
        bBackToCustomerPanel1.setForeground(Color.WHITE);

        searchResults = new JPanel();

        searchResults.setLayout(null);
        searchResults.setBounds(260, 70, 600, 500);
        searchResults.setBackground(Color.WHITE);
        searchResults.setVisible(true);
        customerPanel2.add(searchResults);

        b10 = new JButton("Exit");
        b10.setBounds(1000, 620, 80, 30);
        b10.addActionListener(this);
        b10.setOpaque(false);
        b10.setContentAreaFilled(false);
        b10.setBorderPainted(false);
        b10.setForeground(Color.BLACK);

        ImageIcon img2 = new ImageIcon("Images/7.png");
        poster2 = new JLabel(img2);
        poster2.setBounds(0, 0, 1100, 700);

        customerPanel2.add(bBackToCustomerPanel1);
        customerPanel2.add(b10);
        customerPanel2.add(poster2);
        customerPanel2.setLayout(null);
        customerPanel2.setBounds(0, 0, 1100, 700);
        customerPanel2.setBackground(Color.gray);
        customerPanel2.setVisible(false);

        //dashboardFrame.setIconImage(icon.getImage());
        dashboardFrame.add(customerPanel1);
        dashboardFrame.add(customerPanel2);
        dashboardFrame.setLayout(null);
        dashboardFrame.setTitle("Dashboard Dhaka Metro");
        dashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dashboardFrame.setSize(1100, 700);
        dashboardFrame.setLocationRelativeTo(null);
        dashboardFrame.setVisible(true);

    }

    public void filter(MRTpass[] mrtPasses) {

        String type = Objects.requireNonNull(root.getSelectedItem()).toString();
        String exp = Objects.requireNonNull(time.getSelectedItem()).toString();

        for (MRTpass mrtPass : mrtPasses) {
            if (mrtPass != null) {
                String driType = mrtPass.getCarType();
                String driExp = mrtPass.getYearsExp();
                if (type.equals(driType) && exp.equals(driExp)) {
                    addResult(mrtPass);
                }
            }
        }
    }

    public void addResult(MRTpass d) {

        for (int i = 0; i < searchResult.length; i++) {

            if (searchResult[i] == null) {
                searchResult[i] = d;
                break;

            }

        }
    }

    public void newGIG(MRTpass searchResult, int gap) {
        int posY = gap * 110;

        resultsp = new JPanel();

        bHirePhotographer = new JButton("Buy");
        bHirePhotographer.setBounds(495, 32, 70, 27);
        bHirePhotographer.addActionListener(this);
        bHirePhotographer.setOpaque(true);
        bHirePhotographer.setContentAreaFilled(true);
        bHirePhotographer.setBackground(Color.BLACK);
        bHirePhotographer.setBorderPainted(true);
        bHirePhotographer.setForeground(Color.WHITE);

        dNamel = new JLabel("Root: ");
        dNamel.setBounds(5, 5, 80, 20);
        dNamel.setForeground(Color.BLACK);

        dName = new JLabel(searchResult.getCarType());
        dName.setBounds(50, 5, 200, 20);
        dName.setForeground(Color.BLACK);

        dExpl = new JLabel("Time: ");
        dExpl.setBounds(5, 40, 200, 20);
        dExpl.setForeground(Color.BLACK);

        dExp = new JLabel(searchResult.getYearsExp());
        dExp.setBounds(50, 40, 150, 20);
        dExp.setForeground(Color.BLACK);


        resultsp.add(bHirePhotographer);
        resultsp.add(dNamel);
        resultsp.add(dName);
        resultsp.add(dExp);
        resultsp.add(dExpl);
        resultsp.setLayout(null);
        resultsp.setBounds(10, 10 + posY, 580, 100);
        resultsp.setBackground(Color.gray);
        resultsp.setVisible(true);

        searchResults.add(resultsp);

        hirePhotographer[gap] = bHirePhotographer;

    }

    public void actionPerformed(ActionEvent e) {
        for (JButton jButton : hirePhotographer) {
            if (e.getSource() == jButton) {

                JOptionPane.showMessageDialog(null, "your ticket has been purchased", "Success!",
                        JOptionPane.WARNING_MESSAGE);

            }
        }

        if (e.getSource() == bSearchMetro) {

            customerPanel2.setVisible(true);
            customerPanel1.setVisible(false);
            filter(mrtPasses);
            for (int i = 0; i < searchResult.length; i++) {
                if (searchResult[i] != null) {
                    newGIG(searchResult[i], i);

                }
            }
        }

        if (e.getSource() == bBackToCustomerPanel1) {
            customerPanel2.setVisible(false);
            customerPanel1.setVisible(true);
            for (int i = 0; i < searchResult.length; i++) {
                if (searchResult[i] != null) {
                    searchResult[i] = null;
                }
                searchResults.removeAll();

            }
        }

        if (e.getSource() == bCustomerLogout) {

            dashboardFrame.setVisible(false);
            new Login(passengers,mrtPasses);

        }

        if (e.getSource() == b9) {

            System.exit(0);

        }
        if (e.getSource() == b10) {

            System.exit(0);

        }
    }
}
