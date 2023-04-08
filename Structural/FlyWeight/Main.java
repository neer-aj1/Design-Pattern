import java.util.Scanner;
public class Main {
    private static final String[] brand = { "Apple", "Samsung", "Dell", "HP", "Lenovo"};
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            LaptopFactory laptopFactory = (LaptopFactory)Hashmap.getLaptop(getCompany());
            laptopFactory.setProcessor(getProcessor());
            laptopFactory.setBattery(getBattery());
            laptopFactory.make();
        }
    }

    private static String getCompany(){
        return  brand[(int)(Math.random()*brand.length)];
    }
    private static String getProcessor() {
        System.out.print("\nEnter processor: ");
        String str = sc.next();
        return (String)(str);
    }
    private static String getBattery() {
        System.out.print("\nEnter battery capacity: ");
        String str = sc.next();
        return (String)(str);
    }
}