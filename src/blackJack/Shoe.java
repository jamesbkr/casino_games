package blackJack;

import java.util.ArrayList;

import deckOfCards.*;

public class Shoe {
	final int shoeLength;
	ArrayList<Card> shoeCards = new ArrayList<Card>();
	
	Shoe(int i){
		shoeLength = i;	
		buildDeck();
	}
	
	
	
	
	private void buildDeck(){
		ArrayList<Deck> decks = new ArrayList<Deck>();
		
		for (int i=0;i<=shoeLength;i++){
			decks.add(new Deck());
		}
		
		while(decks.isEmpty() == false){
			Deck holdDeck = decks.remove(0);
			while(holdDeck.Cards.isEmpty()==false){
				shoeCards.add(holdDeck.Cards.remove(0));
			}
		}
		
	}
	
	public void Deal() {
		
		
	}
	
}
