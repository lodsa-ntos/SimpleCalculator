import javax.swing.*;

public class MySimpleCalculator extends JFrame {

    public static void main(String[] args) {

        // Create the Calculator Window
        // SwingUtilities - A collection of utility methods for Swing
        javax.swing.SwingUtilities.invokeLater(() -> {
            CalculatorGUI calculatorGUI = new CalculatorGUI();
            CalculatorLogic calculatorLogic = new CalculatorLogic();
        });

    }

}
