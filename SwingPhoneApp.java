/* Swing Phone App that allows user to enter phone number and pushes "CALL" button
* to start a phone call. Once call is started, label of "CALL" button changes to
"HANG UP". When the user hangs up, the display is cleared
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Swing app extends JFrame
public class SwingPhoneApp extends JFrame {
    // Private JComponents
    private JButton[] btnNumbers; // array of JButtons
    private JButton btnCall, btnClear;
    private JTextField tfDisplay;

    // Private instance variables
    private String strPhoneNumber = "";
    private boolean isCalling = false;

    // Constructor to setup UI components & event-handling
    public SwingPhoneApp() {
        // Set up content-pane
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        // Set up top display panel
        JPanel pnlDisplay = new JPanel(new FlowLayout());
        cp.add(pnlDisplay, BorderLayout.NORTH);

        // Set up display text field
        tfDisplay = new JTextField(25);
        tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
        tfDisplay.setEditable(false);
        pnlDisplay.add(tfDisplay);

        // Set up center button panel
        JPanel pnlButtons = new JPanel(new GridLayout(4, 3, 3, 3));
        cp.add(pnlButtons, BorderLayout.CENTER);

        // Set up common listener for all JButtons
        MyNumberButtonListener lis = new MyNumberButtonListener();

        // Allocate JButton array for number buttons
        btnNumbers = new JButton[10];
        // Allocate each item (JButton) of the array
        for (int idx = 0; idx < btnNumbers.length; idx++) {
            btnNumbers[idx] = new JButton(idx + "");
            // Add common listener to each of the JButton
            btnNumbers[idx].addActionListener(lis);
        }

        // Add JButtons in the right order
        // 1 - 9
        for (int idx = 1; idx <= 9; idx++) {
            pnlButtons.add(btnNumbers[idx]);
        }

        btnClear = new JButton("CLEAR");
        pnlButtons.add(btnClear);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                strPhoneNumber = "";
                tfDisplay.setText(strPhoneNumber);
            }
        });

        pnlButtons.add(btnNumbers[0]);

        btnCall = new JButton("CALL");
        pnlButtons.add(btnCall);
        btnCall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (isCalling) {
                    isCalling = false;
                    strPhoneNumber = "";
                    tfDisplay.setText(strPhoneNumber);
                    btnCall.setText("CALL");
                    // hangup()
                } else {
                    isCalling = true;
                    btnCall.setText("HANG UP");
                    // call(strPhoneNumber)
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setTitle("Phone App");
        setVisible(true);
    }

    // Named inner listener class for number buttons
    private class MyNumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            // evt.getActionCommand() gets the label of the button that fires the event
            strPhoneNumber += evt.getActionCommand();
            tfDisplay.setText(strPhoneNumber);
        }
    }

    public static void main(String[] args) {
        // Recommended to run the GUI construction in
        //  Event Dispatching thread for thread-safe operations
        SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
              new SwingPhoneApp(); // Let the constructor does the job
           }
        });
     }
}
