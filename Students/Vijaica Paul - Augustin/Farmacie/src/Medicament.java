
public class Medicament {
		private String denumire;
		private String producator;
		private int pret;
		private int gramaj;
		
		public Medicament(String denumire,String producator,int pret,int gramaj) {
			this.denumire=denumire;
			this.producator=producator;
			this.pret=pret;
			this.gramaj=gramaj;
		}
		
		public void setDenumire(String denumire) {
			this.denumire=denumire;
		}
		
		public String getDenumire() {
			return this.denumire;
		}
}
