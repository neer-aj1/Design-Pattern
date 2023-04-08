package AFactory;

public class OnePlus extends Device{
    private String ram;
    private String processor;

    public OnePlus(String rSize, String pName){
        this.ram = rSize;
        this.processor = pName;
    }
    public String getDetails(){
        return "OnePlus has ram: "+this.ram+" and processor "+this.processor;
    }
    public String toString(){
        return "OnePlus("+" ram: "+ram+", Processor: "+processor+")";
    }
}
