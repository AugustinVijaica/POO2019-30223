import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmacie Catena=new Farmacie("Catena","Rozelor,14",0726221545,"www.catena.ro");
		Medicament nurofen=new Medicament("Nurofen","Convalaria",45,15);
		Medicament aspenter=new Medicament("Aspenter","DoppelHerz",60,30);
		Medicament ibuprofen=new Medicament("Ibuprofen","HelpNet",100,40);
		Catena.MS.put(nurofen, 30);
		Catena.MS.put(aspenter, 20);
		Catena.showMedList();
		
        Angajat Mazi=new Angajat("Mazi",14, "30.10.2019", 0, Catena);
        Mazi.checkStock(nurofen);
        System.out.println(Mazi.sellsMed(ibuprofen));
        Mazi.checkStock(ibuprofen);
        Mazi.changeStock(nurofen, 40);
        Mazi.changeStock(ibuprofen, 50);
        
        Catena.showMedList();
        Catena.AR.put(Mazi, 30);
        
        Mazi.addMedicament(ibuprofen, 100);
        System.out.println(Mazi.sellsMed(ibuprofen));
        
        Catena.showMedList();
        
        Pacient Gusti=new Pacient("Vijaica", "Augustin", 20, "M", false);
        Pacient Alex=new Pacient("Belbu", "Alexandru", 20, "M", true);
        Pacient Cristi=new Pacient("Gog", "Cristian", 35, "M", true);
        
        ArrayList<Pacient> pacienti=new ArrayList<Pacient>();
        ArrayList<Medicament> reteta=new ArrayList<Medicament>();
        pacienti.add(Alex);
        pacienti.add(Cristi);
        pacienti.add(Gusti);
        reteta.add(ibuprofen);
        reteta.add(aspenter);
        Doctor Memu = new Doctor("Memu", pacienti, reteta);
        
        
	}

}
