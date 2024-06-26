
/* AWT Counter that includes 3 buttons for counting up, down and reset
* Attach an anonymous inner class as listener to each button
*/
import java.awt.*;
import java.awt.event.*;

// An AWT GUI program inherits the top-level container java.awt.Frame
public class AWTCounter3ButtonsAnonymousIC extends Frame {
   // Declare private components
   private TextField tfCount;
   private Button btnCountUp, btnCountDown, btnReset;
   private int count = 0;

   // Constructor to setup the GUI components and event handlers
   public AWTCounter3ButtonsAnonymousIC() {
      setLayout(new FlowLayout());
      add(new Label("Counter")); // an anonymous instance of Label
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false); // read-only
      add(tfCount); // "super" Frame adds tfCount

      btnCountUp = new Button("Count Up");
      add(btnCountUp);

      // Construct an anonymous instance of an anonymous inner class.
      // Note the brackets
      // The source Button adds the anonymous instance as ActionEvent listener
      btnCountUp.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });

      btnCountDown = new Button("Count Down");
      add(btnCountDown);
      btnCountDown.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count--;
            tfCount.setText(count + "");
         }
      });

      btnReset = new Button("Reset");
      add(btnReset);
      btnReset.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count = 0;
            tfCount.setText("0");
         }
      });

      // "super" Frame (source object) fires WindowEvent
      // "super" Frame adds an anonymous instance of MyWindowListener
      //   as a WindowEvent listener.
      addWindowListener(new MyWindowListener());

      setTitle("AWT Counter");
      setSize(400, 100);
      setVisible(true);
   }

   // The entry main method
   public static void main(String[] args) {
      new AWTCounter3ButtonsAnonymousIC(); // Let the constructor do the job
   }

   // Define an inner class to handle WindowEvent of this frame
   private class MyWindowListener implements WindowListener {
      // Called back upon clicking close-window button
      @Override
      public void windowClosing(WindowEvent evt) {
         System.exit(0); // Terminate the program
      }

      // Not Used, BUT need to provide empty body to compile
      @Override public void windowOpened(WindowEvent evt) {}
      @Override public void windowClosed(WindowEvent evt) {}
      // For Debugging
      @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
      @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
      @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
      @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }
   }
}