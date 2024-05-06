/* AWTCounter with "Count" button,Counter Label & Textfield. Each time button is clicked,
counter value increase by 1 */

import java.awt.*; // AWT container & component classes
import java.awt.event.*; // AWT event classes & listener interfaces

// AWT program inherits from top-level container java.awt.Frame
public class AWTCounter extends Frame {
    private Label lblCount; // Declare Label component
    private TextField tfCount; // Declare TextField component
    private Button btnCount; // Declare Button component
    private int count = 0;

    // Constructor to setup GUI components and event handlers
    public AWTCounter() {
        setLayout(new FlowLayout()); // "super" Frame a Container sets layout to FlowLayout
                                     // to arrange components from left-to-right, top-to-bottom

        // Constructors & adders
        lblCount = new Label("Counter");
        add(lblCount); // "super" Frame container adds TextField component

        tfCount = new TextField(count + "", 10); // construct TextField component with initial text
        tfCount.setEditable(false); // set to read-only
        add(tfCount); // "super" Frame container adds TextField component

        btnCount = new Button("Count"); // construct Button component
        add(btnCount); // "super" Frame container adds Button component

        BtnCountListener listener = new BtnCountListener();
        btnCount.addActionListener(listener);
        // "btnCount" adds an instance of BtnCountListener when clicked
        // BtnCountListener provides ActionEvent handler called actionPerformed()

        setTitle("AWT Counter"); // Frame sets title
        setSize(300,100); // Frame sets initial window size
        setVisible(true); // "super" Frame shows
    }

    // main() method
    public static void main(String[] args) {
        // Invoke constructor to setup GUI by allocating an instance
        //AWTCounter app = new AWTCounter();
        // Anonymous AWTCounter instance
        new AWTCounter();
    }

    // Define inner class to handle "Count" button-click
    private class BtnCountListener implements ActionListener {
        // ActionEvent handler - called upon button-click
        @Override
        public void actionPerformed(ActionEvent evt) {
            ++count;
            // Display counter value on Textfield
            tfCount.setText(count + ""); // Convert int to string
        }
    }
}