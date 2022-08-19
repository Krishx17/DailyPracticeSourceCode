import java.util.Scanner;
public class YoungestProgrammer
{
    public static void main(String[] args)
    {
        int sum;
        System.out.println("Enter the two number you wish to add : ");
        Scanner sc = new Scanner(System.in);
        int num1 , num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 < 100000 & num2 < 100000)
        {
            sum = num1 + num2;
            System.out.println("Sum of the Integers : " + sum);
        }
    }

}

