
import java.util.ArrayList;

public class FacebookAccount {
	private String nume;
	private String locatie;
	private int varsta;
	private ArrayList<FacebookAccount> prieteni;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public ArrayList<FacebookAccount> getPrieteni() {
		return prieteni;
	}

	public void setPrieteni(ArrayList<FacebookAccount> prieteni) {
		this.prieteni = prieteni;
	}

	public FacebookAccount(String nume, String locatie, int varsta) {
		setNume(nume);
		prieteni = new ArrayList<FacebookAccount>();
		setLocatie(locatie);
		setVarsta(varsta);
	}
	
	public void addPrieten(FacebookAccount friend) {
		prieteni.add(friend);
	}

	public void deletePrieten(FacebookAccount friend) {
		prieteni.remove(friend);
	}


	public void showPrieteni() {
		int n = 1;
		System.out.println("Lista de prieteni ai lui " + nume + "\n");
		for (FacebookAccount c : prieteni) {
			System.out.println(n + ". Nume: " + c.getNume() + ", Locatia: " + c.getLocatie() + ", Varsta: "
					+ c.getVarsta() + "\n\n");
			n++;
		}
	}

	public void showPrieteniLocatie(String locatie) {
		int n = 1;
		System.out.println("Lista de prieteni ai lui " + nume + " din locatia " + locatie);
		for (FacebookAccount c : prieteni) {
			if (c.getLocatie().compareTo(locatie) == 0) {
				System.out.println(n + ". Nume: " + c.getNume() + ", Locatia: " + c.getLocatie() + ", Varsta: "
						+ c.getVarsta() + "\n\n");
				n++;
			}
		}
	}

	
}