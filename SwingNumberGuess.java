/* Swing number guessing game. The program shall generate random number between 1 to 100 
 * Mask out random number generate and output "You Got It", "Try Higher", "Try Lower"
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Swing app extends from JFrame
public class SwingNumberGuess extends JFrame {

    // Private components
    private JTextField tfRandom, tfGuess;
    private JButton btnGenerate;
    private JLabel outputMessage;

    // Private variables
    private int guessNum, randomNum;
    private String randomString, maskedString = "";

    // Constructor to set up UI component & event handlers
    public SwingNumberGuess() {
        // Set up content-pane
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        // cp adds UI components
        // First row
        cp.add(new JLabel("The Number is "));

        tfRandom = new JTextField(10);
        tfRandom.setHorizontalAlignment(JTextField.RIGHT);
        tfRandom.setEditable(false);
        // Generate 1-100 inclusive
        tfRandom.setText(generateMaskedString());
        cp.add(tfRandom);

        btnGenerate = new JButton("Generate");
        cp.add(btnGenerate);
        
        // Second row
        cp.add(new JLabel("Enter your guess "));

        tfGuess = new JTextField(10);
        tfGuess.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(tfGuess);
        outputMessage = new JLabel("");
        cp.add(outputMessage);

        btnGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                tfRandom.setText(generateMaskedString());
            }
        });

        tfGuess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                guessNum = Integer.parseInt(tfGuess.getText());
                if (guessNum < randomNum) {
                    outputMessage.setText("Try Higher");
                } else if (guessNum > randomNum) {
                    outputMessage.setText("Try Lower");
                } else if (guessNum == randomNum) {
                    outputMessage.setText("You Got It!");
                }
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Guess Number");
        setSize(400, 120);
        setVisible(true);
    }

    public String generateMaskedString() {
        maskedString = ""; // Reset maskedString to empty string
        randomNum =(int)(Math.random() * 100) + 1;
        randomString = randomNum + "";
        for (int idx = 0; idx < randomString.length(); idx++) {
            maskedString += "*";
        }
        return maskedString;
    }

    // Entry main() method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingNumberGuess();
            }
        });
    }
}