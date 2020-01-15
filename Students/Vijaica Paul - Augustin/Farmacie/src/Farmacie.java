import java.util.*;

public class Farmacie  {
	private String denumire;
	private String adresa;
	private int nrTel;
	private String website;
    Map<Medicament,Integer> MS=new HashMap<Medicament, Integer>();
	Map<Angajat,Integer> AR=new HashMap<Angajat, Integer>();
	public Farmacie(String denumire,String adresa,int tel,String website) {
		this.denumire=denumire;
		this.adresa=adresa;
		this.nrTel=tel;
		this.website=website;
	}
	public void setDenumire(String denumire) {
		this.denumire=denumire;
	}
	
	public void setAdresa(String adresa) {
		this.adresa=adresa;
	}
	
	public void setTelefon(int tel) {
		this.nrTel=tel;
	}
	
	public void setWebsite(String website) {
		this.website=website;
	}
	
	public String getDenumire() {
		return this.denumire;
	}
	
	public String getAdresa() {
		return this.adresa;
	}
	
	public int getTelefon() {
		return this.nrTel;
	}
	
	public String getWebsite() {
		return this.website;
	}
	
	public void showMedList() {
		for (Medicament key : MS.keySet())
            System.out.println(key.getDenumire() + " - " + MS.get(key));
        System.out.println();
	}
}
