public class LaptopFactory implements Laptop{
    private String company;
    private String processor;
    private String battery;

    public LaptopFactory(String company){
        this.company = company;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public void make() {
        System.out.println("\nLaptop: Company: "+company+", processor: "+processor+", battery: "+battery);
    }
}
