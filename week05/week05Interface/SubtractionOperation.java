package week05.week05Interface;

public class SubtractionOperation implements MathOperation {
    @Override
    public double evaluate(double num1, double num2) {
        return num1 - num2;
    }
}
