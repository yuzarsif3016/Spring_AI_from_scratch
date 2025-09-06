import java.util.Arrays;
import java.util.Scanner;

public class LaunchArray
{
    public static void main(String[] args)
    {
//
//         int[] marks = new int[5];
//
//         marks[0] = 54;
//         marks[1] = 55;
//         marks[2] = 64;
//         marks[3] = 76;
//         marks[4] = 84;
//
//        System.out.println(Arrays.toString(marks));

        int[] marks = new int[6];
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < marks.length ; i++)
        {
            System.out.println("Enter the marks of student " +i);
            marks[i] = sc.nextInt();
        }

        System.out.println("Marks of student is");
        System.out.println(Arrays.toString(marks));
    }
}
