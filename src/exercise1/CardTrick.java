package exercise1;

import java.util.Scanner; //importing Scanner class
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7]; //creating an array of 7 cards
        
        Scanner s = new Scanner(System.in); //Scanner object

        System.out.println("Random cards generated: ");
        
        for (int i = 0; i < hand.length; i++) 
        {
            Card card = new Card();
            
            //card.setValue(insert call to random number generator here)
            //now we are randomly calling the card out of the deck of cards
            card.setValue((int)(1+Math.random()*13));
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            //calling any 3 random cards
            card.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            // Don't worry about duplicates at this point
            
            hand[i]=card;
            
            System.out.println(hand[i].getValue()+", "+hand[i].getSuit());
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, print System.out.println("Congratulations, you guessed right!");.
        
        
        System.out.print("Enter any number value of the Card: ");
        int num = s.nextInt();
        
        System.out.print("Enter any value of the Suit: ");
        String value = s.next();
        
        for (int i =0;i<hand.length;i++)
        {
           if(hand[i].getValue() == num && hand[i].getSuit().equalsIgnoreCase(value))
           {
               printInfo();
           }
           else
           {
              System.out.println("The Card written did not match");
           }
           
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    
    // I'm done!
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        
        System.out.println("My name is Urvashi");
        
        System.out.println("My Hobbies are:");
        System.out.println("reading");
        System.out.println("sleeping");
        System.out.println("drawing");
        
        System.out.println("I usually lile to stay by myself");
        
        System.out.println("Am currently enrolled in the second semester of Computer Programming course");
        
    }

}
