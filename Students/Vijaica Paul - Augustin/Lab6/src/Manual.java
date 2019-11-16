
public class Manual extends Rechizita {

	public String getNume() {
		return " Manual: " + this.eticheta;
	}

	public Manual(String cod) {
		this.eticheta = cod;
	}

	public String toString() {
		return getNume();
	}

	public void print() {
		System.out.println(toString());
	}

}
