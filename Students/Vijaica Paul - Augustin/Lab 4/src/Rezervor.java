
public class Rezervor {
	private int capacitate;
	private int cantitate;
	private String combustibil;
	
	public Rezervor() {
		this.cantitate=0;
		this.capacitate=100;
		this.combustibil="Benzina";
	}
	
	public Rezervor(int capacitate,int cantitate,String combustibil) {
		this.capacitate=capacitate;
		this.cantitate=cantitate;
		this.combustibil=combustibil;
	}
	
	
	public void setCapacity(int capacitate) {
		this.capacitate=capacitate;
	}
	
	public int getCapacity() {
		return this.capacitate;
	}
	
	public void setQuantity(int cantitate) {
		this.cantitate=cantitate;
	}
	
	public int getQuantity() {
		return this.cantitate;
	}
	
	public void setFuel(String combustibil) {
		this.combustibil=combustibil;
	}
	
	public String getFuel() {
		return this.combustibil;
	}
	
	public boolean isFull() {
		if(this.cantitate>=this.capacitate) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(this.cantitate<=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void fill(int litri) {
		if(isFull()) {
			System.out.println("Rezervorul este plin");
		}
		else {
			this.cantitate+=litri;
		}
	}

}
