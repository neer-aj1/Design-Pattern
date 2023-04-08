package BuilderPattern;
public class BillBuilder {
    public Pack racketBill(){
        Pack pack = new Pack();
        pack.addItem(new YonexRacket());
        pack.addItem(new KonexRacket());
        return pack;
    }
    public Pack shuttleBill(){
        Pack pack = new Pack();
        pack.addItem(new YonexShuttle());
        return pack;
    }
}
