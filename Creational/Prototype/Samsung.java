package prototype;

public class Samsung extends Phone {
    public Samsung() {
        type = "Rolex";
    }

    @Override
    public void Time(String x) {
        System.out.println("The Most Expensive Time" + "\n" + x);
    }
}
