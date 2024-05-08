import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlarmClockGUI extends JFrame {
    private JLabel lblHour, lblMin;
    private JButton btnHourUp, btnHourDown, btnMinUp, btnMinDown;

    public AlarmClockGUI() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        JPanel pnlDisplay = new JPanel(new FlowLayout());
        cp.add(pnlDisplay, BorderLayout.CENTER);
        lblHour = new JLabel(String.format("%02d", 0));
        pnlDisplay.add(lblHour);
        pnlDisplay.add(new JLabel(":"));
        lblMin = new JLabel(String.format("%02d", 0));
        pnlDisplay.add(lblMin);

        JPanel pnlButtons = new JPanel(new FlowLayout());
        cp.add(pnlButtons, BorderLayout.SOUTH);
        btnHourUp = new JButton("UP");
        btnHourDown = new JButton("DN");
        pnlButtons.add(new JLabel("Set Hour"));
        pnlButtons.add(btnHourUp);
        pnlButtons.add(btnHourDown);
        btnMinUp = new JButton("UP");
        btnMinDown = new JButton("DN");
        pnlButtons.add(new JLabel("Set Minute"));
        pnlButtons.add(btnMinUp);
        pnlButtons.add(btnMinDown);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Alarm Clock GUI");
        setSize(400, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                new AlarmClockGUI();
            }
        });
    }
}