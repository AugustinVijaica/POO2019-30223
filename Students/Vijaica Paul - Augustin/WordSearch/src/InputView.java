import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * View-ul pentru Input
 *
 * @author Gusti
 *
 */
public class InputView extends InputModel {
	private JFrame InputTab;
	private JButton b = new JButton("Check");
	private JLabel Scriu = new JLabel();
	private JTextField Input = new JTextField(10);
	private JLabel loss = new JLabel(new ImageIcon("Chika loss.png"));
	private JLabel win = new JLabel(new ImageIcon("Chika win.gif"));
	private JLabel l = new JLabel("Scrie un cuvant");
	private JTextArea Lista = new JTextArea();

	/**
	 * Constructor pentru View
	 * 
	 * 
	 * 
	 */
	/**
	 * @param title
	 */
	public InputView(String title) {
		InputTab = new JFrame();
		InputTab.setSize(800, 800);
		InputTab.setTitle(title);
		Input.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
		loss.setVisible(false);
		win.setVisible(false);
		Lista.setEditable(false);
		l.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 30));

		InputTab.setLayout(new FlowLayout());
		InputTab.add(l);
		InputTab.add(Input);
		InputTab.add(b);
		InputTab.add(Scriu);
		InputTab.add(win);
		InputTab.add(loss);
		InputTab.add(Lista);
		InputTab.setVisible(true);
	}

	/**
	 * 
	 * 
	 * Metoda care adauga un ActionListener la JTextField si la Buton
	 * 
	 */
	/**
	 * @param Action
	 */
	public void AddListener(ActionListener Action) {
		this.b.addActionListener(Action);
		this.Input.addActionListener(Action);
	}

	/**
	 * 
	 * 
	 * Metoda care citeste ce am scris in Input
	 * 
	 */
	/**
	 * @return
	 */
	public String getInput() {
		return this.Input.getText();
	}

	/**
	 * Metoda scrie un mesaj
	 */
	public void setOutcome(String output) {
		this.Scriu.setText(output);
		this.Scriu.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
	}

	/**
	 * Metoda care 'goleste' JTextField-ul in care introducem cuvintele
	 */
	public void clearInput() {
		this.Input.setText("");
	}

	/**
	 * Metoda care afiseaza mesaj de Castig
	 */
	public void setWin() {
		this.Scriu.setText("Ai gasit toate cuvintele! Felicitari! ^-^");
		this.Scriu.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 30));
		this.b.setVisible(false);
		this.Input.setVisible(false);
		this.l.setVisible(false);
		this.win.setVisible(true);
	}

	/**
	 * Metoda care afiseaza mesaj de Game Over
	 */
	public void setLoss() {
		this.Scriu.setText("GAME OVER! Better luck next time... ;-;");
		this.Scriu.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 30));
		this.b.setVisible(false);
		this.Input.setVisible(false);
		this.l.setVisible(false);
		this.loss.setVisible(true);
	}

	/**
	 * 
	 * Metoda folosite pentru a afisa cuvintele gasite pana acum
	 */
	/**
	 * @param List
	 */
	public void setLista(String List) {
		Lista.setText(List);
		Lista.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
	}
}
