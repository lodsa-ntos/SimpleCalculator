import javax.swing.*;

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

        setTitle(titleOfWindow);
        setSize(width, height);
        setVisible(visibility);


    }
}
