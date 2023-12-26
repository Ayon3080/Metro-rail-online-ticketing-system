
package Dashboard;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.*;

import Login.*;
import User.*;

public final class AdminDashboard implements ActionListener {

    JFrame aDashboardFrame;
    JTextField tf1 , tf2;
    JPanel adminPanel1 , adminPanel2 , adminPanel3, adminPanel4, adminPanel5, adminPanelCus , adminPanelDri;
    JLabel aL1 , aL2 , aL3 ,cusName , cusPhone , cusEmail , cusPass , cusNamel , cusPhonel , cusEmaill , cusPassl , poster1, poster2 , poster3 , poster5;
    JLabel driName , driPhone , driEmail , driPass , driNamel , driPhonel , driEmaill , driPassl;
    JButton manageCus , manageDri , back1 ,back2, remove1 , remove2 , b9 , b10;
    MRTpass[] mrtPasses = new MRTpass[100];
    Passenger[] passengers = new Passenger[100];

    public AdminDashboard(Passenger[] passengers, MRTpass[] mrtPasses)
    {
        this.passengers = passengers;
        this.mrtPasses = mrtPasses;

        aDashboardFrame = new JFrame();


        adminPanel1 = new JPanel();
        aL1 = new JLabel("Dhaka Metro- Management Page");
        aL1.setBounds(360,100,600,50);
        Font midFont = aL1.getFont().deriveFont(Font.PLAIN, 30f);
        aL1.setForeground(Color.BLACK);
        aL1.setFont(midFont);

        aL2 = new JLabel("(Admin Only)");
        aL2.setBounds(475,150,600,50);
        aL2.setForeground(Color.BLACK);
        aL2.setFont(midFont);

        manageCus = new JButton("Manage Passenger");
        manageCus.setBounds(500,400,150,50);
        manageCus.addActionListener(this);
        manageCus.setOpaque(true);
        manageCus.setContentAreaFilled(true);
        manageCus.setBackground(Color.BLACK);
        manageCus.setBorderPainted(true);
        manageCus.setForeground(Color.WHITE);


        manageDri = new JButton("Manage MRT pass user");
        manageDri.setBounds(450,300,250,50);
        manageDri.addActionListener(this);
        manageDri.setOpaque(true);
        manageDri.setContentAreaFilled(true);
        manageDri.setBackground(Color.BLACK);
        manageDri.setBorderPainted(true);
        manageDri.setForeground(Color.WHITE);

        b9=new JButton("Exit");
        b9.setBounds(1000,600,80,30);
        b9.addActionListener(this);
        b9.setOpaque(true);
        b9.setContentAreaFilled(true);
        b9.setBorderPainted(false);
        b9.setBackground(Color.black);
        b9.setBorderPainted(true);
        b9.setForeground(Color.white);

        b10 = new JButton("Logout");
        b10.setBounds(10,600,100,40);
        b10.addActionListener(this);
        b10.setOpaque(true);
        b10.setContentAreaFilled(true);
        b10.setBackground(Color.BLACK);
        b10.setBorderPainted(true);
        b10.setForeground(Color.WHITE);

        adminPanel2 = new JPanel();

        adminPanel4 = new JPanel();


        adminPanel3 = new JPanel();

        adminPanel3.setLayout(null);
        adminPanel3.setBounds(260,70,600,500);
        adminPanel3.setBackground(Color.WHITE);
        adminPanel3.setVisible(true);


        tf1=new JTextField("" , 2);
        tf1.setBounds(350,590,220,32);
        tf1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        Font bigFont = tf1.getFont().deriveFont(Font.PLAIN, 20f);
        tf1.setFont(bigFont);
        tf1.setOpaque(false);

        remove1 = new JButton("Remove User");
        remove1.setBounds(600,600,150,25);
        remove1.addActionListener(this);
        remove1.setOpaque(true);
        remove1.setContentAreaFilled(true);
        remove1.setBackground(Color.BLACK);
        remove1.setBorderPainted(true);
        remove1.setForeground(Color.WHITE);

        back1 = new JButton("Back");
        back1.setBounds(20,600,80,25);
        back1.addActionListener(this);
        back1.setOpaque(true);
        back1.setContentAreaFilled(true);
        back1.setBackground(Color.BLACK);
        back1.setBorderPainted(true);
        back1.setForeground(Color.WHITE);




        ImageIcon image1 = new ImageIcon("Images/5.png");
        poster1 = new JLabel(image1);
        poster1.setBounds(0,0,1100,700);


        adminPanel2.add(adminPanel3);
        adminPanel2.add(back1);
        adminPanel2.add(tf1);
        adminPanel2.add(remove1);
        adminPanel2.add(poster1);
        adminPanel2.setLayout(null);
        adminPanel2.setBounds(0,0,1100,700);
        adminPanel2.setBackground(Color.gray);
        adminPanel2.setVisible(false);


        adminPanel5 = new JPanel();

        adminPanel5.setLayout(null);
        adminPanel5.setBounds(260,70,600,500);
        adminPanel5.setBackground(Color.WHITE);
        adminPanel5.setVisible(true);

        tf2=new JTextField("" , 2);
        tf2.setBounds(350,590,220,32);
        tf2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf2.setFont(bigFont);
        tf2.setOpaque(false);

        remove2 = new JButton("Remove User");
        remove2.setBounds(600,600,150,25);
        remove2.addActionListener(this);
        remove2.setOpaque(true);
        remove2.setContentAreaFilled(true);
        remove2.setBackground(Color.BLACK);
        remove2.setBorderPainted(true);
        remove2.setForeground(Color.WHITE);

        back2 = new JButton("Back");
        back2.setBounds(20,600,80,25);
        back2.addActionListener(this);
        back2.setOpaque(true);
        back2.setContentAreaFilled(true);
        back2.setBackground(Color.BLACK);
        back2.setBorderPainted(true);
        back2.setForeground(Color.WHITE);


        ImageIcon image5 = new ImageIcon("Images/1.png");
        poster5 = new JLabel(image5);
        poster5.setBounds(0,0,1100,700);


        adminPanel4.add(adminPanel5);
        adminPanel4.add(tf2);
        adminPanel4.add(remove2);
        adminPanel4.add(back2);
        adminPanel4.add(poster5);
        adminPanel4.setLayout(null);
        adminPanel4.setBounds(0,0,1100,700);
        adminPanel4.setBackground(Color.gray);
        adminPanel4.setVisible(false);



        ImageIcon image2 = new ImageIcon("Images/2.png");
        poster2 = new JLabel(image2);
        poster2.setBounds(0,0,1100,700);



        adminPanel1.add(aL1);
        adminPanel1.add(aL2);
        adminPanel1.add(b9);
        adminPanel1.add(b10);
        adminPanel1.add(manageCus);
        adminPanel1.add(manageDri);
        adminPanel1.add(adminPanel2);
        adminPanel1.add(adminPanel4);
        adminPanel1.add(poster2);
        adminPanel1.setLayout(null);
        adminPanel1.setBounds(0,0,1100,700);
        adminPanel1.setBackground(Color.gray);
        adminPanel1.setVisible(true);


        ImageIcon icon = new ImageIcon("Images/logo.png");

        aDashboardFrame.add(adminPanel1);
        aDashboardFrame.add(adminPanel2);
        aDashboardFrame.add(adminPanel4);
        aDashboardFrame.setLayout(null);
        aDashboardFrame.setTitle("Metro Rail Online Ticketing System");
        aDashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aDashboardFrame.setSize(1100,700);
        aDashboardFrame.setLocationRelativeTo(null);
        aDashboardFrame.setVisible(true);
        aDashboardFrame.setIconImage(icon.getImage());


    }

