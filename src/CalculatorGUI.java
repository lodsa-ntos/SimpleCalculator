import javax.swing.*;

// GRAPHIC PART
public class CalculatorGUI extends JFrame {

    String titleOfWindow;
    int width;
    int height;
    boolean visibility;

    public CalculatorGUI() {}

    public CalculatorGUI(String titleOfWindow, int width, int height, boolean visibility) {
        this.titleOfWindow = titleOfWindow;
        this.width = width;
        this.height = height;
        this.visibility = visibility;
    }

    public JFrame CreateCalculatorWindow() {

        /*
    JFrame window = new JFrame(" Simple Calculadora");

            window.setSize(300,300);
            window.setVisible(true);
     */



        return null;
    }

    public String getTitleOfWindow() {
        return titleOfWindow;
    }

    public void setTitleOfWindow(String titleOfWindow) {
        this.titleOfWindow = titleOfWindow;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }


}
