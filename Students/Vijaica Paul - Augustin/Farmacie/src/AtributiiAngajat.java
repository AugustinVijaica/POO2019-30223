
public interface AtributiiAngajat {
		public abstract void addMedicament(Medicament medicament,int stoc);
		public abstract void deleteMedicament(Medicament medicament);
		public abstract boolean sellsMed(Medicament medicament);
		public abstract void checkStock(Medicament medicament);
		public abstract void changeStock(Medicament medicament,int newStock);
		public abstract void procesareReteta(Doctor doctor,Pacient pacient);
		
		
		
}
