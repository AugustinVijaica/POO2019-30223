
public class Persoana {
	public int id;
	public String nume;
	
	public Persoana(int id,String nume) {
		this.id=id;
		this.nume=nume;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume=nume;
	}
	
	public String toString() {
		return "Persoana cu Id " + getId() + "si numele "+ getNume(); 
	}
	
	public void printInfo() {
		System.out.println(toString());
	}

}
