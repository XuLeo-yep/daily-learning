import java.util.ArrayList;

public class BorrowerDatabase {

    private ArrayList<Borrower> borrowers = new ArrayList<>();

    public void addBorrower(Borrower borrower){
        borrowers.add(borrower);
    }

    public Borrower getBorrower(int index){
        return borrowers.get(index);
    }

    public Borrower getBorrower(String id){
        for (Borrower borrower : borrowers){
            if (id.equals(borrower.getId())){
                return borrower;
            }
        }
        return null;
    }

    public int getNumberOfBorrowers(){
        return borrowers.size();
    }

}
