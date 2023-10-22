import javax.swing.*;

public class CalculatorLogic extends JFrame {

    double num1, num2;
    String operator;

    public CalculatorLogic() {}

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double performCalculation() {
        return 0;
    }
}
