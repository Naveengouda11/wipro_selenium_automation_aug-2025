package casestudy;

public class CashOnDelivery extends Payment {

    public CashOnDelivery(double amount) {
        super(amount);
    }

    @Override
    public void processpayment() {
        System.out.println("Cash on Delivery - Amount to collect: ₹" + amount);
    }
}