import javax.swing.*;
import java.util.HashMap;
public class Hashmap {
    private static final HashMap laptopMap = new HashMap();

    public static Laptop getLaptop(String company){
        LaptopFactory laptopFactory = (LaptopFactory)laptopMap.get(company);
        if(laptopFactory == null){
            laptopFactory = new LaptopFactory(company);
            laptopMap.put(company, laptopFactory);
            System.out.println("\nCreating laptop of Company: " + company);
        }
        return laptopFactory;
    }
}
