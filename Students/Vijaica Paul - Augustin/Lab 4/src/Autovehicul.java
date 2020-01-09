import java.awt.Color;

public class Autovehicul {
	String marca;
	Color culoare;
	private int viteza_curenta;
	private int treapta_viteza;
	private int viteza_maxima;
	private Sofer sofer;
	private Rezervor rezervor;
	private static final boolean Asigurare = true;

	public Autovehicul() {
		this.marca = "Dacia";
		this.culoare = Color.black;
		this.viteza_curenta = 0;
		this.treapta_viteza = 0;
		this.viteza_maxima = 210;

	}

	public Autovehicul(String marca, Color culoare, int viteza_curenta, int treapta_viteza, int viteza_maxima) {

		this.marca = marca;

		this.culoare = culoare;

		this.viteza_curenta = viteza_curenta;

		this.treapta_viteza = treapta_viteza;

		this.viteza_maxima = viteza_maxima;

	}

	public int getSpeed() {

		return this.viteza_curenta;

	}
	public void setSpeed(int viteza) {
		this.viteza_curenta=viteza;
	}

	public int getGear() {

		return this.treapta_viteza;

	}

	public String getBrand() {

		return this.marca;

	}

	public void setBrand(String Marca) {

		this.marca = Marca;

	}

	public Color getColor() {

		return this.culoare;

	}

	public void setColor(Color Culoare) {

		this.culoare = Culoare;

	}

	public void setMaxSpeed(int VitezaM) {

		this.viteza_maxima = VitezaM;

	}

	public void setMaxSpeed(byte VitezaM) {
		this.viteza_maxima = VitezaM;
	}

	public int getMaxSpeed() {

		return this.viteza_maxima;

	}

	public void accelerate(int viteza_noua) {
		if (this.rezervor.isEmpty() == false) {
			if (this.viteza_curenta + viteza_noua < this.viteza_maxima) {

				this.viteza_curenta += viteza_noua;
				this.rezervor.setQuantity(rezervor.getQuantity()-1);

			} else {

				this.viteza_curenta = this.viteza_maxima;

			}

			changeGear();
		}
		else {
			System.out.println("Masina nu are suficienta benzina");
			setSpeed(0);
		}
	}

	public void decelerate(int viteza_noua) {
		if (this.rezervor.isEmpty() == false) {
			if (this.viteza_curenta - viteza_noua > 0) {

				this.viteza_curenta -= viteza_noua;
				this.rezervor.setQuantity(rezervor.getQuantity()-1);

			} else {
				this.viteza_curenta = 0;
			}

			changeGear();
		}
		else {
			System.out.println("Masina nu are suficienta benzina");
			setSpeed(0);
		}
	}

	public void changeGear() {

		if (this.viteza_curenta > 0 && this.viteza_curenta <= 10)

			this.treapta_viteza = 1;

		else if (this.viteza_curenta <= 30)

			this.treapta_viteza = 2;

		else if (this.viteza_curenta <= 60)

			this.treapta_viteza = 3;

		else if (this.viteza_curenta <= 70)

			this.treapta_viteza = 4;

		else

			this.treapta_viteza = 5;
	}

	public void stop() {

		this.viteza_curenta = 0;
		this.treapta_viteza = 0;

	}

	public void setSofer(Sofer sofer) {
		this.sofer = sofer;
	}

	public Sofer getSofer() {
		return this.sofer;
	}
	
	public void setRezervor(Rezervor rezervor) {
		this.rezervor=rezervor;
	}
	
	public Rezervor getRezervor() {
		return this.rezervor;
	}

}
