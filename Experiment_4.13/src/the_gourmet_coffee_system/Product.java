
package the_gourmet_coffee_system;

public class Product {

    private String code;
    private String description;
    private double price;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Product(String initialCode,
                   String initialDescription,
                   double initialPrice) {
       setCode(initialCode);
       setPrice(initialPrice);
       setDescription(initialDescription);
    }

    public boolean equals(Product product){
        if(this.code.equals(product.code)){
            System.out.println("Equal");
            return true;
        }
        else {
            System.out.println("Unequal");
            return false;
        }
    }

    @Override
    public String toString() {
        return this.code + "_" + this.description + "_" + this.price;
    }
}
