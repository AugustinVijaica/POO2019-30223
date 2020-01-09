import java.awt.Color;

public class VehiculTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autovehicul Car = new Autovehicul();
		Sofer sofer = new Sofer();
		Rezervor rezervor = new Rezervor();
		Car.setSofer(sofer);
		Car.setRezervor(rezervor);

		Autovehicul Car2 = new Autovehicul("Mercedes-Benz", Color.white, 30, 2, 260);
		Sofer sofer2 = new Sofer("Belbu", "Alexandru", 21, 250699);
		Rezervor rezervor2 = new Rezervor(300, 50, "Diesel");
		
		System.out.println("--------------Prima masina-----------------------");
		System.out.println("Marca: " + Car.getBrand() + "\nCuloare: " + Car.getColor().toString());
		System.out.println(Car.getSofer().getNume() + " " + Car.getSofer().getPrenume());
		System.out.println(Car.getRezervor().getCapacity() + " l " + Car.getRezervor().getFuel());

		System.out.println("Viteza " + Car.getSpeed() + " km/h");
		System.out.println("Treapta " + Car.getGear());

		Car.accelerate(60);

		System.out.println("Viteza " + Car.getSpeed() + " km/h");
		System.out.println("Treapta " + Car.getGear());
		System.out.println("Cantitate in rezervor " + Car.getRezervor().getQuantity());

		Car.getRezervor().fill(30);
		System.out.println("After Fill: Cantitate in rezervor " + Car.getRezervor().getQuantity());
		Car.accelerate(60);

		System.out.println("Viteza " + Car.getSpeed() + " km/h");
		System.out.println("Treapta " + Car.getGear());
		System.out.println("Cantitate in rezervor " + Car.getRezervor().getQuantity());

		Car.decelerate(30);

		System.out.println("Viteza " + Car.getSpeed() + " km/h");
		System.out.println("Treapta " + Car.getGear());
		System.out.println("Cantitate in rezervor " + Car.getRezervor().getQuantity());

		Car.stop();

		System.out.println("Viteza " + Car.getSpeed() + " km/h");
		System.out.println("Treapta " + Car.getGear());
		
		System.out.println("--------------A doua masina-----------------------");
		Car2.setSofer(sofer2);
		Car2.setRezervor(rezervor2);
		System.out.println("Marca: " + Car2.getBrand() + "\nCuloare: " + Car2.getColor().toString());
		System.out.println(Car2.getSofer().getNume() + " " + Car2.getSofer().getPrenume());
		System.out.println(Car2.getRezervor().getCapacity() + " l " + Car2.getRezervor().getFuel());

		System.out.println("Viteza " + Car2.getSpeed() + " km/h");
		System.out.println("Treapta " + Car2.getGear());
		System.out.println("Cantitate in rezervor " + Car2.getRezervor().getQuantity());

		Car2.accelerate(60);

		System.out.println("Viteza " + Car2.getSpeed() + " km/h");
		System.out.println("Treapta " + Car2.getGear());
		System.out.println("Cantitate in rezervor " + Car2.getRezervor().getQuantity());

		Car2.decelerate(30);

		System.out.println("Viteza " + Car2.getSpeed() + " km/h");
		System.out.println("Treapta " + Car2.getGear());
		System.out.println("Cantitate in rezervor " + Car2.getRezervor().getQuantity());

		Car2.stop();

		System.out.println("Viteza " + Car2.getSpeed() + " km/h");
		System.out.println("Treapta " + Car2.getGear());
	}

}
