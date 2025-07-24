
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class GridLayoutTest extends JFrame {
        JLabel labelName;
        JTextField textName;
        JLabel labelPassword;
        JPasswordField passwordField;
        JButton loginButton;

        public GridLayoutTest() {
            // Set window title
            super("Login Form");

            // Initialize components
            labelName = new JLabel("Name", JLabel.CENTER);
            textName = new JTextField(10);

            labelPassword = new JLabel("Password", JLabel.CENTER);
            passwordField = new JPasswordField(10);

            loginButton = new JButton("Login");

            // Set layout with 3 rows, 2 columns, and 5-pixel gaps
            setLayout(new GridLayout(3, 2, 5, 5));

            // Add components row-by-row, left to right
            add(labelName);
            add(textName);
            add(labelPassword);
            add(passwordField);
            add(loginButton);  // Adds to the 5th cell
            // 6th cell will remain empty

            // Add action listener to login button
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(GridLayoutTest.this,
                            "Login attempt with username: " + textName.getText(),
                            "Login Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            });

            // Basic settings
            setSize(300, 170);
            setLocationRelativeTo(null); // Center the window
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }

        public static void main(String[] args) {
            new GridLayoutTest();
        }
    }
