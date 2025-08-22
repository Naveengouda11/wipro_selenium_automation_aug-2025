package casestudy;

public  class Furniture extends Product {
	private String material;
	private String quality;

	public Furniture(String pid, String pname, double price, int stock,String material,String quality) {
		super(pid, pname, price, stock);
		this.material = material;
		this.quality = quality;
		
	}	
		@Override
		public void displayDetails() {
			System.out.println("Furniture: " + pname + " | Material: " + material + " | Quality: " + quality + " | Price: " + price);
		}
	}