    public void cusList(Passenger c ,int gap )
    {

        int posY = gap*110;

        adminPanelCus = new JPanel();


        cusNamel = new JLabel("Name: ");
        cusNamel.setBounds(5,5,80,20);
        cusNamel.setForeground(Color.BLACK);


        cusName = new JLabel(c.getName());
        cusName.setBounds(43,5,200,20);
        cusName.setForeground(Color.BLACK);

        cusPhonel = new JLabel("Phone No: ");
        cusPhonel.setBounds(5,23,200,20);
        cusPhonel.setForeground(Color.BLACK);

        cusPhone = new JLabel(c.getPhoneNum());
        cusPhone.setBounds(70,23,150,20);
        cusPhone.setForeground(Color.BLACK);

        cusEmaill = new JLabel("E-mail Address: ");
        cusEmaill.setBounds(5,43,200,20);
        cusEmaill.setForeground(Color.BLACK);

        cusEmail = new JLabel(c.getEmail());
        cusEmail.setBounds(100,43,150,20);
        cusEmail.setForeground(Color.BLACK);

        cusPassl = new JLabel("Password: ");
        cusPassl.setBounds(5,63,200,20);
        cusPassl.setForeground(Color.BLACK);

        cusPass = new JLabel(c.getPassword());
        cusPass.setBounds(65,63,150,20);
        cusPass.setForeground(Color.BLACK);



        adminPanelCus.add(cusName);
        adminPanelCus.add(cusNamel);
        adminPanelCus.add(cusPhone);
        adminPanelCus.add(cusPhonel);
        adminPanelCus.add(cusEmail);
        adminPanelCus.add(cusEmaill);
        adminPanelCus.add(cusPass);
        adminPanelCus.add(cusPassl);
        adminPanelCus.setLayout(null);
        adminPanelCus.setBounds(10 , 10 +posY ,580 , 100 );
        adminPanelCus.setBackground(Color.gray);
        adminPanelCus.setVisible(true);





        adminPanel3.add(adminPanelCus);


    }

