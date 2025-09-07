import java.util.Scanner;

class Alpha1
{
    public void divide() throws ArithmeticException
    {
        Scanner sc;
        sc= new Scanner(System.in);

        try
        {
            System.out.println("Kindly enter numerator ");
            int n1 = sc.nextInt();
            System.out.println("Kindly enter denominator ");
            int n2 = sc.nextInt();

            int res = n1/n2;

            System.out.println("Result is " + res);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Cannot divide by zero. handled in divide method itself");

            throw e; // after handling throwing the exception called as rethrowing exception
        }
        finally {
            sc.close();
        }


        System.out.println("Program ended smoothly ");
    }
}

public class LaunchEh4
{
    public static void main(String[] args)
    {
        System.out.println("Main started ");
        Alpha1 a= new Alpha1();
        try{
            a.divide();

        }catch (ArithmeticException ex){
            System.out.println("Occurred in main and handled " + ex.getMessage());
        }
        System.out.println("Main terminated ");
    }
}
