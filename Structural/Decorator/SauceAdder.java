public abstract class SauceAdder implements Pasta {
    protected Pasta pasta;

    public SauceAdder(Pasta pasta) {
        this.pasta = pasta;
    }

    public String getDescription() {
        return pasta.getDescription();
    }

    public double getCost() {
        return pasta.getCost();
    }
}