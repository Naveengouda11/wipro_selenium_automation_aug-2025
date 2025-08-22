package casestudy;

import java.util.*;
import casestudy.Product;
import casestudy.Customer;
import casestudy.Order;
import casestudy.Payment;
import casestudy.Electronics;
import casestudy.Clothing;
import casestudy.Book;
import casestudy.Furniture;
import casestudy.CashOnDelivery;
import casestudy.Discountable;


public class EcommerceApp {

	public static void main(String[] args) {
		 Product phone = new Electronics("P1001", "iPhone 15", 79999, 10, "Apple", 12);
	        Product tshirt = new Clothing("C1002", "Polo T-shirt", 1499, 20, "L", "Cotton");
	        Product book = new Book("B1003", "Java Programming", 699, 15, "John Doe", "Education");
	        Product chair = new Furniture("F1004", "Office Chair", 3499, 5, "Wood", "Premium");

	        Customer customer = new Customer("Ravi Kumar", "ravi@example.com");
	        List<Product> cart = Arrays.asList(phone, tshirt, book, chair);

	        Order order = new Order(customer, cart);
	        Discountable discount = (price) -> price * 0.9; // 10% discount
	        Payment payment = new CashOnDelivery(0);

	        order.placeOrder(payment, discount);

	        System.out.println("\n--- Previous Orders ---");
	        Order.readOrdersFromFile();
	}

}
