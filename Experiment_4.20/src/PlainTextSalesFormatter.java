public class PlainTextSalesFormatter implements SalesFormatter{

    private static PlainTextSalesFormatter singletonInstance;

    static public PlainTextSalesFormatter getSingletonInstance(){
        return singletonInstance;
    }

    private PlainTextSalesFormatter() {
    singletonInstance = new PlainTextSalesFormatter();
    }

    public String formatSales(Sales sales){
        String result = "";

        int i=1 ;

        for (Order order : sales){

            result += String.format("------------------------------------%n");

            result += String.format("Order "+i);

            for (OrderItem orderItem : order){
                result += String.format(order.toString());
            }

            i++;

            result += String.format("Total = %.2f%n",order.getTotalCost());
        }

        return result;
    }


}
