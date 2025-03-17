import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Class that represents the Swing Window
class SwingWindow extends JFrame {
    private JButton clickButton;

    // Constructor to initialize the GUI
    public SwingWindow() {
        setTitle("Swing Window Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        clickButton = new JButton("Click");
        add(clickButton);

        // Association: Using an external class to handle button actions
        ButtonHandler handler = new ButtonHandler();
        clickButton.addActionListener(handler);
    }

    // Display the window
    public void showWindow() {
        setVisible(true);
    }
}

// Class associated with SwingWindow to handle button actions
class ButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Button Clicked!");
    }
}

// Main class
public class SwingExample {
    public static void main(String[] args) {
        SwingWindow window = new SwingWindow(); // Object creation via constructor
        window.showWindow(); // Display the window
    }
}
