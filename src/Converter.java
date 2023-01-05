
public class Converter {
	public double wallet = 100;
	
	public void addPoint(double point) {
		this.wallet+=point;
	}
	
	public void usePoint(double point) {
		this.wallet-=point;
	}
	
	public double getWallet() {
		return wallet;
	}
	
	public void getMessage() {
		System.out.println("You have "+ wallet+" points in your openpoint app");
	}
}



