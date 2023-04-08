package AFactory;
public class Client {
    public static void main(String []args){
        Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DELL);
        System.out.println(dell.getDetails());
    }
}
