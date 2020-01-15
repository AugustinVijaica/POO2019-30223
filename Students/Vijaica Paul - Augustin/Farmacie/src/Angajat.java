import java.util.Date;

public class Angajat implements AtributiiAngajat {
		private String nume;
		private int id;
		private String dataAngajare;
		private int bonusSalariu;
		Farmacie farmacie;
		public Angajat(String nume,int id, String data,int bonus,Farmacie farm) {
			this.nume=nume;
			this.id=id;
			this.dataAngajare=data;
			this.bonusSalariu=bonus;
			this.farmacie=farm;
		}
		@Override
		public void addMedicament(Medicament medicament,int stoc) {
			// TODO Auto-generated method stub
			this.farmacie.MS.put(medicament, stoc);
		}
		@Override
		public void deleteMedicament(Medicament medicament) {
			// TODO Auto-generated method stub
			this.farmacie.MS.remove(medicament);
		}
		@Override
		public void checkStock(Medicament medicament) {
			// TODO Auto-generated method stub
			if(sellsMed(medicament))
			System.out.println("Stocul pentru medicamentul "+medicament.getDenumire()+" este "+this.farmacie.MS.get(medicament));
			else
				System.out.println("Medicamentul "+medicament.getDenumire()+" nu exista in stocul farmaciei");
		}
		@Override
		public void changeStock(Medicament medicament,int newStock) {
			// TODO Auto-generated method stub
			if(sellsMed(medicament)) {
				this.farmacie.MS.replace(medicament, this.farmacie.MS.get(medicament), newStock);
				System.out.println("Stocul pentru medicamentul "+medicament.getDenumire()+" este acum "+this.farmacie.MS.get(medicament));	
			}
			else {
				System.out.println("Medicamentul "+medicament.getDenumire()+" nu exista in stocul farmaciei");
			}
			
			
		}
		@Override
		public boolean sellsMed(Medicament medicament) {
			// TODO Auto-generated method stub
			if(this.farmacie.MS.containsKey(medicament)) {
				return true;
			}
			else return false;
		}
		@Override
		public void procesareReteta(Doctor doctor,Pacient pacient) {
			// TODO Auto-generated method stub
			if(doctor.pacienti.contains(pacient)) {
				
				
			}
			
		}
		
}
