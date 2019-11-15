
public class Angajat extends Persoana {
	public String data_angajare;
	public int nr_clienti_serviti;
	Client[] lista_clienti = new Client[nr_clienti_serviti];
	
	public Angajat(int id,String nume) {
		super(id,nume);
		this.data_angajare="30 Mai 2019";
		this.nr_clienti_serviti=0;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume=nume;
	}
	
	public String getData() {
		return data_angajare;
	}
	public void setData(String data) {
		this.data_angajare=data;
	}
	
	public int getClienti() {
		return nr_clienti_serviti;
	}
	
	public void setClienti(int nr) {
		this.nr_clienti_serviti=nr;
	}
	
	public void scanProdus(Client c) {
		for(int i=0;i<c.nr_produse_cumparate;i++) {
			System.out.println(c.lista_produse[i].nume+" ");
		}
	}
	
	public float calculeazaSuma(Client c) {
		float suma=0;
		for(int i=0;i<c.nr_produse_cumparate;i++) {
			if(c.lista_produse[i].equals(null)) {
				suma+=c.lista_produse[i].pret;
			}
		}
		return suma;
	}
	
	public void servireClient(Client c) {
		scanProdus(c);
		calculeazaSuma(c);
		nr_clienti_serviti++;
	}
	
	@Override
	
	public String toString() {
		return "Angajatul cu Id " + getId() + "si numele "+ getNume(); 
	}

}
