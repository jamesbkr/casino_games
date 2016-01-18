package people;

import deckOfCards.*;

public class House implements User {
	Card[] hand;
    final String name;
    double houseAccount = 0.00;
	
   public House(String thisPerson, double accountBalance){
    	name = thisPerson;
    	houseAccount = accountBalance;
    }
    
    public void play(Card[] cards) {
    	setHand(cards);

	
	
	}


    
    private void setHand(Card[] cards){
	hand = cards;
    }


    
}
