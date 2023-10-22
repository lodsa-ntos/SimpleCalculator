import javax.swing.*;
import java.awt.*;

// GRAPHIC PART
public class CalculatorGUI extends JFrame {

    String titleOfWindow;
    int width;
    int height;
    boolean visibility;
    Dimension dimension;

    public CalculatorGUI() {

        this.titleOfWindow = "Simple Calculator";
        this.width = 300;
        this.height = 300;
        this.visibility = true;

        setTitle(titleOfWindow); // Title
        setSize(width, height); // Size

        // It should not continue to run in the background after closing the calculator window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Calculator display
        JTextField display = new JTextField(20);
        display.setEditable(false); // Read-only
        display.setVisible(true);

        // Panel for the buttons
        JPanel buttonPanelNumbers = new JPanel();
        buttonPanelNumbers.setLayout(new GridLayout(4,3));

        // Buttons for numbers from 1 to 9
        // Add the buttons for numbers from 0 to 9 to the buttons panel
        for (int i = 1; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            buttonPanelNumbers.add(button);

            button.addActionListener(e -> {
                String number = button.getText();
                display.setText(display.getText() + number);
            });
        }

        // Button 0
        JButton button0 = new JButton("0");
        buttonPanelNumbers.add(button0);

        // Button Ponto Final
        JButton buttonPonto = new JButton(".");
        buttonPanelNumbers.add(buttonPonto);

        // Panel for the operation buttons
        JPanel buttonPanelOperation = new JPanel();
        buttonPanelOperation.setLayout(new GridLayout(3,2));

        // Buttons for operation
        JButton addOperator = new JButton("+");
        JButton subtractOperator = new JButton("-");
        JButton multiplyOperator = new JButton("x");
        JButton divideOperator = new JButton("÷");
        JButton equalsOperator = new JButton("=");

        // Button for clean
        JButton clearOperator = new JButton("C");

        // Add the operations buttons to the buttons panel
        buttonPanelOperation.add(addOperator);
        buttonPanelOperation.add(subtractOperator);
        buttonPanelOperation.add(multiplyOperator);
        buttonPanelOperation.add(divideOperator);
        buttonPanelOperation.add(equalsOperator);
        buttonPanelOperation.add(clearOperator);

        // Add the calculator display at the top of the window
        add(display, BorderLayout.NORTH);

        // Add the button panel to the center of the window
        add(buttonPanelNumbers, BorderLayout.WEST);

        // Add the button panel to the center of the window
        add(buttonPanelOperation, BorderLayout.EAST);

        // Open the calculator window
        setVisible(visibility);

    }
}
