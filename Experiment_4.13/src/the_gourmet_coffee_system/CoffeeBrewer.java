package the_gourmet_coffee_system;

public class CoffeeBrewer extends Product{
        private String model;
        private String waterSupply;
        private int numberOfCups;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWaterSupply() {
        return waterSupply;
    }

    public void setWaterSupply(String waterSupply) {
        this.waterSupply = waterSupply;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public CoffeeBrewer(String initialCode,
                        String initialDescription,
                        double initialPrice,
                        String model,
                        String waterSupply,
                        int numberOfCups) {
        super(initialCode, initialDescription, initialPrice);
        this.model = model;
        this.waterSupply = waterSupply;
        this.numberOfCups = numberOfCups;
    }

    @Override
    public String toString() {
        return  super.toString() + "_" + this.model + "_" +
                this.waterSupply + "_" + this.numberOfCups;
    }
}
