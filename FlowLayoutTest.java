import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest extends JFrame{
    JLabel name = new JLabel("Name");
    JTextField textNmae = new JTextField(10);
    JButton submitButton = new JButton("Submit");

    public FlowLayoutTest(){
        // Create a main panel with BorderLayout to achieve justification to LEFT and RIGHT
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Left-aligned components in a FlowLayout panel
        JPanel leftSide = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftSide.add(name);
        leftSide.add(textNmae);
        leftSide.add(new JButton("Search"));

        // Right-aligned components in a FlowLayout panel
        JPanel rightSide = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rightSide.add(submitButton);

        // Add both panels to the main panel
        mainPanel.add(leftSide, BorderLayout.WEST);
        mainPanel.add(rightSide, BorderLayout.EAST);

        // Add the main panel to the frame
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.NORTH);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args){
        new FlowLayoutTest();
    }
}