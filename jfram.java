import java.awt.Dimension;
import java.awt.Point;
import javax.swing.*;

public class jfram {
    public static void main(String[] args) {
        // Create the SimpleJFrame
        SimpleJFrame simpleFrame = new SimpleJFrame("Simple JFrame Example");
        simpleFrame.setVisible(true);
    }
}

class SimpleJFrame extends JFrame {
    public SimpleJFrame(String title) {
        super(title);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        setSize(500, 400);

        // Set the location of the frame (x, y coordinates on screen)
        setLocation(200, 150);

        // Get and print the size and location
        Dimension size = getSize();
        Point location = getLocation();

        System.out.println("Frame size: width = " + size.width + ", height = " + size.height);
        System.out.println("Frame location: x = " + location.x + ", y = " + location.y);
    }
}