import java.util.Scanner;
public class ReverseNumber
{
    
     public static void main(String[] args)
    {   
        //  Question 4 - Given an integer N , WAP to reverse it .
        int num = 453;
        while(num > 0)
        {
            int temp = num % 10;
            System.out.println("Number Reversed : " + temp);
            num /= 10;
        }
    }
}