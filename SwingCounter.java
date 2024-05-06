/* SwingCounter with "Count" button,Counter Label & Textfield. Each time button is clicked,
counter value increase by 1 */

import java.awt.*; // Using AWT layouts
import java.awt.event.*; // Using AWT event classes & listener interfaces
import javax.swing.*; // Using Swing components & containers

// Swing GUI application that inherits top-level container javax.swing.JFrame
public class SwingCounter extends JFrame {
    // Private components
    private JTextField tfCount;
    private JButton btnCount;
    private int count = 0;

    // Public constructor to setup GUI components & event handlers
    public SwingCounter() {
        // Retrieve content-pane of JFrame
        // All operations done on content pane
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout()); // Content-pane set to flow layout

        // Allocate JComponents and content-pane adds JComponents
        cp.add(new JLabel("Counter"));

        tfCount = new JTextField("0");
        tfCount.setEditable(false); // read-only
        cp.add(tfCount);

        btnCount = new JButton("Count");
        cp.add(btnCount);

        // Allocate an anonymous instance of anonymous inner class that
        // implements ActionListener as ActionEvent listener
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ++count;
                tfCount.setText(count + "");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit program if close-window button clicked
        setTitle("Swing Counter");
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI construction in Event-Dispatching thread for thread-safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingCounter();
            }
       });
    }
}