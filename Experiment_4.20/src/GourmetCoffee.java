public class GourmetCoffee {
    private Sales sales;

    private SalesFormatter salesFormatter;

    static void main(String[] args) {

    }

    private GourmetCoffee(){
        sales = new Sales();
        salesFormatter = new SalesFormatter() {
            @Override
            public String formatSales(Sales sales) {
                return "";
            }
        };
    }

    private Catalog loadCatalog(){
        return null;
    }

    private  void loadSales(Catalog catalog){

    }

    private int getChoice(){
        return 0;
    }

    private void setSalesFormatter(SalesFormatter newFormatter){

    }

    private void displaySales(){

    }

    private void run(){

    }
}
