package AFactory;

public class Nokia extends Device{
    private String ram;
    private String processor;

    public Nokia(String rSize, String pName){
        this.ram = rSize;
        this.processor = pName;
    }
    public String getDetails(){
        return "Nokia has ram: "+this.ram+" and processor "+this.processor;
    }
    public String toString(){
        return "Nokia("+" ram: "+ram+", Processor: "+processor+")";
    }
}
