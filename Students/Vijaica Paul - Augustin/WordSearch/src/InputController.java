import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Controller pentru Input
 *
 * @author Gusti
 *
 */
public class InputController {
	private InputModel model;
	private InputView view;
	private WordSearchModel wmodel;
	private ArrayList<String> words = new ArrayList<String>();
	private ArrayList<String> words2 = new ArrayList<String>();

	/**
	 * Constructor pentru controller
	 * 
	 * @param model
	 * @param view
	 * @param wmodel
	 * @throws FileNotFoundException
	 * 
	 *
	 * 
	 */
	/**
	 * @param model
	 * @param view
	 * @param wmodel
	 * @throws FileNotFoundException
	 */
	public InputController(InputModel model, InputView view, WordSearchModel wmodel) throws FileNotFoundException {
		this.model = model;
		this.view = view;
		this.wmodel = wmodel;
		/**
		 * Se introduc in lista words cuvintele solutiei alese in functie de Nr (este
		 * acelasi numar random ca si la tabela)
		 */
		this.words = model.FileToArray(model.SelectSolution(wmodel.getNr()));

		view.AddListener(new MyAction());
	}

	/**
	 * Class pentru crearea ActionListener-ului
	 *
	 */
	/**
	 * @author Gusti
	 *
	 */
	class MyAction implements ActionListener {
		private int n = model.getN();

		/**
		 * Metoda mostenita din interfata ActionListener
		 *
		 * NOTA: Daca cuvantul introdus se regaseste in tabela, numarul de incercari nu
		 * va scadea Este posibil sa se gaseasca si cuvinte care sa existe in
		 * vocabularul englez si sa nu reprezinte solutii... Fiecare Tabela are ca
		 * solutie 9 cuvinte
		 *
		 */
		public void actionPerformed(ActionEvent evt) {

			String text = view.getInput();
			text = text.toLowerCase();
			/**
			 * Am folosit aceasta conditie pentru a afisa acest mesaj daca introducem orice
			 * caracter care nu este litera Astfel, introducerea de cifre sau caractere
			 * speciale nu este considerata o greseala
			 */
			if (text.equals(text.toUpperCase())) {
				model.setOutcome("Nu ati scris nimic! " + "Mai aveti " + n + " incercari si " + words.size()
						+ " cuvinte de gasit.");
				view.setOutcome(model.getOutcome());
				view.clearInput();
			} else {
				/**
				 * Verificam daca cuvantul introdus reprezinta o solutie pentru tabela
				 */

				if (words.contains(text)) {
					/**
					 * Adaugam cuvantul respectiv in lista pe care o vom afisa
					 */
					words2.add(text);
					view.setLista(words2.toString());
					/**
					 * Eliminam cuvantul din lista de solutii, intrucat acesta este deja gasit
					 */
					words.remove(text);
					/**
					 * Afisam mesajul corespunzator
					 */
					model.setOutcome("Cuvant gasit! Mai aveti " + n + " incercari." + " Mai exista " + words.size()
							+ " cuvinte de gasit.");
					view.setOutcome(model.getOutcome());
					view.clearInput();
					/**
					 * Verificam daca cuvantul a fost deja introdus (Nu se va scadea numarul de
					 * incercari daca se descopera ca respectivul cuvant a fost gasit deja)
					 */
				} else if (words2.contains(text)) {
					model.setOutcome("Ati gasit deja acest cuvant!" + " Mai aveti " + n + " incercari si "
							+ words.size() + " cuvinte de gasit.");
					view.setOutcome(model.getOutcome());
					view.clearInput();
					/**
					 * Scadem numarul de incercari, intrucat cuvantul pe care l-am introdus nu este
					 * o solutie pentru tabela
					 */
				} else {
					n--;
					model.setOutcome("Cuvantul nu exista in tabel! " + "Mai aveti " + n + " incercari si "
							+ words.size() + " cuvinte de gasit.");
					view.setOutcome(model.getOutcome());
					view.clearInput();
				}
			}
			/**
			 * Daca nu am gasit toate cuvintele si numarul de incercari este egal cu 0, am
			 * pierdut jocul
			 */
			if (n <= 0) {

				view.clearInput();
				view.setLoss();
			}
			/**
			 * Daca am gasit toate cuvintele, am castigat jocul
			 */
			if (words.size() == 0) {

				view.clearInput();
				view.setWin();
			}

		}

	}

}