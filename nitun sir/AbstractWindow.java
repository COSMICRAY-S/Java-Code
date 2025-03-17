
import java.awt.*;
import java.awt.event.*;

public class AbstractWindow extends Frame {
    
    public AbstractWindow() {
        setTitle("Abstract AWT Window");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setBackground(Color.LIGHT_GRAY);
        
        Button closeButton = new Button("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(closeButton);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(50, 80, 100, 100);
        
        g.setColor(Color.RED);
        g.fillOval(200, 80, 100, 100);
        
        g.setColor(Color.GREEN);
        g.drawLine(50, 250, 300, 250);
    }
    
    public static void main(String[] args) {
        AbstractWindow window = new AbstractWindow();
        window.setVisible(true);

        // The setVisible(true); method makes the window visible on the screen.
        // In AWT (Abstract Window Toolkit), components are created but remain hidden until explicitly set to be visible.
        // By calling setVisible(true);, the program ensures that the AbstractWindow frame appears when the application runs.
    }
}
