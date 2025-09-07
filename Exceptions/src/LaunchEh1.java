import java.util.Scanner;

public class LaunchEh1
{
    public static void main(String[] args)
    {
        //System.out.println("Syntax error semicolon missing")

        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kindly enter numerator ");
            int n1 = sc.nextInt();
            System.out.println("Kindly enter denominator ");
            int n2 = sc.nextInt();

            int res = n1/n2;

            System.out.println("Result is " + res);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Error occurred " + ex.getMessage());
        }



        System.out.println("Program ended gracefully ");
    }
}
