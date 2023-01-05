
public class Transportation {
	private String name;
	protected double price;
	protected double distance;
	
	public Transportation(String name, double distance) {
		this.name=name;
		this.distance=distance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getDistance() {
		return distance;
	}

}







