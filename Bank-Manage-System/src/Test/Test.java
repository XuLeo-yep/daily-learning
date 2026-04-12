package Test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test
{
    static void main(String[] args) {
        BankAccount accountOne = new BankAccount();
        BankAccount accountTwo = new BankAccount();
        BankAccount accountThree = new BankAccount();
        accountOne.deposit(1000.0);
        accountTwo.deposit(2000.0);
        accountThree.deposit(3000.0);
        Client client= new Client("John Smith");
        client.addAccount(accountOne);
        client.addAccount(accountTwo);
        client.addAccount(accountThree);
        double totalBalance = 0.0;
        for (BankAccount account : client) {
            totalBalance += account.getBalance();
        }
        if (totalBalance != 6000.0) {
            System.out.println("** Test failure");
        }
        System.out.println("done");
    }
}

class BankAccount {
    private double balance;
    public BankAccount() {
        this.balance = 0.0;
    }
    public double getBalance() {
        return this.balance;
    }
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class Client  implements Iterable<BankAccount>  {

    /* Name of client */
    private String name;

    /* Collection of <code>BankAccounts</code> objects.*/
    private ArrayList<BankAccount>  accounts;
    public Client(String initialName)  {
        this.name = initialName;
        this.accounts = new ArrayList<BankAccount>();
    }

    public String  getName() {
        return this.name;
    }

    public void  addAccount(BankAccount bankAccount)  {
        this.accounts.add(bankAccount);
    }
    public Iterator<BankAccount> iterator() {
        return this.accounts.iterator();
    }

    public int  getNumberOfAccounts()  {
        return this.accounts.size();
    }
}

