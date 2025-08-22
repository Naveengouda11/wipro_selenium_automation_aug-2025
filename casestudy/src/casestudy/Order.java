package casestudy;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import casestudy.Customer;

enum OrderStatus {
    PENDING, CANCELLED, COMPLETED
}

class Order {
    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    private OrderStatus status;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotal();
        this.status = OrderStatus.PENDING;
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void placeOrder(Payment payment, Discountable discountable) {
        if (status == OrderStatus.CANCELLED) {
            System.out.println("Cannot place order. It's already cancelled.");
            return;
        }

        customer.displayCustomer();
        products.forEach(Product::displayDetails);
        double discounted = discountable.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discounted);
        payment.amount = discounted;
        payment.processpayment();
        status = OrderStatus.COMPLETED;
        saveOrderToFile();
    }

    public void cancelOrder() {
        if (status == OrderStatus.PENDING) {
            status = OrderStatus.CANCELLED;
            System.out.println("Order cancelled successfully.");
        } else {
            System.out.println("Cannot cancel. Current status: " + status);
        }
    }

    private void saveOrderToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orders.txt", true))) {
            writer.write("Customer: " + customer.getName() + ", Amount: ₹" + totalAmount + ", Status: " + status);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving order: " + e.getMessage());
        }
    }

    public static void readOrdersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("orders.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading orders: " + e.getMessage());
        }
    }
}