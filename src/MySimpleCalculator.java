import javax.swing.*;
import java.awt.*;

public class MySimpleCalculator extends JFrame {

    public static void main(String[] args) {

        // Create the Calculator Window
        // SwingUtilities - A collection of utility methods for Swing
        javax.swing.SwingUtilities.invokeLater(() -> {

            JFrame window = new JFrame();

            window.setSize(300,300);
            window.setVisible(true);

        });

    }

}
