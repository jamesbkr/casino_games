package blackJack;

public class BlackJack_Factory {
   private	BlackJack_Factory(){};
   
   public static Shoe newShoe(int i){
	   return new Shoe(i);
   }
   
   
}
