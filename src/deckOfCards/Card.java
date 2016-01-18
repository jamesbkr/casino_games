package deckOfCards;

public class Card {

	final int Suite;
	final int Value;
	final String writtenType;
	final String writtenValue;

	
	
	Card(int Type, int Score){
		Suite = Type;
		Value = Score;
		
		if (Suite == 0){
			writtenType = "Spade";
		}
		else if (Suite ==1){
			writtenType = "Heart";
		}
		else if (Suite == 2){
			writtenType = "Diamond";
		}
		else if (Suite == 3){
			writtenType = "Club";
		}
		else {
			writtenType = "BAD CARD";
		}
		
		switch(Score){
		case 1: writtenValue = "Ace";
			break;		
		case 2: writtenValue = "Two";
			break;	
		case 3: writtenValue = "Three";
			break;
		case 4: writtenValue = "Four";
			break;
		case 5: writtenValue = "Five";
			break;
		case 6: writtenValue = "Six";
			break;
		case 7: writtenValue = "Seven";
			break;
		case 8:writtenValue = "Eight";
			break;	
		case 9:writtenValue = "Nine";
			break;
		case 10: writtenValue = "Ten";
			break;
		case 11:writtenValue = "Jack";
			break;
		case 12:writtenValue = "Queen";
			break;
		case 13:writtenValue = "King";
			break;
		default:
			writtenValue = "BAD CARD";	
		}
	}

	public String toString(){
			String returnString = writtenValue + " of "+ writtenType;	
			return returnString;
		}
		
		
	}
	
	
	

