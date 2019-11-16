
public class Caiet extends Rechizita {

	public Caiet(String cod) {
		this.eticheta = cod;
	}

	public String getNume() {
		return " Caiet: " + this.eticheta;
	}

	public String toString() {
		return getNume();
	}

	public void print() {
		System.out.println(toString());
	}

}