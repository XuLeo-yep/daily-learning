import java.io.IOException;
import java.util.Scanner;

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

    private int getChoice() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        boolean validInput = false;

        while (!validInput){
            System.out.println();
            System.out.println("[0] Quit");
            System.out.println("[1] Display sales (Plain Text)");
            System.out.println("[2] Display sales (HTML)");
            System.out.println("[3] Display sales (XML)");
            System.out.print("choice> ");

            String input = scanner.next();

            try{
                choice = Integer.parseInt(input);
                if(choice >= 0 && choice<= 3){
                    validInput = true;
                }
                else {
                    System.out.println("Please enter a number between 0 and 3");
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid input." +
                        "Please enter a number between 0 and 3.");
            }
            System.out.println();
        }
        return choice;
    }

    private void setSalesFormatter(SalesFormatter newFormatter){
        this.salesFormatter = newFormatter;
    }

    private void displaySales(){
        this.salesFormatter.formatSales( sales);
    }

    private void run(){

    }
}
