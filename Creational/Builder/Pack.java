package BuilderPattern;

import java.util.ArrayList;
import java.util.List;
public class Pack {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float finalCost = 0.0f;
        for (Item item : items) {
            finalCost += item.price();
        }
        return finalCost;
    }
}
