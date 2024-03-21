
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Q14 {
    public static void main(String[] args) {
        try {
            checkInput(-65);//change input
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }

    public static void checkInput(int input) throws CustomException {
        if (input < 0) {
            throw new CustomException("Input cannot be negative.");
        }
        else {
            System.out.println("Input is valid: " + input);
        }
    }
}
