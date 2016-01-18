/* this is a game of black jack
 * to run this the deckOfCards is imported.
 */



package blackJack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import people.*;


public class Black_Jack implements game {
  
	
	
	public static void play(){
		ArrayList <User> users = new ArrayList<User>();	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

	
	try{	
		System.out.println("how many decks do you want to use\n");

		int number = Integer.parseInt(br.readLine());

		Shoe blackJackShoe =  BlackJack_Factory.newShoe(number);
	
	

		System.out.println("how many people are playing?\n");
		number = Integer.parseInt(br.readLine());

		
		
		for(int i = 0; i < number ;i ++){	
			System.out.println("please enter the players name");
			String newName = br.readLine();
			System.out.println("how much would you like to play with? (enter a double not integer)");
			double accountBalance = Double.parseDouble(br.readLine());
			users.add( new Player(newName,accountBalance));	
		}
	
		System.out.println("who is the house");
		String houseName = br.readLine();
		System.out.println("how much does the house have? (enter a double not integer)");
		double accountBalance = Double.parseDouble(br.readLine());
		users.add(new House(houseName,accountBalance));
	
		System.out.println(users.toString());
		System.out.println(blackJackShoe.shoeCards.toString());
		
		
		
		
	}catch(IOException error){
		System.out.println("THERE WAS AN ERROR WHEN BUILDING YOUR GAME");
	}
	
	
	
	
	
	
	}
}
