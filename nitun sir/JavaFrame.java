// import javax.swing.*;
// import java.awt.*;

// public class JavaApplet extends JApplet{
//     public void paint(Graphics g){
//         g.setColor(Color.red);
//         g.drawString("Welcome to Applet", 50, 60);
//     }
    
// }

import javax.swing.*;
import java.awt.*;

public class JavaFrame extends JFrame {
    public JavaFrame() {
        setTitle("Java GUI Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawString("Welcome to Java Swing!", 150, 150);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JavaFrame frame = new JavaFrame();
            frame.setVisible(true);
        });
    }
}
