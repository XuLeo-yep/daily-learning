import java.util.ArrayList;

/**
 * Catalog
 * Represents a catalog in the library manage system.
 * This class manages a collection of CatalogItems.
 *
 * @author XuLeo
 * @version 1.0
 */
public class Catalog {
    private final ArrayList<CatalogItem> catalog = new ArrayList<>();

    public Catalog() {
    }

    public void addItem(CatalogItem item){
        catalog.add(item);
    }

    public CatalogItem getItem(int index){
        return catalog.get(index);
    }

    public CatalogItem getItem(String code){
        for (CatalogItem item : catalog){
            if (code.equals(item.getCode())){
                return item;
            }
        }
        System.out.println("Item "+code+" not found");
        return null;
    }

    public int getNumberOfItems(){
        return catalog.size();
    }

}
