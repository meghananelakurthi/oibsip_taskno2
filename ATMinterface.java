import java.util.*;
class ATMinterface
{
public static void main(String args[])
{
int balance=50000;
int withdrawl=0;
int deposit=0;
int transfer_amount=0;
int pin=8402;
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to ATM!\n");
System.out.println("please insert your card\n");
System.out.println("Don't pull the card until the transaction is completed\n");
System.out.println("enter your atm pin:");
pin=sc.nextInt();
if(pin==8402)
{
while(true)
{
System.out.println("Enter your choice:\n");
System.out.println("1.Withdraw\n");
System.out.println("2.Deposit\n");
System.out.println("3.Balance\n");
System.out.println("4.Transferamount\n");
System.out.println("5.TransactionHistory\n");
System.out.println("6.Exit");
int ch= sc.nextInt();
switch(ch)
{
case 1:
System.out.println("enter the amount to be withdraw:");
withdrawl=sc.nextInt();
if(balance>=withdrawl)
{
balance=balance-withdrawl;
System.out.println("kindly collect your cash!");
System.out.println("remaining balance is:"+balance);
break;
}
else
{
System.out.println("Balance is insufficient");
}
case 2:
System.out.println("enter the amount to be deposited:");
deposit=sc.nextInt();
balance=balance+deposit;
System.out.println("deposited amount is:"+balance);
break;
case 3:
System.out.println("available balance in the account is:"+balance);
break;
case 4:
System.out.println("enter the amount to be transfer:"+transfer_amount);
transfer_amount=sc.nextInt();
System.out.println("your amount" +transfer_amount+" is successfully transferred.");
balance=balance-transfer_amount;
System.out.println("remaining balance after transaction:"+balance);
break;
case 5:
System.out.println("Transaction History:\n");
System.out.println("withdrawl amount:"+withdrawl);
System.out.println("Deposited amount:"+deposit);
System.out.println("Transferred amount:"+transfer_amount);
System.out.println("balance amount:"+balance);
System.out.println("Thank you for transaction!");
System.out.println("visit Again!");
case 6:
System.out.println("Thank you for Coming!");
System.out.println("visit Again!");
System.exit(0);
}
}
}
else
{
System.out.println("Please enter a valid pin!");
}
}
}




