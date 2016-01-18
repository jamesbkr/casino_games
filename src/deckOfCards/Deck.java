package deckOfCards;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private Random rand = new Random();
	public ArrayList<Card> Cards = new ArrayList<Card>();
	
	
	public Deck(){
		
		for (int i = 0;i<=51;i++){
			int value = i%4;
			int cardNumber = (i%13) + 1;
			Cards.add(new Card(value,cardNumber));
		}
	}
	
	
	
	
	public void shuffle()	{
		
		ArrayList<Card> newDeck = new ArrayList<Card>();
			for (int i = 0; i < 51; i++){
				int n = rand.nextInt(51-i)+1;
				newDeck.add(Cards.remove(n));
			}	
			Cards = newDeck;
}
	
}
