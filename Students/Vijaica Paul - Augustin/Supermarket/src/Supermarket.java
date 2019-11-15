
public class Supermarket {
	public Angajat[] lista_angajati= new Angajat[100];
	public ClientFidel[] lista_clienti_fideli= new ClientFidel[100];
	public Produs[] stoc_produse= new Produs[100];
	
	public void addProdus(Produs p,int index) {
		if(stoc_produse[index].equals(null)) {
			stoc_produse[index]=p;
		}
	}
	
	public void addAngajat(Angajat a,int index) {
		if(lista_angajati[index].equals(null)) {
			lista_angajati[index]=a;
		}
	}
	
	public void addClientFidel(ClientFidel c,int index) {
			if(lista_clienti_fideli[index].equals(null)) {
				lista_clienti_fideli[index]=c;
			}
		}
	
	public void sortareClienti(ClientFidel[] lista, int nr) {
		ClientFidel aux;
		for(int i=0;i<nr;i++) {
			for(int j=0;j<nr-i-1;j++) {
				if(lista[j].suma>lista[j+1].suma) {
					aux=lista[j];
					lista[j]=lista[j+1];
					lista[j+1]=aux;
				}
			}
		}
	}
	
	
	public void printListaClienti(ClientFidel[] lista, int nr ) {
		for(int i=0;i<nr;i++) {
			lista[i].printInfo();
			System.out.println("\n");
		}
	}
	
	public void sortareAngajati(Angajat[] lista, int nr) {
		Angajat aux;
		for(int i=0;i<nr;i++) {
			for(int j=0;j<nr-i-1;j++) {
				if(lista[j].nr_clienti_serviti>lista[j+1].nr_clienti_serviti) {
					aux=lista[j];
					lista[j]=lista[j+1];
					lista[j+1]=aux;
				}
			}
		}
	}
	
	public void printListaAngajati(Angajat[] lista, int nr ) {
		for(int i=0;i<nr;i++) {
			lista[i].printInfo();
			System.out.println("\n");
		}
	}
	
	
}
