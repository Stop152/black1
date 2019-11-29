package shop;

public class Book extends Author {

	protected String bookName;
	protected double price;
	protected int pages;
	
	Book (String bookName, double price, int pages, String name, String email, char gender) {
		super(name, email, gender);
		this.bookName = bookName;
		this.price = price;
		this.pages = pages;
	}
	
		
	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}


	public int getPages() {
		return pages;
	}



	@Override
	public String toString() {
		return "Book " + bookName + ", with price= " + price + ", with pages= " + pages
				+ ". It s author is " + name + " touched by e-mail: " + email;
	}
	

}