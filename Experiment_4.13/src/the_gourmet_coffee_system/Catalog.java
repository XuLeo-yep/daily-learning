package the_gourmet_coffee_system;

import java.util.ArrayList;
import java.util.Iterator;

public class Catalog implements Iterable<Product>{

    private ArrayList<Product> products;


    //Arraylist构造器
    public Catalog() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public Iterator<Product> iterator(){
        return this.products.iterator();
    }

    public Product getProduct(String code){
        for(Product product : products){
            if(code.equals(product.getCode())){
                return product;
            }
        }
        return null;
    }

    public int getNumberOfProducts(){
        return products.size();
    }

}


