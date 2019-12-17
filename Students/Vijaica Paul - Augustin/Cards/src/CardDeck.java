import java.util.Arrays;

public class CardDeck implements OrderedIterator {
	private int hasnextCard;
	private int nextCard;
	private int nrOfCards;
	private Card[] deck;
	
	public CardDeck(Card[] deck, int nrOfCards)
	{
		this.deck=deck;
		this.nrOfCards=nrOfCards;
	}

	public Card[] getDeck() {
		return this.deck;
	}

	public int getNrOfCards()
	{
		return this.nrOfCards;
	}
	
	public boolean existsInDeck(Card c)
	{
		for (int i = 0; i < this.nrOfCards; i++)
			if (deck[i].compareTo(c) == 0)
				return true;
		return false;
	}
	
	public void remove(Card c) {
			if(existsInDeck(c)==true) {
				int poz=0;
				for (int i = 0; i < this.nrOfCards; i++) {
					if (c.getNumber() == deck[i].getNumber()) {
						poz = i;
						break;
					}
				}
				for (int j = poz; j < this.nrOfCards - 1; j++) {
					deck[j] = deck[j + 1];
				}
				this.nrOfCards--;
			}
			else
				System.out.println("Cartea [" + c.getNumber() + ", " +c.getSuit()+"] nu exista in pachet");
				
	}

	@Override
	public boolean hasNext() {
		if (this.deck[this.hasnextCard++].getNumber() == "A")
			return false;

		return true;
	}

	@Override
	public Card next() {
		
		return this.deck[this.nextCard++];
	}

	@Override
	public int put(Comparable compare) {
			if (existsInDeck((Card)compare)==false && this.nrOfCards<52) {
				this.nrOfCards++;
				this.deck[this.nrOfCards - 1] = (Card) compare;
				Arrays.sort(deck, 0, this.nrOfCards);
				return 1;
			}
			else {
				System.out.println("Cartea [" + ((Card) compare).getNumber() + ", " +((Card)compare).getSuit()+"] exista deja in pachet");
			return 0;
			}
	}
	
	

}
