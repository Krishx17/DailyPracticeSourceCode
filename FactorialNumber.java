public class FactorialNumber {
    public static void main(String args[]){
        int temp , num ;
		num = 10;
		temp = num;
		for(int i = 1 ; i<num ; i++)
		{
			if((num-i) != 0)
			{	
				temp *= (num-i);
			}
		}
		System.out.println("Factorial of "+ num + " is = " + temp);
    }
}
