import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class percentage_GUI {
    static int n,total;
    static float s1,s2,s3,s4,s5,perc,sum;
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(400,100,500,500);
        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        JLabel sub = new JLabel("Enter no. of Subjects");
        sub.setBounds(50,50,200,20);
        f.add(sub);

        JTextField subt = new JTextField();
        subt.setBounds(180,50,30,20);
        f.add(subt);

        JLabel sub1 = new JLabel("Subject 1 ");
        sub1.setBounds(50,100,100,20);
        f.add(sub1);

        JTextField subt1 = new JTextField();
        subt1.setBounds(120,100,50,20);
        f.add(subt1);

        JLabel sub2 = new JLabel("Subject 2 ");
        sub2.setBounds(50,150,100,20);
        f.add(sub2);

        JTextField subt2 = new JTextField();
        subt2.setBounds(120,150,50,20);
        f.add(subt2);

        JLabel sub3 = new JLabel("Subject 3 ");
        sub3.setBounds(50,200,100,20);
        f.add(sub3);

        JTextField subt3 = new JTextField();
        subt3.setBounds(120,200,50,20);
        f.add(subt3);

        JLabel sub4 = new JLabel("Subject 4 ");
        sub4.setBounds(50,250,100,20);
        f.add(sub4);

        JTextField subt4 = new JTextField();
        subt4.setBounds(120,250,50,20);
        f.add(subt4);

        JLabel sub5 = new JLabel("Subject 5 ");
        sub5.setBounds(50,300,100,20);
        f.add(sub5);

        JTextField subt5 = new JTextField();
        subt5.setBounds(120,300,50,20);
        f.add(subt5);

        JButton bt1 = new JButton("submit");
        bt1.setBounds(100,350,100,20);
        f.add(bt1);

        JLabel perct = new JLabel("Percentage");
        perct.setBounds(50,400,100,20);
        f.add(perct);

        JLabel percent = new JLabel();
        percent.setBounds(150,400,100,20);
        f.add(percent);

        f.setVisible(true);

        // ADD ACTION LISTENER

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                n=Integer.parseInt(subt.getText());
                s1=Float.parseFloat(subt1.getText());
                s2=Float.parseFloat(subt2.getText());
                s3=Float.parseFloat(subt3.getText());
                s4=Float.parseFloat(subt4.getText());
                s5=Float.parseFloat(subt5.getText());

                sum = s1+s2+s3+s4+s5;
                total = n*100;

                perc = (sum*100)/total;

                percent.setText(String.valueOf(perc) + " % ");
            }
        });
    }
}
