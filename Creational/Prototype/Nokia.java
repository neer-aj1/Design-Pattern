package prototype;

public class Nokia extends Phone {

    public Nokia() {
        type = "GShock";
    }

    @Override
    public void Time(String x) {
        System.out.println("The Most Tough Time" + "\n" + x);
    }
}