import java.io.FileNotFoundException;

/**
 * 
 * Java Project: Word Searcher
 * 
 * @author Gusti
 *
 * 
 * 
 * 
 * 
 * 
 **/

public class MVC {

	/**
	 * 
	 * 
	 * 
	 * Instantierea tuturor controller-elor cu view-urile si modele lor
	 * 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		WordSearchModel wmodel = new WordSearchModel();
		WordSearchView wview = new WordSearchView("My Searcher");
		WordSearchController wcontroller = new WordSearchController(wmodel, wview);

		InputModel imodel = new InputModel();
		InputView iview = new InputView("Input");
		InputController icontroller = new InputController(imodel, iview, wmodel);
	}
}
