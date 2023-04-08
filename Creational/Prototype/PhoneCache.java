package prototype;

import java.util.Hashtable;

public class PhoneCache {

    private static Hashtable<String, Phone> phoneMap = new Hashtable<String, Phone>();

    public static Phone getWatch(String shapeId) {
        Phone cachedPhone = phoneMap.get(shapeId);
        return (Phone) cachedPhone.clone();
    }

    public static void loadCache() {
        Apple apple = new Apple();
        apple.setId("1");
        phoneMap.put(apple.getId(), apple);

        Nokia nokia = new Nokia();
        nokia.setId("2");
        phoneMap.put(nokia.getId(), nokia);

        Samsung samsung = new Samsung();
        samsung.setId("3");
        phoneMap.put(samsung.getId(), samsung);
    }
}