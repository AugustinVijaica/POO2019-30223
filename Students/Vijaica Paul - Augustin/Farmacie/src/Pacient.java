import java.util.ArrayList;

public class Pacient implements Comparable<Pacient> {
		private String nume;
		private String prenume;
		private int varsta;
		private String sex;
		private boolean acuta;
		private int gradSev;
		ArrayList<Medicament> medicamente;
		
		public Pacient(String nume,String prenume,int varsta, String sex,boolean acuta) {
			this.nume=nume;
			this.prenume=prenume;
			this.varsta=varsta;
			this.sex=sex;
			this.acuta=acuta;
		}
		
		public boolean getAcuta() {
			return this.acuta;
		}
		public int getGradSev() {
			return this.gradSev;
		}
		
		public void calculGrad() {
			if(acuta && this.medicamente.size()>3) {
				this.gradSev=2;
			}
			else
				this.gradSev=1;
		}

		@Override
		public int compareTo(Pacient o) {
			// TODO Auto-generated method stub

				return gradSev-o.getGradSev();

		}
		
}
