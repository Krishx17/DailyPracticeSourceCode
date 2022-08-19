/**
Date of Modification : 12/12/21
Question - 1 :
Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction 
if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). 
For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction.
PROBLEM CODE :  HS08TEST
Platform : CodeChef
**/

import java.util.Scanner;

public class practiseCode
{
    public static void main(String[] args)
    {   
        transaction pooja = new transaction();
        pooja.transactionProcess();
    }
}

class transaction
{
    public void transactionProcess()
    {
        double amount , initialBalance , finalBalance;
        System.out.println("Enter the Amount and the Initial Balance : " );
        Scanner sc = new Scanner(System.in);
        amount = sc.nextDouble();
        initialBalance = sc.nextDouble();

        // block of code to check whether the entered amount is a multiple of 5 or not 
        if(amount % 5 == 0 )
        {   
            if(amount < initialBalance)
            {
                finalBalance = (initialBalance-0.50) - amount; 
                System.out.println("Transaction Successfull ! \n Amount Withdrawn = " + amount + "\n Balance Left = " + finalBalance);
            }
            else
            {
                System.out.println("Balance Not Sufficient = " + initialBalance);
            }
        
        }
        else
        {
            System.out.println("Transaction Unsuccessfull ! \n Balance = " + initialBalance);
        }

}
    }