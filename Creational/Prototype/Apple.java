package prototype;

public class Apple extends Phone {

    public Apple() {
        type = "Apple";
    }

    @Override
    public void Time(String x) {
        System.out.println("The Most Secure System" + "\n" + x);
    }
}