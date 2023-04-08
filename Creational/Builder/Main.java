package BuilderPattern;

public class Main {
    public static void main(String[] args){
        BillBuilder bill = new BillBuilder();
        Pack racket = bill.racketBill();
        System.out.println(racket.getCost());
    }
}