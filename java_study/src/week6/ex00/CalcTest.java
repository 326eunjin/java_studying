package week6.ex00;

class Calculator implements Calc {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0)
            return ERROR;
        else
            return num1 / num2;
    }
}

public class CalcTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Calc calc = new Calculator();
        System.out.println(calc.subtract(num1, num2));
    }
}