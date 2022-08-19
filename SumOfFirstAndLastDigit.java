class SumOfFirstAndLastDigit{
    public static void main(String args[]){
int num = 2346;
int count = 1;
int sum = 0;
int temp;
while(num>0)
{
    
    temp = num % 10;
    if (count == 1 || num<10)
    {
        sum += temp;
    }
    num = num/10;
    count++;
}
System.out.println("the sum of the first and the last digits of the integer :"+sum);
    }
}
