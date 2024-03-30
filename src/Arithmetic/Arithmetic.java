package Arithmetic;

public class Arithmetic<B1, B2> {
    private B1 num1;
    private B2 num2;

    public Arithmetic(B1 num1, B2 num2) {
        if (!(num1 instanceof Number) || !(num2 instanceof Number)) {
            throw new IllegalArgumentException("Invalid Types!");
        }

        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add() {
        return ((Number) num1).doubleValue() + ((Number) num2).doubleValue();
    }

    public Number subtract() {
        return ((Number) num1).doubleValue() - ((Number) num2).doubleValue();
    }

    public Number multiply() {
        return ((Number) num1).doubleValue() * ((Number) num2).doubleValue();
    }

    public Number divide() {
        Integer divisor = ((Number) num2).intValue();
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero not allowed!");
        }

        return ((Number) num1).doubleValue() / ((Number) num2).doubleValue();
    }

    public Number getMin() {
        return Math.min(((Number) num1).doubleValue(), ((Number) num2).doubleValue());
    }

    public Number getMax() {
        return Math.max(((Number) num1).doubleValue(), ((Number) num2).doubleValue());
    }
}