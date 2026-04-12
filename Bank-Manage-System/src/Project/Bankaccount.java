package Project;

public class Bankaccount
{
    private double balance;

    public Bankaccount()
    {
        this.balance=0.0;
    }

    public Bankaccount(double initialbalance)
    {
        this.balance = initialbalance;
    }

    public double getBalance()
    {
        return balance;
    }

    public boolean deposit(double amount)
    {
        if(amount>0)
        {
            this.balance += amount;
            return true;
        }
        else
        {
            System.out.println("error");
            return false;
        }
    }

    public boolean withdraw(double amount)
    {
        if(amount>0)
        {
            this.balance -= amount;
            return true;
        }
        else
        {
            System.out.println("error");
            return false;
        }
    }

}
