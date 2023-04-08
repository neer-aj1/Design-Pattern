public class Main {
    public static void main(String[] args) {
        CartFacade cart = new CartFacade();

        cart.addItem("Apple", 0.99);
        cart.addItem("Banana", 0.49);
        cart.addItem("Orange", 1.49);

        cart.removeItem("Banana");

        System.out.println("Total price: " + cart.getTotalPrice());
        System.out.println("Items in cart: ");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
    }
}