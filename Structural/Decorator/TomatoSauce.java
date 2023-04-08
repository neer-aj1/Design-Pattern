public class TomatoSauce extends SauceAdder {
    public TomatoSauce(Pasta pasta) {
        super(pasta);
    }

    public String getDescription() {
        return pasta.getDescription() + ", Tomato Sauce";
    }

    public double getCost() {
        return pasta.getCost() + 15;
    }
}