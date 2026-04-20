import java.util.ArrayList;

public class LibrarySystem {

    private Catalog catalog;

    BorrowerDatabase borrowerDatabase = new BorrowerDatabase();

    public void displayCatalog(){

        System.out.println("----------Catalog-------------");

        for (int i = 0; i < catalog.getNumberOfItems() ; i++) {

            CatalogItem item = catalog.getItem(i);

            System.out.println(item.toString());

        }
    }




}
