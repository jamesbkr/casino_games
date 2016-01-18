package people;

import deckOfCards.Card;

public class Player implements User {
	final String name;
	Card[] hand;
	double account = 0.00 ;
	public Player(String thisName, double accountBalance){
		name = thisName;
		account = accountBalance;
	}
	
	
	void setHand(Card[] newHand){
		hand = newHand;
	}


	@Override
	public void play(Card[] cards) {
		// TODO Auto-generated method stub
		
	}
}