    public void driList(MRTpass d ,int gap )
    {

        int posY = gap*110;

        adminPanelDri = new JPanel();


        driNamel = new JLabel("Name: ");
        driNamel.setBounds(5,5,80,20);
        driNamel.setForeground(Color.BLACK);


        driName = new JLabel(d.getName());
        driName.setBounds(43,5,200,20);
        driName.setForeground(Color.BLACK);

        driPhonel = new JLabel("Phone No: ");
        driPhonel.setBounds(5,23,150,20);
        driPhonel.setForeground(Color.BLACK);

        driPhone = new JLabel(d.getPhoneNum());
        driPhone.setBounds(70,23,150,20);
        driPhone.setForeground(Color.BLACK);

        driEmaill = new JLabel("E-mail Address: ");
        driEmaill.setBounds(5,43,150,20);
        driEmaill.setForeground(Color.BLACK);

        driEmail = new JLabel(d.getEmail());
        driEmail.setBounds(100,43,150,20);
        driEmail.setForeground(Color.BLACK);

        driPassl = new JLabel("Password: ");
        driPassl.setBounds(5,63,150,20);
        driPassl.setForeground(Color.BLACK);

        driPass = new JLabel(d.getPassword());
        driPass.setBounds(65,63,150,20);
        driPass.setForeground(Color.BLACK);


        adminPanelDri.add(driName);
        adminPanelDri.add(driNamel);
        adminPanelDri.add(driPhone);
        adminPanelDri.add(driPhonel);
        adminPanelDri.add(driEmail);
        adminPanelDri.add(driEmaill);
        adminPanelDri.add(driPass);
        adminPanelDri.add(driPassl);
        adminPanelDri.setLayout(null);
        adminPanelDri.setBounds(10 , 10 +posY ,580 , 100 );
        adminPanelDri.setBackground(Color.gray);
        adminPanelDri.setVisible(true);



        adminPanel5.add(adminPanelDri);



    }


    public void actionPerformed(ActionEvent e)
    {


        if (e.getSource() == b9)
        {

            System.exit(0);

        }

        if (e.getSource() == b10)
        {

            aDashboardFrame.setVisible(false);
            new Login(passengers, mrtPasses);


        }

        if(e.getSource() == back1)
        {
            adminPanel2.setVisible(false);
            adminPanel1.setVisible(true);

        }


        if(e.getSource() == back2)
        {
            adminPanel4.setVisible(false);
            adminPanel1.setVisible(true);

        }

        if(e.getSource() == manageCus)
        { adminPanel3.removeAll();
            adminPanel1.setVisible(false);
            adminPanel2.setVisible(true);
            for(int i = 0; i< passengers.length; i++)
            {
                if(passengers[i] != null)
                {
                    cusList(passengers[i] , i);
                }
            }
        }


        if(e.getSource() == manageDri)
        { adminPanel5.removeAll();
            adminPanel1.setVisible(false);
            adminPanel4.setVisible(true);
            for(int i = 0; i< mrtPasses.length; i++)
            {
                if(mrtPasses[i] != null)
                {
                    driList(mrtPasses[i] , i);
                }
            }
        }

        if(e.getSource() == remove1)
        {
            String cusDelete = tf1.getText();

            for(int i = 0; i< passengers.length; i++)
            {
                if(passengers[i] != null)
                {
                    if(passengers[i].getName().equals(cusDelete))
                    {
                        passengers[i] = null;
                        adminPanel3.removeAll();
                        adminPanel2.setVisible(false);
                        adminPanel2.setVisible(true);
                        break;
                    }
                }
            }

            for(int i = 0; i< passengers.length; i++)
            {
                if(passengers[i] != null)
                {
                    cusList(passengers[i] , i);
                }
            }
        }


        if(e.getSource() == remove2)
        {
            String driDelete = tf2.getText();

            for(int i = 0; i< mrtPasses.length; i++)
            {
                if(mrtPasses[i] != null)
                {
                    if(mrtPasses[i].getName().equals(driDelete))
                    {
                        mrtPasses[i] = null;
                        System.out.println("Root" +i+ "removed");
                        adminPanel5.removeAll();
                        adminPanel4.setVisible(false);
                        adminPanel4.setVisible(true);
                        break;
                    }
                }
            }


            for(int i = 0; i< mrtPasses.length; i++)
            {
                if(mrtPasses[i] != null)
                {
                    driList(mrtPasses[i] , i);
                    System.out.println(mrtPasses[i].getName());
                }
            }

        }


    }
}
