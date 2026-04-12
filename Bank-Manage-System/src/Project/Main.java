package Project;

public class Main
{
    static void main(String[] args)
    {
        Cust cust = new Cust("John Smith",
                new Bankaccount(1000.0),
                new Bankaccount(2000.0),
                new Bankaccount(3000.0));

        double totalmoney = 0.0;
        for(Bankaccount bankaccount : cust)
        {
            totalmoney+= bankaccount.getBalance();
        }

        System.out.println(totalmoney);
    }

}

