import java.util.ArrayList;

public class Borrower {

    private final String id;

    private final String name;

    private BorrowedItems borrowedItems;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Borrower(String id, String name, BorrowedItems borrowedItems) {
        this.id = id;
        this.name = name;
        this.borrowedItems = new BorrowedItems();
    }

    public BorrowedItems getBorrowedItems() {
        return borrowedItems;
    }
}
