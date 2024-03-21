public class Q12 {
    public static void main(String[] args) {
        try {
            throwExceptions(1);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Array index out of bounds");
        }
    }

    public static void throwExceptions(int input) {
        if (input == 0) {
            int result = 5 / 0;
        } else if (input == 1) {
            int[] arr = new int[3];
            int value = arr[5];
        } else {
            System.out.println("No exception thrown.");
        }
    }
}
