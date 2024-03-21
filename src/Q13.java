public class Q13 {
    public static void main(String[] args) {
        int input = 90;

        try {
            throwExceptions(input);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught an unknown exception: " + e.getMessage());
        }
    }

    public static void throwExceptions(int input){
        int[] arr = {1, 2, 3};

        if (input == 0) {
            int result = 10 / input;
        } else if (input < 0 || input >= arr.length) {
            int value = arr[input];
        } else {
            System.out.println("No exception thrown.");
        }
    }
}