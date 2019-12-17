
public class Card implements Comparable {
	
	private String number;
	private String suit;
	
	public Card(String number, String suit) {
		this.number=number;
		this.suit=suit;
	}
	public String getNumber() {
		return number;
	}

	public String getSuit() {
		return suit;
	}

	public int getSuitToInt() {
		if (suit == "diamonds")
			return 1;
		if (suit == "clubs")
			return 2;
		if (suit == "hearts")
			return 3;
		if (suit == "spades")
			return 4;
		return 0;
	}

	private int getNumberToInt() {
		if (number.equalsIgnoreCase("A")) {
			return 14;
		} else if (number.equalsIgnoreCase("K")) {
			return 13;
		} else if (number.equalsIgnoreCase("Q")) {
			return 12;
		} else if (number.equalsIgnoreCase("J")) {
			return 11;
		} else {
			return Integer.parseInt(number);
		}
	}
	@Override
	public int compareTo(Object o) {
		int rez;
		int Number = ((Card) o).getNumberToInt();
		int Suit = ((Card) o).getSuitToInt();

		rez = this.getNumberToInt() - Number;
		if (rez == 0) {
			rez = this.getSuitToInt() - Suit;
		}
		return rez;
	}
	

}
