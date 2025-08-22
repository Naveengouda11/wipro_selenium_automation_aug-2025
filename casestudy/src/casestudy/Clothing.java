package casestudy;

public class Clothing extends Product {
	private String size;
	private String fabric;

	public Clothing(String pid, String pname, double price, int stock,String size,String fabric) {
		super(pid, pname, price, stock);
		this.size = size;
		this.fabric = fabric;
	}	
		@Override
		public void displayDetails() {
			System.out.println("Clothing: " + pname + " | Size: " + size + " | Fabric: " + fabric + " | Price: " + price);
		}
	}
