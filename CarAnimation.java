import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class CarAnimation extends JFrame implements ActionListener {

    JLabel title, fname, sname, result;
    String r1, r2, r3, r4, r5;
    JTextField s1, s2, s3;
    JButton add, sub, mul, div, mod;

    CarAnimation() {
        setTitle("New Example Writing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500, 300);
        setLocation(100, 150);

        title = new JLabel("WELCOME TO RAVINDRA'S CALCULATOR");
        add(title);
        title.setForeground(Color.red);
        title.setAlignmentY(CENTER_ALIGNMENT);
        fname = new JLabel("Enter First Number");
        add(fname);
        fname.setForeground(Color.blue);
        s1 = new JTextField(10);
        add(s1);
        sname = new JLabel("Enter Second Number");
        add(sname);
        sname.setForeground(Color.blue);
        s2 = new JTextField(10);
        add(s2);
        result = new JLabel("Result: ");
        add(result);
        result.setForeground(Color.blue);
        s3 = new JTextField(10);
        add(s3);
        add = new JButton("+");
        add(add);
        add.setBackground(Color.CYAN);
        sub = new JButton("-");
        add(sub);
        sub.setBackground(Color.CYAN);
        mul = new JButton("*");
        add(mul);
        mul.setBackground(Color.CYAN);
        div = new JButton("/");
        add(div);
        div.setBackground(Color.CYAN);
        mod = new JButton("%");
        add(mod);
        mod.setBackground(Color.CYAN);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);

        validate();
    }

    public static void main(String[] args) {
        CarAnimation ac = new CarAnimation();
        ac.setVisible(true);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        int num1 = Integer.parseInt(s1.getText());
        int num2 = Integer.parseInt(s2.getText());
        r1 = Integer.toString(num1 + num2);
        r2 = Integer.toString(num1 - num2);
        r3 = Integer.toString(num1 * num2);
        r4 = Integer.toString(num1 / num2);
        r5 = Integer.toString(num1 % num2);

        if (e.getSource() == add) {
            s3.setText(r1);
            setBackground(Color.yellow);
            
        } else if (e.getSource() == sub) {
            s3.setText(r2);
            setBackground(Color.green);

        } else if (e.getSource() == mul) {
            s3.setText(r3);
            setBackground(Color.lightGray);

        } else if (e.getSource() == div) {
            s3.setText(r4);
            setBackground(Color.pink);

        } else if (e.getSource() == mod) {
            s3.setText(r5);
            setBackground(Color.orange);
        }
        // s3.setText("Ravindra's Calculator");s3.setForeground(Color.magenta);

    }
}