
public class Bus extends Transportation {	
	private boolean MRT;
	private double bP=0;
	public Converter wallet;
	
	public Bus(String name, double distance,double price, boolean MRT) {
		super(name, distance);
		this.MRT=MRT;
		this.bP+=price;
		setPrice();	
	}
	
	public void setPrice() {
		if(this.MRT=true) {
			double discount = bP*distance*0.9/100;
			this.price = discount;	
		}else {
			double discount = bP*distance*0.8/100;
			this.price = discount;		
		}
	}
	
	public void getMessage() {
		System.out.println("You have take "+getName()+ " and get "+this.price+"points, the distance is "+distance+"km"+MRT);
		
	}	
	
}


