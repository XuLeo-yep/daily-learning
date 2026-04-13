package the_gourmet_coffee_system;

import java.util.ArrayList;
import java.util.Iterator;

public class Catalog implements Iterable<Product>{

    private ArrayList<Product> products;


    //Arraylist构造器
    public Catalog() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product products){
        this.products.add(products);
    }

    public Iterator<Product> iterator(){
        return this.products.iterator();
    }

    public Product getProduct(String code){
        for(Product products : products){
            if(code.equals(products.getCode())){
                return products;
            }
        }
        return null;
    }

    public int getNumberOfProducts(){
        return products.size();
    }

}


