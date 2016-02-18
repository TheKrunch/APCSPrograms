/**
 * A class to represent a simple BankAccount
 * 
 * @author (Tim Barron) 
 * @version (1.0)
 */
public class BankAccount
{

    //fields
    private double balance;
    private String owner;
    private int IDNum;
    private static int prevIDNum = 0;

    //constructors
    /**
     * Default Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        // initialise instance variables
        balance = 1.0;
        owner = "Tim Barron";
        prevIDNum++;
        IDNum = prevIDNum;
    }

    public BankAccount(String myOwner)
    {
        // initialise instance variables
        balance = 1.0;
        owner = myOwner;
        prevIDNum++;
        IDNum = prevIDNum;
    }

    public BankAccount(String myOwner, double start)
    {
        // initialise instance variables
        balance = start;
        owner = myOwner;
        prevIDNum++;
        IDNum = prevIDNum;
    }

    // methods
    public double getBalance()
    {
        return balance;
    }

    public String getOwner()
    {
        return owner;
    }


    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    public void printSlip()
    {
        System.out.println("***Account Slip***");
        System.out.println("This is the balance: $" + balance);
        System.out.println("Account owner: " + owner);
    }

}

