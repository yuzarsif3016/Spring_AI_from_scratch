import java.util.Scanner;

public class LaunchEh2
{
    public static void main(String[] args)
    {
        try {
            int[] numbers = {1, 2, 3};
            int result = 10 / 0; // Will throw ArithmeticException
            System.out.println(numbers[5]); // Would throw ArrayIndexOutOfBoundsException (unreachable here)
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("A general exception occurred: " + e.getMessage());
        }
        System.out.println("After try-catch block");


    }
}
