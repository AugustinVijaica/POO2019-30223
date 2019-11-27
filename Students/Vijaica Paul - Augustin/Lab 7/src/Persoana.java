
public class Persoana implements Comparable<Object> {
	public String nume;
	public String prenume;
	public int varsta;
	
	public Persoana(String nume,String prenume,int varsta) {
		this.nume=nume;
		this.prenume=prenume;
		this.varsta=varsta;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume=nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume=prenume;
	}
	
	public int getVarsta() {
		return varsta;
	}
	
	public void setVarsta(int varsta) {
		
		this.varsta=varsta;
	}
	
	public int compareTo(Object other) {
		Persoana p=(Persoana) other;
			return varsta-p.varsta;
	}

}
