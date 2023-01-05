
public class MRT extends Transportation{
	private double mP;
	public MRT(String name, double distance, double price) {
		super(name, distance);
		this.mP= price;
		setPrice();
	}
	
	public void setPrice() {
		double discount = mP*getDistance()/100;
		this.price=discount;
	}
	
	public void getMessage() {
		System.out.println("You have take the "+getName()+" and the discount is "+this.price+" the distance is "+distance+"km");
	}
}


