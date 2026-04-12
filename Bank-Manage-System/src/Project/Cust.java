package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Cust implements Iterable<Bankaccount>
{
    private String name;

    private ArrayList<Bankaccount> accounts;


    public Cust(String name,Bankaccount...initialAccounts)
    {
        this.name = name;
        this.accounts = new ArrayList<Bankaccount>();

        this.accounts.addAll(Arrays.asList(initialAccounts));
    }

    public String getName()
    {
        return name;
    }

    public void addBankaccount(Bankaccount bankaccount)
    {
        this.accounts.add(bankaccount);
    }

    @Override
    public Iterator<Bankaccount > iterator()
    {
        return this.accounts.iterator();
    }

    public int getNumberOfAccounts()
    {
        return this.accounts.size();
    }
}
