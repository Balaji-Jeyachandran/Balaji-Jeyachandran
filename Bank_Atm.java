/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thirdapplication;
import java.util.*;
/**
 *
 * @author bmsba
 */
class UI
{
    int e;
    public void get(atm atmInstance)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("                         ----------------Welcome to Bank of Barouda--------------------");
        System.out.println("1.Account Details");
        System.out.println("2.Account Balance");
        System.out.println("3.Withdraw Amount");
        System.out.println("4.Deposit Amount");
        System.out.println("Enter any one options below : ");
        e=s.nextInt();
        if(e<=4)
        {
            switch(e)
            {
                case 1:
                    System.out.println("Account Holder name : "+atmInstance.getAccountHolderName());
                    System.out.println("Account NUmber : "+atmInstance.getAccountNumber());
                    break;
                case 2:
                    System.out.println("Available Balance : "+atmInstance.getAccountBalance());
                    break;
                case 3:
                    atmInstance.withdraw();
                    break;
                case 4:
                    atmInstance.deposit();
                    break;
                default :
                    System.out.println("Invalid Input");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
class atm
{
    private String AccountHolderName;
    private String AccountNumber;
    private Double AccountBalance;
    Scanner s = new Scanner(System.in);
    public atm(String AccountHolderName,String AccountNumber,double AccountBalance)
    {
        this.AccountHolderName = AccountHolderName;
        this.AccountNumber = AccountNumber;
        this.AccountBalance = AccountBalance;
    }
    public void setAccountHolderName()
    {
        this.AccountHolderName = AccountHolderName;
    }
    public String getAccountHolderName()
    {
        return AccountHolderName;
    }
    public void setAccountNumber()
    {
        this.AccountNumber = AccountNumber;
    }
    public String getAccountNumber()
    {
        return AccountNumber;
    }
    public void setAccountBalance()
    {
        this.AccountBalance = AccountBalance;
    }
    public double getAccountBalance()
    {
        return AccountBalance;
    }
    public void deposit()
    {
       double Amount;
       System.out.println("Enter the Deposit Amount : ");
       Amount=s.nextInt();
       if(Amount<=0)
       {
           System.out.println("Incorrect Value");
       }
       else
       {
           AccountBalance+=Amount;
           System.out.println(Amount +" is Successfully Deposited");
           System.out.println("Account Balance is :"+AccountBalance);
       }
    }
    public void withdraw()
    {
        double amount;
        System.out.println("Enter the Amount to be withdraw : ");
        amount=s.nextInt();
        if(amount>AccountBalance)
        {
            System.out.println("Insufficient Fund");
        }
        else if(amount==0)
        {
            System.out.println("Incorrect Fund");
        }
        else
        {
            AccountBalance-=amount;
            System.out.println(amount+" is Withdrew succesfully");
            System.out.println("Your Balance is : "+AccountBalance);
        }
    }
}
public class Bank_Atm {
    public static void main(String[] args)
    {
      UI ui = new UI();
      atm obj = new atm("Balaji","11002388394",100000);
      ui.get(obj);
    }
}
