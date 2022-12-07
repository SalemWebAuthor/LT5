import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame;
        JLabel labelcalc, txt1, txt2;
        JPanel panel;
        JTextField ftxt1, ftxt2;
        JButton button1, button2, button3, button4;
        frame = new JFrame("LT5_SALEM_GUI");
        frame.setSize(315, 300);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelcalc = new JLabel("Basic Calculator (+, -, x, ÷)");
        labelcalc.setBounds(80, 10, 150, 20);
        txt1 = new JLabel("Enter 1st Value : ");
        txt1.setBounds(30,50,100,25);
        txt2 = new JLabel("Enter 2nd Value: ");
        txt2.setBounds(30,80,100,25);
        panel = new JPanel();
        panel.setBounds(0, 0, 468, 300);
        frame.add(panel);
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        panel.add(labelcalc);
        panel.add(txt1);
        panel.add(txt2);
        ftxt1= new JTextField(20);
        ftxt1.setBounds(130, 50, 145, 25);
        panel.add(ftxt1);
        ftxt2 = new JTextField(20);
        ftxt2.setBounds(130, 80, 145, 25);
        panel.add(ftxt2);

        button1 = new JButton("Add (+)");
        button1.setBounds(40, 130,100,25);
        button2 = new JButton("Subtract (-)");
        button2.setBounds(160, 130, 100,25);
        button3 = new JButton("Multiply (x)");
        button3.setBounds(40, 160,100,25);
        button4 = new JButton("Divide (÷)");
        button4.setBounds(160, 160, 100,25);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum = calculation.add(ftxt1.getText(),ftxt2.getText());
                methods.displayMessage1(String.valueOf(sum));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int difference = calculation.minus(ftxt1.getText(),ftxt2.getText());
                methods.displayMessage2(String.valueOf(difference));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int product = calculation.multiply(ftxt1.getText(),ftxt2.getText());
                methods.displayMessage3(String.valueOf(product));
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double quotient = calculation.divide(ftxt1.getText(),ftxt2.getText());
                methods.displayMessage4(String.valueOf(quotient));
            }
        });
        frame.setVisible(true);
    }
}