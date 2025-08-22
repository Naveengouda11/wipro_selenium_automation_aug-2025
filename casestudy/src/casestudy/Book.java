package casestudy;

public  class Book extends Product {
	private String author;
	private String genra;

	public Book(String pid, String pname, double price, int stock,String author,String genra) {
		super(pid, pname, price, stock);
		this.author = author;
		this.genra = genra;
		
	}	
		@Override
		public void displayDetails() {
			System.out.println("Book: " + pname + " | Author: " + author + " | genra: " + genra + " | Price: " + price);
		}
	}