public class Q11 {
    public static void main(String[] args) {
        try {
            divideByZero(80);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero");
        }
    }

    public static void divideByZero(int number) {
        int result = number / 0;
        System.out.println("Result: " + result);
    }
}
