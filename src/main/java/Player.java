/**
 * Player.java - This class will store the player's name, age, and hand of cards.
 * A player may draw from a deck, discard cards, and return cards to a deck.
 * 
 * @author Kavin Mohanadas
 * May 10, 2025
 * ICS4U1
 * @version 1
 */

 import java.util.ArrayList;

 // the player's info and cards
public class Player {
    String name;
    int age;
    ArrayList<Card> hand;
 

 /**
  *Makes a player with a starting hand
  *@param n (name of the player)
  *@param a (age of the player)
  *@param cards starting cards
  */

  public Player (String n, int a, Card[] cards) {
    name = n;
    age = a;
    hand  = new ArrayList<Card>();
    for (int i = 0; i < cards.length; i++) {
        if (cards[i] != null) {
            hand.add(cards[i]);
        }
    }
  }

  /**
   * Makes a player with an empty hand
   * @param n (name of the player)
   * @param a (age of the player)
   */
  public Player(String n, int a) {
    name = n;
    age = a;
    hand = new ArrayList<Card>();
  }

  /**
   * Gets the name of the player
   * @return name
   */
  public String getName() {
    return name;
  }
  /**
   * Gets the age of the player
   * @return age
   */
  public int getAge() {
    return age;
  }

  /**
   * Gets all cards in hand
   * @return hand of cards
   */
  public Card[] getHand() {
    Card[] result = new Card[hand.size()];
    for (int i = 0; i < hand.size(); i++) {
        result[i] = hand.get(i);
    }
    return result;
  }

  /**
   * Returns # of cards in hand
   * @return size
   */
  
   public int size() {
    return hand.size();
   }

   /**
    * Draws a card from the deck
    *@param deck (the deck to draw from)
    */

   public void draw(Deck deck) {
    Card c = deck.draw();
    if(c != null) {
        hand.add(c);
    }
   }

   /**
    * Discards a card from hand to the discard pile
    *@param card (card to discard)
    *@param pile (discard pile)
    *@return true (if card was removed)
    */
    public boolean discardCard(Card card, DiscardPile pile) {
        if (hand.contains(card)) {
            hand.remove(card);
            pile.addCard(card);
            return true;
        }
        return false;
    }

    /**
     * Returns a card from hand to the deck
     * @param card (card to return)
     * @param deck (the deck to return to)
     * @return true (if card was returned)
     */
    public boolean returnCard(Card card, Deck deck) {
        if (hand.contains(card)) {
            hand.remove(card);
            deck.addCard(card);
            return true;
        }
        return false;
    }

    /**
     * Shows players name,age, and cards in hand
     * @return String
     */
    public String toString() {
        String result = name +", " + age + ", ";
        for (int i = 0; i < hand.size(); i++) {
            result += hand.get(i);
            if (i < hand.size() - 1) {
                result += ", ";
            }
        }
        return result;
    }
}



