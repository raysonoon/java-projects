/* Currency Converter GUI App
 * User can enter amount of SGD, USD, Euro in floating-point number
 * Converted values displayed to 2 decimal places
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Swing app extends from JFrame
public class SwingCurrencyConverter extends JFrame {
    // Private JComponents
    private JTextField tfSGD, tfUSD, tfEuro;

    // Constants
    private static final double USD_SGD = 1.35, USD_EURO = 0.93, SGD_EURO = 0.69;
    private double USD, SGD, Euro;

    // Constructor to set up UI components & event handlers
    public SwingCurrencyConverter() {
        // Set up content-pane
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(3, 2, 10, 3));

        // Add UI components left to right, top to bottom
        cp.add(new JLabel("SGD"));
        tfSGD = new JTextField(10);
        tfSGD.setHorizontalAlignment(JTextField.LEFT);
        cp.add(tfSGD);

        cp.add(new JLabel("USD"));
        tfUSD = new JTextField(10);
        tfUSD.setHorizontalAlignment(JTextField.LEFT);
        cp.add(tfUSD);

        cp.add(new JLabel("Euros"));
        tfEuro = new JTextField(10);
        tfEuro.setHorizontalAlignment(JTextField.LEFT);
        cp.add(tfEuro);

        tfSGD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                SGD = Double.parseDouble(tfSGD.getText());
                USD = SGD / USD_SGD;
                tfUSD.setText(String.format("%.2f", USD));
                Euro = SGD * SGD_EURO;
                tfEuro.setText(String.format("%.2f", Euro));
            }
        });

        tfUSD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                USD = Double.parseDouble(tfUSD.getText());
                SGD = USD * USD_SGD;
                tfSGD.setText(String.format("%.2f", SGD));
                Euro = USD * USD_EURO;
                tfEuro.setText(String.format("%.2f", Euro));
            }
        });

        tfEuro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Euro = Double.parseDouble(tfEuro.getText());
                SGD = Euro / SGD_EURO;
                tfSGD.setText(String.format("%.2f", SGD));
                USD = Euro / USD_EURO;
                tfUSD.setText(String.format("%.2f", USD));      
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Currency Converter");
        setSize(350, 150);
        setVisible(true);
    }

    // Entry main() method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingCurrencyConverter();
            }
        });
    }

}