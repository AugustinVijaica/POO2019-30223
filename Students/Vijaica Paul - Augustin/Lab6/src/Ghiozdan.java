
public class Ghiozdan {
	public Rechizita[] ghiozdan;
	public int nr_rechizite;

	public Ghiozdan() {
		ghiozdan = new Rechizita[100];
		this.nr_rechizite = 0;
	}

	public void add(Caiet caiet) {
		ghiozdan[nr_rechizite] = caiet;
		nr_rechizite++;
	}

	public void add(Manual manual) {
		ghiozdan[nr_rechizite] = manual;
		nr_rechizite++;
	}

	public void listItems() {
		for (int i = 0; i < nr_rechizite; i++)
			System.out.println(ghiozdan[i]);
	}

	public void listManual() {
		for (int i = 0; i < nr_rechizite; i++) {
			if (ghiozdan[i].getClass().getName() == "Manual")
				((Manual) ghiozdan[i]).print();
		}
	}

	public void listCaiet() {
		for (int i = 0; i < nr_rechizite; i++) {
			if (ghiozdan[i].getClass().getName() == "Caiet")
				((Caiet) ghiozdan[i]).print();
		}
	}

	public int getNrRechizite() {
		return this.nr_rechizite;
	}

	public int getNrManuale() {
		int nr = 0;
		for (int i = 0; i < nr_rechizite; i++) {
			if (ghiozdan[i].getClass().getName() == "Manual")
				nr++;
		}
		return nr;
	}

	public int getNrCaiete() {
		int nr = 0;
		for (int i = 0; i < nr_rechizite; i++) {
			if (ghiozdan[i].getClass().getName() == "Caiet")
				nr++;
		}
		return nr;
	}

}
