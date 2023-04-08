package AFactory;

public class Dell extends Device{
    private String ram;
    private String processor;
    private String gpu;

    public Dell(String ramSize, String processorType, String gpuType){
        this.ram = ramSize;
        this.processor = processorType;
        this.gpu = gpuType;
    }
    public String getDetails(){
        return "Dell has ram size: "+this.ram+" processor type: "+this.processor+" and gpu type: "+this.gpu;
    }
    public String toString(){
        return "Hp has ram size: "+this.ram+" processor type: "+this.processor+" and gpu type: "+this.gpu;
    }
}
