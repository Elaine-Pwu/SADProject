import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenPoints_simulator {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input.txt");
		Scanner icashScanner = new Scanner(file);
		Converter wallet = new Converter();

		while (icashScanner.hasNextLine()) {
			String operation = icashScanner.next();

			switch (operation) {
			case "Bus":
				String bname = icashScanner.next();
				double bdistance = icashScanner.nextDouble();
				double bprice = icashScanner.nextDouble();
				boolean MRT = icashScanner.nextBoolean();
				Bus bus = new Bus(bname, bdistance, bprice, MRT);
				bus.getMessage();
				wallet.addPoint(bus.getPrice());
				break;

			case "MRT":
				String mname = icashScanner.next();
				double mdistance = icashScanner.nextDouble();
				double mprice = icashScanner.nextDouble();
				MRT mrt = new MRT(mname, mprice, mdistance);
				wallet.addPoint(mrt.getPrice());
				mrt.getMessage();
				break;

			case "Eat":
				String pname = icashScanner.next();
				double pprice = icashScanner.nextDouble();
				Product product = new Product(pname, pprice);
				wallet.usePoint(pprice);
				product.getMessage();
				break;

			case "getWallet":
				wallet.getMessage();
				break;

			default:
				System.out.println("InvalidOperation");
				break;
			}
		}
		icashScanner.close();
	}
}








