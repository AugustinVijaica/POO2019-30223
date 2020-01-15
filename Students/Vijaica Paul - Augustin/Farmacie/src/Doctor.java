import java.util.ArrayList;

public class Doctor{
	private String nume;
	ArrayList<Pacient> pacienti;
	ArrayList<Medicament> reteta;
	public Doctor(String nume,ArrayList<Pacient> pacienti,ArrayList<Medicament> reteta) {
		this.nume=nume;
		this.pacienti=pacienti;
		this.reteta=reteta;
	}
	
}
