package casestudy;



public abstract class Payment {
protected double amount;
public Payment (double amount) {
	this.amount = amount;
}
public abstract void processpayment();
}

class UPIPayment extends Payment {
	private String upiID;
	
	public UPIPayment(double amount,String upiID) {
		super(amount);
		this.upiID = upiID;
		
}
	@Override
	public void processpayment() {
		System.out.println("Paid ₹" + amount + " via UPI: " + upiID);
		
	}
	class CardPayment extends Payment {
	    private String cardNumber;
	    public CardPayment(double amount, String cardNumber) {
	        super(amount);
	        this.cardNumber = cardNumber;
	    }
	    @Override
	    public void processpayment() {
	        System.out.println("Paid ₹" + amount + " using Card ending with: " + cardNumber.substring(cardNumber.length() - 4));
	    }
	}
	class CashOnDelivery extends Payment {
	    public CashOnDelivery(double amount) {
	        super(amount);
	    }
	    @Override
	    public void processpayment() {
	        System.out.println("Cash on Delivery - Amount to collect: ₹" + amount);
	    }
	}
}
