import java.util.*;

interface ShoppingCart {
    public void addItem(CartItem item);
    public void removeItem(CartItem item);
    public double getTotalPrice();
    public List<CartItem> getItems();
}