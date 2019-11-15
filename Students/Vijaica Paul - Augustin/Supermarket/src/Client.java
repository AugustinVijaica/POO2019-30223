
public class Client extends Persoana{
	
	public int nr_produse_cumparate;
	public Produs[] lista_produse=new Produs[nr_produse_cumparate];
	public float suma;
	
	public Client(int id,String nume,int nr_produse_cumparate,float suma) {
		super(id,nume);
		this.nr_produse_cumparate=nr_produse_cumparate;
		this.suma=suma;
		
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
	
	public int getProduse() {
		return nr_produse_cumparate;
	}
	
	public void setProduse(int nr_produse_cumparate) {
		this.nr_produse_cumparate=nr_produse_cumparate;
	}
	
	public float getSuma() {
		return suma;
	}
	public void setSuma(float suma) {
		this.suma=suma;
	}
	public void addProdus(Produs p,int index) {
		if(lista_produse[index].equals(null)&&p.isInStock(p)) {
			lista_produse[index]=p;
			suma+=p.pret;
		}
		else {
			System.out.println("Produsul ori nu este in stoc, ori nu poate fi adaugat in lista la pozitia respectiva");
		}
	}
	
	
	@Override
	public String toString() {
		return "Clientul cu Id " + getId() + "si numele "+ getNume(); 
	}
	

}
