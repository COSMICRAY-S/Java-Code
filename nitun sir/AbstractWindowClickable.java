import java.awt.*;
import java.awt.event.*;

public class AbstractWindowClickable extends Frame {
    
    public AbstractWindowClickable() {
        setTitle("Abstract AWT Window");
        setSize(400, 300);
        setLayout(new GridLayout());
        setBackground(Color.LIGHT_GRAY);
        
        Button clickButton = new Button("Click");
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });
        add(clickButton);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    
    public static void main(String[] args) {
        AbstractWindowClickable window = new AbstractWindowClickable();
        window.setVisible(true);
    }
}