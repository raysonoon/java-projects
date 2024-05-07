
/* Swing Calculator app with 3 textfield displaying Num 1, Operator & Num 2 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingCalculator extends JFrame {
    // Private JComponents
    private JTextField tfNum1, tfNum2, tfOpr;
    private JButton[] btnNumbers;
    private JButton btnPlus, btnMinus, btnMultiply, btnDivide, btnClear, btnEqual;
    private int result = 0;
    private String strOpr = "", strNum1 = "", strNum2 = "";

    // Constructor to setup UI components and event handlers
    public SwingCalculator() {
        // Setup UI
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        // Set up top display panel
        JPanel pnlDisplay = new JPanel(new GridLayout(3, 2));
        cp.add(pnlDisplay, BorderLayout.NORTH);

        // Set up display text fields
        tfNum1 = new JTextField(30);
        tfNum2 = new JTextField(30);
        tfOpr = new JTextField(30);
        pnlDisplay.add(new JLabel("Num 1"));
        pnlDisplay.add(tfNum1);
        pnlDisplay.add(new JLabel("Opr"));
        pnlDisplay.add(tfOpr);
        pnlDisplay.add(new JLabel("Num 2"));
        pnlDisplay.add(tfNum2);

        // Set up button display panel
        JPanel pnlButtons = new JPanel(new GridLayout(4, 4));
        cp.add(pnlButtons, BorderLayout.CENTER);

        // Set up common listener for all number buttons (inner class to be declared)
        MyNumberButtonListener lis = new MyNumberButtonListener();

        // Allocate JButton array for number buttons
        btnNumbers = new JButton[10];
        // Initialise each item (JButton) of the array
        for (int i = 0; i < btnNumbers.length; i++) {
            btnNumbers[i] = new JButton(i + "");
            // Add common listener to each JButton
            btnNumbers[i].addActionListener(lis);
        }

        // Adding buttons in the right order
        // First row
        for (int i = 7; i <= 9; i++) {
            pnlButtons.add(btnNumbers[i]);
        }

        btnPlus = new JButton("+");
        pnlButtons.add(btnPlus);

        // Second row
        for (int i = 4; i <= 6; i++) {
            pnlButtons.add(btnNumbers[i]);
        }

        btnMinus = new JButton("-");
        pnlButtons.add(btnMinus);

        // Third row
        for (int i = 1; i <= 3; i++) {
            pnlButtons.add(btnNumbers[i]);
        }

        btnMultiply = new JButton("*");
        pnlButtons.add(btnMultiply);

        // Fourth row
        btnClear = new JButton("C");
        btnEqual = new JButton("=");
        btnDivide = new JButton("/");
        pnlButtons.add(btnClear);
        pnlButtons.add(btnNumbers[0]);
        pnlButtons.add(btnEqual);
        pnlButtons.add(btnDivide);

        // Set up common listener for operator buttons
        MyOperatorButtonListener lisOpr = new MyOperatorButtonListener();

        btnPlus.addActionListener(lisOpr);
        btnMinus.addActionListener(lisOpr);
        btnMultiply.addActionListener(lisOpr);
        btnDivide.addActionListener(lisOpr);

        // Anonymous listener of anonymous inner class for clear button
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                strNum1 = "";
                strNum2 = "";
                tfNum1.setText(strNum1);
                tfNum2.setText(strNum2);
                tfOpr.setText("");
                result = 0;
            }
        });

        // Anonymous listener of anonymous inner class for equal button
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                strOpr = tfOpr.getText();
                int num1 = Integer.parseInt(strNum1);
                int num2 = Integer.parseInt(strNum2);
                switch (strOpr) {
                    case "+":
                        result = num1 + num2;
                        strNum1 = result + "";
                        tfNum1.setText(strNum1);
                        strNum2 = "";
                        tfNum2.setText(strNum2);
                        tfOpr.setText("");
                        break;
                    case "-":
                        result = num1 + num2;
                        strNum1 = result + "";
                        tfNum1.setText(strNum1);
                        strNum2 = "";
                        tfNum2.setText(strNum2);
                        tfOpr.setText("");
                        break;
                    case "*":
                        result = num1 + num2;
                        strNum1 = result + "";
                        tfNum1.setText(strNum1);
                        strNum2 = "";
                        tfNum2.setText(strNum2);
                        tfOpr.setText("");
                        break;
                    case "/":
                        if (num1 != 0 && num2 != 0) {
                            result = num1 / num2;
                        } else {
                            result = 0;
                        }
                        strNum1 = result + "";
                        tfNum1.setText(strNum1);
                        strNum2 = "";
                        tfNum2.setText(strNum2);
                        tfOpr.setText("");
                        break;
                    default:
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Swing Calculator");
        setSize(400, 300);
        setVisible(true);
    }

    private class MyNumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            if (tfOpr.getText().equals("")) { // no operator selected
                strNum1 += evt.getActionCommand();
                tfNum1.setText(strNum1);
            } else {
                strNum2 += evt.getActionCommand();
                tfNum2.setText(strNum2);
            }
        }
    }

    private class MyOperatorButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            switch (evt.getActionCommand()) {
                case "+":
                    tfOpr.setText("+");
                    break;
                case "-":
                    tfOpr.setText("-");
                    break;
                case "*":
                    tfOpr.setText("*");
                    break;
                case "/":
                    tfOpr.setText("/");
                    break;
                default:
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
                new SwingCalculator();
           } 
        });
    }
}