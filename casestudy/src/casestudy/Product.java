package casestudy;

public abstract class Product {
protected String pid;
protected String pname;
protected double price;
protected int stock;

Product(String pid,String pname,double price,int stock) {
	this.pid = pid;
	this.pname = pname;
	this.price = price;
	this.stock = stock;
}

public abstract void displayDetails();

public double getPrice() {
	return price;
}
public boolean isInStrock() {
	return stock > 0;
}
public void updatestock(int qty) {
	this.stock += qty;
}

}