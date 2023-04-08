package FactoryDesign;

public class Main {
    public static void main(String[] args){
        double finalPrice = 0;
        ItemFactory itemFactory = new ItemFactory();
        AbstractClass a = itemFactory.getItem("konexracket");
        finalPrice += a.generateRate();
        System.out.println(finalPrice);
    }
}