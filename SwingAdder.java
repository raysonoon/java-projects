/* SwingAdder GUI app with "ADD" button that adds 2 integers & display result
 * "CLEAR" button clear all text fields
 */

 import java.awt.*; // Using AWT's layouts
 import java.awt.event.*; // Using AWT's event classes & listener interfaces
 import javax.swing.*; // Using Swing's components & container

 // Swing app extends javax.swing.JFrame
 public class SwingAdder extends JFrame {
    // Declare private components
    private JTextField tfNumber1, tfNumber2, tfResult;
    private JButton btnAdd, btnClear;
    private int number1, number2, result;

    // Constructor to set up GUI components & event handlers
    public SwingAdder() {
        // Swing components added to content-pane of JFrame
        Container cp = getContentPane(); 
        // Set layout of content-pane
        cp.setLayout(new GridLayout(4, 2, 10, 3));

        // Components are added from left-to-right, top-to-bottom
        cp.add(new JLabel("First Number"));
        tfNumber1 = new JTextField(10); // columns specifies preferred width
        tfNumber1.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(tfNumber1);

        cp.add(new JLabel("Second Number"));
        tfNumber2 = new JTextField(10);
        tfNumber2.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(tfNumber2);

        cp.add(new JLabel("Result"));
        tfResult = new JTextField(10);
        tfResult.setHorizontalAlignment(JTextField.RIGHT);
        tfResult.setEditable(false); // read-only
        cp.add(tfResult);

        btnAdd = new JButton("ADD");
        cp.add(btnAdd);

        btnClear = new JButton("CLEAR");
        cp.add(btnClear);

        // Allocate an anonymous instance of anonymous inner class that
        // implements ActionListener as ActionEvent listener 
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Convert string to integer
                number1 = Integer.parseInt(tfNumber1.getText());
                number2 = Integer.parseInt(tfNumber2.getText());
                result = number1 + number2;
                tfResult.setText(result + "");
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Clear all textfields
                tfNumber1.setText("");
                tfNumber2.setText("");
                tfResult.setText("");
            }
        });

        // For "window-close" button
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Swing Adder");
        setSize(300, 170);
        setVisible(true);
    }

    // Entry main() method
    public static void main(String[] args) {
        // For thread safety, use event-dispatching thread to construct UI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingAdder();
            }
        });
    }
 }