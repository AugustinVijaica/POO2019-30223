
public class TestGhiozdan {
	
		public static void main(String args[])
	    {
			Ghiozdan ghiozdan = new Ghiozdan();
			Caiet caietMatematica = new Caiet("Analiza matematica Semestrul An 1");
	        
			Caiet caietSDA = new Caiet("Structuri de date si algoritmi");

	        Caiet caietPOO = new Caiet("Programare Orientata pe obiecte");

	        Manual manualMSI = new Manual("Matematici Speciale Ingineresti");

	        Manual manualAF = new Manual("Algoritmi Fundamentali");

	        Manual manualCAN = new Manual("Circuite Analogice si Numerice");

	        ghiozdan.add(caietMatematica);
	        ghiozdan.add(caietSDA);
	        ghiozdan.add(caietPOO);
	        ghiozdan.add(manualCAN);
	        ghiozdan.add(manualMSI);
	        ghiozdan.add(manualAF);
	        

	        System.out.println(ghiozdan.getNrRechizite()+" rechizite: ");
	        ghiozdan.listItems();
	        System.out.println();

	        System.out.println(ghiozdan.getNrManuale()+" manuale: ");
	        ghiozdan.listManual();
	        System.out.println();

	        System.out.println(ghiozdan.getNrCaiete()+" caiete: ");
	        ghiozdan.listCaiet();
	        System.out.println();
	}
}
