
public class Zi {
		private String nume;
		private Boolean lucratoare;
		
		public String getNume() {
			return nume;
		}
		
		public void setNume(String nume) {
			this.nume=nume;
		}
		
		public Boolean getLucratoare() {
			return lucratoare;
		}
		
		public void setLucratoare(Boolean lucratoare) {
			this.lucratoare=lucratoare;
		}
		
		public Zi(String nume,Boolean lucratoare) {
			setNume(nume);
			setLucratoare(lucratoare);
		}
}
