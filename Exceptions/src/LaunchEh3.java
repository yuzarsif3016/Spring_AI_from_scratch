import java.util.Scanner;

class Alpha
{
    public void divide() throws ArithmeticException
    {
        Scanner sc ;
        sc= new Scanner(System.in);
        System.out.println("Kindly enter numerator ");
        int n1 = sc.nextInt();
        System.out.println("Kindly enter denominator ");
        int n2 = sc.nextInt();

        int res = n1/n2;

        System.out.println("Result is " + res);
        System.out.println("Program ended smoothly ");
    }
}
public class LaunchEh3
{
    public static void main(String[] args) {
        System.out.println("Main started ");
        Alpha alpha = new Alpha();
        try{
            alpha.divide();

        }catch (ArithmeticException ex){
            System.out.println("Occurred " + ex.getMessage());
        }
        System.out.println("Main terminated ");
    }
}
