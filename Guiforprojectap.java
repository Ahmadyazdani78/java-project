/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectap;
import javax.swing.*;import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyBoundsListener;
public class Guiforprojectap  {
   static procses s=new procses();
    JFrame frame;
    TextField tf1;
    TextField tf2;
    JLabel l;
    JLabel l2;
    JButton button;
    JMenu help;
    JMenuItem Diff;
    JMenuItem Integral;
    JMenuItem sum ,max_min;
    JMenuItem power_zarb;
    public  void s(){
        JFrame framest=new JFrame("start");framest.setVisible(true);
        framest.setSize(1080,1080);
        JButton b1=new JButton("Start");b1.setBounds(420,460,150,50);
        framest.add(b1);
        JLabel l3= new JLabel(new ImageIcon("D:/memory/ss.jpg"));framest.add(l3); //l3.setBounds(50,50,150,150);
        b1.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {



                frame = new JFrame("projectap");
        tf1=new TextField();
        tf2=new TextField();
        l=new JLabel("your program");
        l2=new JLabel("answer to your program");
        button=new JButton("solve program");
        help=new JMenu("help");
        Diff=new JMenuItem("Diff");
        Integral=new JMenuItem("Integral");
        sum=new JMenuItem("sum");max_min=new JMenuItem("Max");
        power_zarb=new JMenuItem("power and zarb");
        frame.setSize(1080,1080);  frame.getContentPane().setBackground( Color.orange );
        frame.setVisible(true);
        frame.setLayout(null);
        tf1.setBounds(200,350,250,50);
        tf2.setBounds(475,350,250,50);
        frame.add(tf1);frame.add(tf2);
        button.setBounds(360,460,160,50);
        frame.add(button);frame.add(help);help.add(Diff);help.add(Integral);help.add(sum);help.add(power_zarb); JMenuBar k=new JMenuBar();help.add(max_min);
        k.add(help);   frame.setJMenuBar(k);
      l.setBounds(200,300,150,20);frame.add(l);
      l2.setBounds(475,300,150,20);frame.add(l2);
      button.setBackground(Color.red);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ss=tf1.getText();
               tf2.setText(s.pr(ss));
            }
        });
        max_min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f1=new JFrame("max min");
                f1.setSize(300,300);
                JLabel l3=new JLabel("max and min is diffined for find max min exampal \n max(3,3,4,5,2,1,98)\n\n\n or min(3,42,5,6)");
                l3.setBounds(100,100,200,200);
                f1.add(l3);f1.setVisible(true);
            }
        });
        Diff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f1=new JFrame("Diff");
                f1.setSize(300,300);
                JLabel l3=new JLabel("Diff is diffined for difransiel exampal \n p=diff:4x^2++5x^3\n\n\n or q=diff:6x^3+8x^1");
                l3.setBounds(100,100,200,200);
                f1.add(l3);f1.setVisible(true);
            }
        });
       Integral.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JFrame f1=new JFrame("Diff");
               f1.setSize(300,300);
               JLabel l3=new JLabel("Integral is diffined for Integral exampal \n p=Integral:4x^2++5x^3\n\n\n or q=Integral:6x^3+8x^1");
               l3.setBounds(100,100,200,200);
               f1.add(l3);f1.setVisible(true);
           }
       });
       sum.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {
                                     JFrame f1=new JFrame("Diff");
                                     f1.setSize(300,300);
                                     JLabel l3=new JLabel("sum is difined for sum example p=sum(4x^2+5x^1,5x^2) or sum(sin(4x^2)+sin(4x^2) or sum(2,3,4,5,6)");
                                     l3.setBounds(100,100,200,200);
                                     f1.add(l3);f1.setVisible(true);
                                 }
                             }
       );
       power_zarb.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JFrame f1=new JFrame("Diff");
               f1.setSize(300,300);
               JLabel l3=new JLabel("power and zarb is difined for zarb and power example p=power(4x^2+5x^1)^3 or s=zarb(4x^2,5x^1+6)");
               l3.setBounds(100,100,200,200);
               f1.add(l3);f1.setVisible(true);
           }
       });

    }});}
//  public static void main(String...a){
//        new Guiforprojectap().s();
//  }
}
