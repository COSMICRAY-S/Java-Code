import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Parent class containing the main window setup
class ParentWindow extends JFrame {
    protected JButton clickButton;

    // Constructor to initialize the GUI
    public ParentWindow() {
        setTitle("Swing Inheritance Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());

        clickButton = new JButton("Click Me");
        add(clickButton);
    }

    // Method to display the window
    public void showWindow() {
        setVisible(true);
    }
}

// Child class inheriting from ParentWindow and extending functionality
class ChildWindow extends ParentWindow {
    
    public ChildWindow() {
        super(); // Calls ParentWindow constructor

        // Add functionality to button
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked in Child Window!");
            }
        });
    }
}

// Main class to run the program
public class SwingInheritanceExample {
    public static void main(String[] args) {
        ChildWindow window = new ChildWindow(); // Creating object of child class
        window.showWindow(); // Displaying window
    }
}
