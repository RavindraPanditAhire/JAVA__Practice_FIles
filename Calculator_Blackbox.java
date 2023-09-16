import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_Blackbox extends JFrame implements ActionListener {

    private JTextField display;
    private JButton[] buttons;
    private String[] labels = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };

    public Calculator_Blackbox() {
        super("Calculator");

        // Create the display
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display, BorderLayout.NORTH);

        // Create the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        buttons = new JButton[labels.length];
        for (int i = 0; i < labels.length; i++) {
            buttons[i] = new JButton(labels[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }
        add(buttonPanel, BorderLayout.CENTER);

        // Set the frame properties
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Handle the button click
        switch (command) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                display.setText(display.getText() + command);
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                display.setText(display.getText() + " " + command + " ");
                break;
            case "=":
                try {
                    double result = evaluate(display.getText());
                    display.setText(String.valueOf(result));
                } catch (Exception ex) {
                    display.setText("Error");
                }
                break;
                            case ".":
                if (!display.getText().contains(".")){

                }

    
}
    }

    private double evaluate(String text) {
        return 0;
    }

    public static void main(String[] args) {
        Calculator_Blackbox cb=new Calculator_Blackbox();
        
    }
}