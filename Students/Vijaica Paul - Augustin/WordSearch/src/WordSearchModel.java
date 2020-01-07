
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 * Modelul pentru tabela de litere
 * 
 * @author Gusti
 * 
 */

public class WordSearchModel {
	private static File f = new File("WordTable.txt");
	private static File f2 = new File("WordTable2.txt");
	private static File f3 = new File("WordTable3.txt");
	private static File f4 = new File("WordTable4.txt");
	private static Random r = new Random();
	private static Integer nr = r.nextInt();

	/**
	 * 
	 * 
	 * Getter pentru numar generat random
	 * 
	 */
	/**
	 * @return
	 */
	public Integer getNr() {
		return nr;
	}

	/**
	 * 
	 * 
	 *
	 * 
	 * Metoda care citeste dintr-un fisier
	 * 
	 */
	/**
	 * @param f
	 * @return
	 * @throws FileNotFoundException
	 */
	public Scanner readFromFile(File f) throws FileNotFoundException {
		Scanner r = new Scanner(f);
		return r;
	}

	/**
	 * 
	 * 
	 * 
	 * 
	 * Metoda care alege ce fisier sa citeasca in functie de numarul random
	 * 
	 */
	/**
	 * @param nr
	 * @return
	 * @throws FileNotFoundException
	 */
	public Scanner SelectFile(Integer nr) throws FileNotFoundException {

		if (Math.abs(nr % 4) == 0) {
			return readFromFile(f2);
		}

		else if (Math.abs(nr % 4) == 1) {
			return readFromFile(f3);
		}

		else if (Math.abs(nr % 4) == 2) {
			return readFromFile(f4);
		} else {

			return readFromFile(f);
		}

	}

	/**
	 *
	 * 
	 * 
	 * Metoda ce pune literele citite din fisier intr-o matrice de String-uri
	 * 
	 */
	/**
	 * @param s
	 * @return
	 */
	public String[][] FileToString(Scanner s) {
		String[][] x = new String[10][10];

		for (int i = 0; i < 10 && s.hasNextLine(); i++) {
			for (int j = 0; j < 10 && s.hasNext(); j++) {
				x[i][j] = s.next();
			}
		}
		return x;
	}

	/**
	 *
	 * 
	 * 
	 * Metoda care, folosing metodele anterioare, citeste din fisierul obtinut din
	 * SelectFile si transforma literele citite intr-o matrice de String-uri
	 * 
	 */
	/**
	 * @return
	 * @throws FileNotFoundException
	 */
	public String[][] FileToMatrix() throws FileNotFoundException {
		return FileToString(SelectFile(getNr()));

	}

}
