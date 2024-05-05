// AWT GUI app that displays accumulated sum based on input integer entered

import java.awt.*;
import java.awt.event.*;

/**
 * AWTAccumulator
 */
public class AWTAccumulator extends Frame {

    // Declare components & variables
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0;

    // Constructor to setup GUI components and event handlers
    public AWTAccumulator() {
        // GrudLayout 2 rows 2 columns
        setLayout(new GridLayout(2, 2));

        add(new Label("Enter an Integer: ")); // "super" Frame adds anonymous Label

        tfInput = new TextField(10); // Construct TextField
        add(tfInput); // "super" Frame adds tfInput label
        // source tfInput adds anonymous instance of TFInputListener as an ActionEvent
        tfInput.addActionListener(new TFInputListener());


        add(new Label("The Accumulated Sum is: "));

        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);

        setTitle("AWT Accumulator"); // "super" Frame sets title
        setSize(350, 120); // "super" Frame sets initial window size
        setVisible(true); // "super" Frame shows
    }

    // main() method
    public static void main(String[] args) {
        new AWTAccumulator();
    }
    
    // Define inner class to handle input TextFieldchua
    // ActionEvent listener implements ActionListener interface
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            // Get the String entered into the TextField tfInput, convert to int
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn; // Accumulate numbers entered into sum
            tfInput.setText(""); // Clear input TextField
            tfOutput.setText(sum + ""); // Convert int to String and display sum as output
        }
    }
}