import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Modelul pentru Input (Introducerea cuvintelor gasite si verificarea daca
 * acestea se afla in tabela)
 * 
 * @author Gusti
 */
public class InputModel extends WordSearchModel {

	private static File fs = new File("Solution.txt");
	private static File fs2 = new File("Solution2.txt");
	private static File fs3 = new File("Solution3.txt");
	private static File fs4 = new File("Solution4.txt");
	private ArrayList<String> words = new ArrayList<>();
	private int n = 10;
	private String outcome;

	/**
	 * Metoda care citeste din fisier, exact ca la Tabela
	 */
	public Scanner readFromFile(File f) throws FileNotFoundException {
		Scanner r = new Scanner(f);
		return r;
	}

	/**
	 * 
	 * Metoda care citeste solutia in functie de nr
	 * 
	 */
	/**
	 * @param nr
	 * @return
	 * @throws FileNotFoundException
	 */
	public Scanner SelectSolution(Integer nr) throws FileNotFoundException {

		if (Math.abs(nr % 4) == 0) {
			return readFromFile(fs2);
		}

		else if (Math.abs(nr % 4) == 1) {
			return readFromFile(fs3);
		}

		else if (Math.abs(nr % 4) == 2) {
			return readFromFile(fs4);
		} else {

			return readFromFile(fs);
		}
	}

	/**
	 * 
	 * 
	 * Metoda care adauga intr-o lista cuvintele citite din Solutie
	 * 
	 */
	/**
	 * @param read
	 * @return
	 * @throws FileNotFoundException
	 */
	public ArrayList<String> FileToArray(Scanner read) throws FileNotFoundException {
		while (read.hasNextLine()) {
			words.add(read.next());
		}
		return words;
	}

	/**
	 *
	 * 
	 * Getter pentru un mesaj
	 * 
	 */
	/**
	 * @return
	 */
	public String getOutcome() {
		return this.outcome;
	}

	/**
	 *
	 * 
	 * Setter pentru mesaj
	 * 
	 */
	/**
	 * @param outcome
	 */
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	/**
	 *
	 * 
	 * Getter pentru un numar intreg
	 * 
	 */
	/**
	 * @return
	 */
	public int getN() {
		return this.n;
	}

	/**
	 * 
	 * 
	 * Setter pentru un numar intreg
	 * 
	 */
	/**
	 * @param n
	 */
	public void setN(int n) {
		this.n = n;
	}

}
