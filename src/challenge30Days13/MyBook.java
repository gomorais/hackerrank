package challenge30Days13;

public class MyBook extends Book{
	private int price;

	public MyBook(String t, String a, int price) {
		super(t, a);
		this.price = price;
		// TODO Auto-generated constructor stub
	}

	public void display(){
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
	}

	
}
