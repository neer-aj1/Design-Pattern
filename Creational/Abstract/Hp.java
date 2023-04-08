package AFactory;

public class Hp extends Device{
    private String ram;
    private String processor;
    private String gpu;

    public Hp(String ramSize, String processorType, String gpuType){
        this.ram = ramSize;
        this.processor = processorType;
        this.gpu = gpuType;
    }
    public String getDetails(){
        return "Hp has ram size: "+this.ram+" processor type: "+this.processor+" and gpu type: "+this.gpu;
    }

}
