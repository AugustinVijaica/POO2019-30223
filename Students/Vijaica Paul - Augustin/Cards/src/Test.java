
public class Test {
	public static void main(String args[]) {
		Card[] carti = new Card[52];
		carti[0] = new Card("2", "clubs");
		carti[1] = new Card("3", "hearts");
		carti[2] = new Card("4", "spades");
		carti[3] = new Card("5", "diamonds");
		carti[4] = new Card("6", "spades");
		carti[5] = new Card("7", "diamonds");
		carti[6] = new Card("8", "spades");
		carti[7] = new Card("9", "clubs");
		carti[8] = new Card("10", "spades");
		carti[9] = new Card("J", "diamonds");
		carti[10] = new Card("Q", "spades");
		carti[11] = new Card("K", "hearts");
		carti[12] = new Card("A", "spades");
		CardDeck pachet = new CardDeck(carti, 13);
		System.out.println("____________ Initial");
		System.out.println(pachet.getNrOfCards());
		System.out.println();
		for (int i = 0; i < pachet.getNrOfCards(); i++) {
			Card carte = pachet.next();
			System.out.println(carte.getNumber() + " " + carte.getSuit());
		}
		System.out.println();
		System.out.println(pachet.hasNext());
		System.out.println("___________ After Remove");
		pachet.remove(carti[7]);
		pachet.remove(carti[2]);
		pachet.remove(new Card("J","clubs"));
		
		System.out.println(pachet.getNrOfCards());
		System.out.println();
		Card[] WORemCards=pachet.getDeck();
		for (int i = 0; i < pachet.getNrOfCards(); i++) {
			System.out.println(WORemCards[i].getNumber() + " " + WORemCards[i].getSuit());
		}
		System.out.println("___________ After Put");
		pachet.put(new Card("A","hearts"));
		pachet.put(new Card("Q","spades"));
		pachet.put(new Card("7","clubs"));
		
		System.out.println(pachet.getNrOfCards());
		System.out.println();
		Card[] WAddCards=pachet.getDeck();
		for (int i = 0; i < pachet.getNrOfCards(); i++) {
			System.out.println(WAddCards[i].getNumber() + " " + WAddCards[i].getSuit());
		}
	}

}
