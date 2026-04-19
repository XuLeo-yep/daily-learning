import java.util.ArrayList;

public class BorrowedItems {

    private  ArrayList<CatalogItem> borrowedItems = new ArrayList<>();

    public BorrowedItems() {
    }

    public void addItem(CatalogItem item){
        borrowedItems.add(item);
    }

    public void removeItem(CatalogItem item){
        borrowedItems.remove(item);
    }

    public CatalogItem getItem(int index){
        return borrowedItems.get(index);
    }

    public CatalogItem getItem(String code){
        for (CatalogItem item : borrowedItems){
            if (code.equals(item.getCode())){
                return item;
            }
        }
        System.out.println("Item "+code+" not found");
        return null;
    }

    public int getNumberOfItems(){
        return borrowedItems.size();
    }

}
