import java.util.*;
class ShoppingCartImpl implements ShoppingCart {
    private List<CartItem> items;

    public ShoppingCartImpl() {
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (CartItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public List<CartItem> getItems() {
        return items;
    }
}