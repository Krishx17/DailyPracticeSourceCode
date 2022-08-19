public class SumOfNumbers {
    public static void main(String[] args)
    {       
        int sum = 0;
        int num = 324234;
        while (num>0)
        {   int temp = num%10;
            sum += temp;
            num = num/10;
        }
        System.out.println("sum of the digits is : " + sum);
    }
}

