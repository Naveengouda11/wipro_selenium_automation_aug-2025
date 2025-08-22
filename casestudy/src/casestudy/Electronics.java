package casestudy;


	public class Electronics extends Product {
		private String brand;
		private int warrantyInMonth;
		
		public Electronics(String pid,String pname,double price,int stock,String brand,int warrantyInMonths) {
			super(pid,pname,price,stock);
			this.brand = brand;
			this.warrantyInMonth = warrantyInMonths;
		}
		@Override
		public void displayDetails() {
			System.out.println("Electronics: " + pname + " | Brand: " + brand + " | Warranty: " + warrantyInMonth + " months | Price: " + price);
		}
	}


