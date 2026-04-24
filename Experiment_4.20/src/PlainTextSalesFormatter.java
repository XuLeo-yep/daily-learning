public class PlainTextSalesFormatter implements SalesFormatter{

    private static PlainTextSalesFormatter plainTextSalesFormatter;

    public static PlainTextSalesFormatter getPlainTextSalesFormatter() {
        if(plainTextSalesFormatter == null){
            plainTextSalesFormatter = new PlainTextSalesFormatter();
        }
        return plainTextSalesFormatter;
    }

    private PlainTextSalesFormatter() {
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
