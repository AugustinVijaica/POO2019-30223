
public class FacebookControl {
	public static void main(String[] args) {
		FacebookAccount Gusti = new FacebookAccount("Augustin Vijaica", "Cluj", 20);
		FacebookAccount Mazi = new FacebookAccount("Andru Mazilescu", "Bristol", 20);
		FacebookAccount Belbu = new FacebookAccount("Alexandru Marian Belbu", "Bucuresti", 20);
		FacebookAccount Badi = new FacebookAccount("Stefan Badi", "Bucuresti", 20);
		FacebookAccount Cosmin = new FacebookAccount("Cosmin Handaric", "Cluj", 20);
		FacebookAccount Chis = new FacebookAccount("David Chis", "Cluj", 20);
		FacebookAccount Rusu = new FacebookAccount("Vlad Rusu", "Cluj", 20);

		Gusti.addPrieten(Rusu);
		Gusti.addPrieten(Mazi);
		Gusti.addPrieten(Cosmin);
		Gusti.addPrieten(Belbu);
		Gusti.addPrieten(Chis);

		Belbu.addPrieten(Badi);
		Belbu.addPrieten(Mazi);
		Belbu.addPrieten(Cosmin);
		Belbu.addPrieten(Gusti);

		Cosmin.addPrieten(Rusu);
		Cosmin.addPrieten(Chis);
		Cosmin.addPrieten(Gusti);

		Mazi.addPrieten(Belbu);
		Mazi.addPrieten(Gusti);

		Gusti.showPrieteni();

		Gusti.showPrieteniLocatie(Gusti.getLocatie());

		Belbu.showPrieteniLocatie(Belbu.getLocatie());

		Gusti.deletePrieten(Mazi);
		Gusti.showPrieteni();

	}
}