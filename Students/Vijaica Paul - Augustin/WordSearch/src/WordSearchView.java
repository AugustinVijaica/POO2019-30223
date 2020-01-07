import java.awt.Font;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * View-ul care se foloseste de Modelul tabelei pentru a afisa Grid-ul de 10x10
 * cu literele
 * 
 * @author Gusti
 *
 */
public class WordSearchView extends WordSearchModel {
	private JFrame WSTab;
	private static JTextField[][] matrix = new JTextField[10][10];
	private JPanel panel = new JPanel();

	/**
	 *
	 * 
	 * Getter pentru o matrice JTextField
	 * 
	 */
	/**
	 * @return
	 */
	static JTextField[][] getMatrix() {
		return matrix;
	}

	/**
	 * 
	 * 
	 * 
	 * Metoda care adauga intr-un panel o matrice de JTextField
	 * 
	 */
	/**
	 * @param panel
	 * @param matrix
	 */
	static void AddToPanel(JPanel panel, JTextField[][] matrix) {
		matrix = getMatrix();
		int z = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				panel.add(matrix[i][j], z);
				z++;
			}
		}
	}

	/**
	 * 
	 * 
	 * 
	 * Metoda care adauga intr-o matrice de JTextField valorile unei matrici de
	 * String-uri
	 * 
	 */
	/**
	 * @param x
	 * @return
	 */
	static JTextField[][] StringToGrid(String[][] x) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				matrix[i][j] = new JTextField("    " + x[i][j]);
				matrix[i][j].setFont(new Font("Serif", Font.CENTER_BASELINE, 30));
				matrix[i][j].setEditable(false);
			}
		}
		return matrix;
	}

	/**
	 * 
	 * 
	 * Constructorul pentru View-ul tabelei
	 * 
	 */
	/**
	 * @param title
	 */
	public WordSearchView(String title) {

		WSTab = new JFrame(title);
		WSTab.setSize(1000, 1000);

		panel.setSize(1000, 1000);
		panel.setLayout(new GridLayout(10, 10));
		try {
			/**
			 * Se apeleaza metoda FileToMatrix din Modelul tabelei pentru a o putea
			 * transcrie in matricea de JTextField pentru a o putea adauga in panel
			 */

			StringToGrid(FileToMatrix());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AddToPanel(panel, matrix);
		WSTab.setResizable(false);
		WSTab.add(panel);
		WSTab.setVisible(true);

	}
}
