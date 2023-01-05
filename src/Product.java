
public class Product {
	private String name;
	private double price;
	
	public Product(String name,double price) {
		this.name=name;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void getMessage() {
		System.out.println("You have consume "+name+", and the total cost is "+price);
	}
}



