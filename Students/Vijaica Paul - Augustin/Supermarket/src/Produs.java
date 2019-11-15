
public class Produs {
	public String nume;
	public float pret;
	public int nr_exemplare;
	
	public Produs(String nume,float pret,int nr_exemplare) {
		this.nume=nume;
		this.pret=pret;
		this.nr_exemplare=nr_exemplare;
	}
	
	public boolean isInStock(Produs p) {
		if(p.nr_exemplare>0) {
			return true;
		}
		else {
			return false;
		}
	}

}
