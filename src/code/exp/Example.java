package code.exp;

public class Example {
    public static void main(String[] args) {
        try {
            // Some condition that triggers an exception
            boolean condition = true;

            if (condition) {
                // Throw a custom exception
                throw new CustomException("This is a custom exception.");
            } else {
                // Continue normal execution if the condition is false
                System.out.println("No exception occurred.");
            }
        } catch (CustomException e) {
            // Handle the custom exception
            System.err.println("Caught CustomException: " + e.getMessage());
        }
    }
}
