package deckOfCards;

public class DeckFactory {
	private DeckFactory(){}
	
	static public Deck newDeck(){
		return new Deck();
	}
}
