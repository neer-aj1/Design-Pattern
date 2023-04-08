package prototype;

public class Prototypepatternexample2 {
   public static void main(String[] args) {
      PhoneCache.loadCache();
      Apple Apple = new Apple();
      System.out.println("Real Watch 1 : " + Apple.getType());
      Apple.Time("I am real");
      System.out.println("\n");

      Phone clonedPhone = (Phone) PhoneCache.getWatch("1");
      System.out.println("Watch Cloned 1 : " + clonedPhone.getType());
      clonedPhone.Time("I am clone");
      System.out.println("\n");

      Nokia Nokia = new Nokia();
      System.out.println("Real Watch 2 : " + Nokia.getType());
      Nokia.Time("I am real");
      System.out.println("\n");

      Phone clonedPhone2 = (Phone) PhoneCache.getWatch("2");
      System.out.println("Watch Cloned 2 : " + clonedPhone2.getType());
      clonedPhone2.Time("I am clone");
      System.out.println("\n");

      Samsung Samsung = new Samsung();
      System.out.println("Real Watch 3 : " + Samsung.getType());
      Samsung.Time("I am real");
      System.out.println("\n");

      Phone clonedPhone3 = (Phone) PhoneCache.getWatch("3");
      System.out.println("Watch Cloned 3 : " + clonedPhone3.getType());
      clonedPhone3.Time("I am clone");
      System.out.println("\n");
   }
}