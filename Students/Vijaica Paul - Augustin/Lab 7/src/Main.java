import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persoana[] p= {new Persoana("Alex","Belbu",20),
						new Persoana("Cristian","Ciocan",21),
						new Persoana ("Sorin","Odor",19),
						new Persoana("Bogdan","Iancu",27),
						new Persoana("Ioan","Gavrea",69)};
		Arrays.sort(p);
		for(int i=0;i<5;i++) {
			System.out.println(p[i].nume+" "+p[i].prenume+ " " +p[i].varsta);
		}

	}

}
