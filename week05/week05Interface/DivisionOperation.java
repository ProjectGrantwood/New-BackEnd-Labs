package week05.week05Interface;

public class DivisionOperation implements MathOperation {
    @Override
    public double evaluate(double val1, double val2) {
        return val1 / val2;
    }
}
