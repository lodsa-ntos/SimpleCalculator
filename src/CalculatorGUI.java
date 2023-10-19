import javax.swing.*;
import java.awt.*;

// GRAPHIC PART
public class CalculatorGUI extends JFrame {

    String titleOfWindow;
    int width;
    int height;
    boolean visibility;

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

        // Panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,4));

        // Buttons for numbers from 0 to 9
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        // Buttons for operation
        JButton addOperator = new JButton("+");
        JButton subtractOperator = new JButton("-");
        JButton multiplyOperator = new JButton("x");
        JButton divideOperator = new JButton("÷");

        // Button for clean
        JButton clearOperator = new JButton("C");

        // Add the buttons for numbers from 0 to 9 to the buttons panel
        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);

        // Add the operations buttons to the buttons panel
        buttonPanel.add(addOperator);
        buttonPanel.add(subtractOperator);
        buttonPanel.add(multiplyOperator);
        buttonPanel.add(divideOperator);

        // Add the Button to Clean to the Buttons Panel
        buttonPanel.add(clearOperator);







        // Open the calculator window
        setVisible(visibility);

    }
}
