import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Height_Con_GUI {
    public static final DecimalFormat decfor = new DecimalFormat("0.00");
    static double cent,feet;
    static String ft2,ft3;

    public static void main(String[] args) {




        JFrame f = new JFrame();
        f.setBounds(400,100,400,400);
        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);


        JLabel title = new JLabel(" Height Conversion ");
        title.setBounds(130,50,200,20);
        title.setVisible(true);
        f.add(title);

        JButton b1 = new JButton("CM to INCH");
        b1.setBounds(100,120,150,20);
        b1.setVisible(true);
        f.add(b1);

        JButton b2 = new JButton("INCH to CM");
        b2.setBounds(100,200,150,20);
        b2.setVisible(true);
        f.add(b2);

        f.setVisible(true);



        // Feet to CM

        JFrame f3 = new JFrame();
        f3.setBounds(400,100,400,400);
        f3.setResizable(false);
        f3.setLayout(null);

        JLabel fttocm = new JLabel("FEET to CM");
        fttocm.setBounds(100,50,130,20);
        fttocm.setFont(new Font("ARIAL",Font.BOLD,20));
        f3.add(fttocm);

        JLabel ft1 = new JLabel("Feet");
        ft1.setBounds(50,120,50,20);
        ft1.setFont(new Font("ARIAL",Font.BOLD,20));
        f3.add(ft1);

        JTextField ftl1 = new JTextField();
        ftl1.setBounds(100,120,150,20);
        f3.add(ftl1);

        JButton b4 = new JButton("convert");
        b4.setBounds(100,170,150,20);
        f3.add(b4);

        JLabel cmt = new JLabel("Cm");
        cmt.setBounds(50,220,50,20);
        cmt.setFont(new Font("ARIAL",Font.BOLD,18));
        f3.add(cmt);

        JLabel cmtl = new JLabel("0.0");
        cmtl.setBounds(120,222,100,16);
        cmtl.setFont(new Font("ARIAL",Font.PLAIN,20));
        f3.add(cmtl);
        cmtl.setVisible(true);


        // CM to FEET

        JFrame f2 = new JFrame();
        f2.setBounds(400,100,400,400);
        f2.setResizable(false);
        f2.setLayout(null);

        JLabel cmtoft = new JLabel("CM to FEET");
        cmtoft.setBounds(100,50,130,20);
        cmtoft.setFont(new Font("ARIAL",Font.BOLD,20));
        f2.add(cmtoft);

        JLabel cm = new JLabel("cm");
        cm.setBounds(50,120,50,20);
        cm.setFont(new Font("ARIAL",Font.BOLD,20));
        f2.add(cm);

        JTextField cml = new JTextField();
        cml.setBounds(100,120,150,20);
        f2.add(cml);

        JButton b3 = new JButton("convert");
        b3.setBounds(100,170,150,20);
        f2.add(b3);

        JLabel ft = new JLabel("feet");
        ft.setBounds(50,220,50,20);
        ft.setFont(new Font("ARIAL",Font.BOLD,18));
        f2.add(ft);



        JLabel ftl = new JLabel("0.0");
        ftl.setBounds(120,222,100,16);
        ftl.setFont(new Font("ARIAL",Font.PLAIN,20));
        f2.add(ftl);
        ftl.setVisible(true);




        // ACTION PERFORMED

//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                f2.setVisible(true);
//
//            }
//        });


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.setVisible(true);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Calculation
                feet = Double.parseDouble(ftl1.getText());
                cent = feet*30.48;
                ft2=decfor.format(cent);
                ft3 = String.valueOf(ft2);
                cmtl.setText(ft3);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Calculation
                cent = Double.parseDouble(cml.getText());
                feet = cent/30.48;
                ft2=decfor.format(feet);
                ft3 = String.valueOf(ft2);
                ftl.setText(ft3);
            }
        });
    }
}
