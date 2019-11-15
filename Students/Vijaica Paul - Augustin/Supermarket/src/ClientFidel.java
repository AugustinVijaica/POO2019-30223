
public class ClientFidel extends Client {
	private int puncte_acumulate;
	private float discount;
	
	public ClientFidel(int id,String nume,int nr_produse_cumparate,float suma) {
		super(id,nume,nr_produse_cumparate,suma);
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
	
	
	public void addProdus(Produs p,int index) {
		if(lista_produse[index].equals(null)&&p.isInStock(p)) {
			lista_produse[index]=p;
			suma+=p.pret;
		}
		else {
			System.out.println("Produsul ori nu este in stoc, ori nu poate fi adaugat in lista la pozitia respectiva");
		}
	}
	
	public int calculeazaPuncte(ClientFidel c) {
		if(suma>=100) {
			puncte_acumulate++;
		}
		return puncte_acumulate;
	}
	
	public float calculeazaDiscount(ClientFidel c,int puncte) {
		discount=c.calculeazaPuncte(c)/(float)10.0;
		return discount;
	}
	
	@Override
	
	public String toString() {
		return "Clientul fidel cu Id " + getId() + "si numele "+ getNume(); 
	}

}
