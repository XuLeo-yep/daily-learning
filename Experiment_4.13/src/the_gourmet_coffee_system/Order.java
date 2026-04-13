package the_gourmet_coffee_system;

import java.util.ArrayList;
import java.util.Iterator;

public class Order implements Iterable<OrderItem>{
    private ArrayList<OrderItem> items;

    public Order() {
    this.items = new ArrayList<OrderItem>();
    }

    public void addItem(OrderItem orderItem){
        this.items.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        this.items.remove(orderItem);
    }

    public Iterator<OrderItem> iterator(){
        return this.items.iterator();
    }

    public OrderItem getItem(Product product){
        for(OrderItem item : items){
            if (item.getProduct().equals(product)){
                return item;
            }
        }
        return null;
    }

    public int getNumberOfItems(){
        return items.size();
    }

    public double getTotalCost(){
        double total = 0.0;
        for(OrderItem item : items) {
            total += item.getValue()* item.getQuantity();
        }
        return total;
    }

}
