public class Main {
    public static void main(String[] args) {
        Pasta alfredo = new Alfredo();
        System.out.println("Alfredo Pasta: " + alfredo.getDescription() + " ₹" + alfredo.getCost());

        Pasta tomatoSaucePasta = new TomatoSauce(new Alfredo());
        System.out.println("Alfredo Pasta with Tomato Sauce: " + tomatoSaucePasta.getDescription() + " ₹" + tomatoSaucePasta.getCost());
    }
}