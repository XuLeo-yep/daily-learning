package the_gourmet_coffee_system;

public class Coffee extends Product {

    private String origin;
    private String roast;
    private String flavor;
    private String aroma;
    private String acidity;
    private String body;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String getAcidity() {
        return acidity;
    }

    public void setAcidity(String acidity) {
        this.acidity = acidity;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Coffee(String initialCode, String initialDescription,
                  double initialPrice,
                  String origin,
                  String roast,
                  String flavor,
                  String aroma,
                  String acidity,
                  String body) {
        super(initialCode, initialDescription, initialPrice);
        this.origin = origin;
        this.roast = roast;
        this.flavor = flavor;
        this.aroma = aroma;
        this.acidity = acidity;
        this.body = body;
    }

    @Override
    public String toString() {
        return super.toString() + "_" + this.origin + "_" + this.roast + "_" +
               this.flavor + "_" + this.aroma + "_" + this.acidity + "_" + this.body;
    }
}
