package FactoryDesign;

public class ItemFactory {
    public AbstractClass getItem(String item){
        if(item == null)
            return null;
        if(item.equalsIgnoreCase("YonexRacket"))
            return  new YonexRacket();
        else if (item.equalsIgnoreCase("KonexRacket"))
            return new KonexRacket();
        else if (item.equalsIgnoreCase("ShuttleCock"))
            return new ShuttleCock();
        return null;
    }
}
