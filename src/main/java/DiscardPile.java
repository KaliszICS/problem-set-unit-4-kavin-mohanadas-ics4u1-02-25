/**
 * DiscardPile.java - This class manages a pile of "thrown-away" cards.
 * Cards may be added, removed, or cleared.
 * 
 * @author Kavin Mohanadas
 * May 10, 2025
 * ICS4U1
 * @version 1
 */

 import java.util.ArrayList;

 public class DiscardPile {
    // list of cards in discard
    ArrayList<Card> pile;

    /**
     * Makes a discard pile from a card array
     * @param arr the cards to add
     */

     public DiscardPile(Card[] arr) {
        pile = new ArrayList<Card>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                pile.add(arr[i]);
            }
        }
     }

     //Makes an empty pile
     public DiscardPile() {
        pile = new ArrayList<Card>();
     }

     /**
      * Gets all cards in the pile
      @return card array
      */
      public Card[] getCards() {
        Card[] result = new Card[pile.size()];
        for (int i = 0; i < pile.size(); i++) {
            result[i] = pile.get(i);
        }
        return result;
      }

      /**
       * Returns the # of cards
       * @return pile size
       */
      public int size() {
        return pile.size();
      }

      /**
       * Adds a card to the pile
       * @param c the card to add
       */
      public void addCard(Card c) {
        if (c != null) {
            pile.add(c);
        }
      }

      /**
       * This takes out a card if its already in the pile
       * @param c the card to remove
       * @return the card or null
       */
      public Card removeCard(Card c) {
        if(pile.contains(c)) {
            pile.remove(c);
            return c;
        }
        return null;
      }

      /**
       * Clears the pile and returns the cards
       * @return all cards removed
       */

      public Card[] removeAll() {
        Card[] temporary = getCards();
        pile.clear();
        return temporary;
      }

      /**
       * Shows all cards as a single String
       * @return string of cards
       */

      public String toString() {
        String result = "";
        for (int i = 0; i < pile.size(); i++) {
            result += pile.get(i);
            if (i < pile.size() - 1) {
                result += ", "; //space for formatted return
            }
        }
        return result;
      }
    
 }