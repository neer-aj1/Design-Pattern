import java.util.*;
class CartFacade {
    private ShoppingCart cart;

    public CartFacade() {
        this.cart = new ShoppingCartImpl();
    }

    public void addItem(String name, double price) {
        CartItem item = new CartItem(name, price);
        cart.addItem(item);
    }

    public void removeItem(String name) {
        List<CartItem> items = cart.getItems();
        for (CartItem item : items) {
            if (item.getName().equals(name)) {
                cart.removeItem(item);
                break;
            }
        }
    }

    public double getTotalPrice() {
        return cart.getTotalPrice();
    }

    public List<CartItem> getItems() {
        return cart.getItems();
    }
}