/** 
 * Deck.java - This class will create and manage a deck of cards.
 * The deck may be shuffled, drawn from. Aditonally, cards may be added an reshuffled.
 *
 * @author Kavin Mohanadas
 * May 10 2025
 * ICS4U1
 * @version 1
 */

 import java.util.ArrayList;

 public class Deck {
    // cards in deck
    ArrayList<Card> cards;

    /** Makes a deck from an array of cards
    @param arr is the card array 
    */

    public Deck(Card[] arr) {
        cards = new ArrayList<Card>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                cards.add(arr[i]);
            }
    }

 }

 //Makes a full 52 deck of cards thats not shuffled
 public Deck() {
    cards = new ArrayList<Card>();
    String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
    String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    for (int i = 0; i < suits.length; i++) {
        for (int j = 0; j < names.length; j++) {
            cards.add(new Card(names[j], suits[i], j+1));
        }
    }
 }

 /** this method returns how many cards are in the deck
  * @return size of the deck
  */

 public int size() {
    return cards.size();
 }

 /** this method takes the top card of the deck and removes it
  * @return the top card, or null if empty
  */

 public Card draw() {
    if (cards.size() == 0) {
        return null;
    }
    return cards.remove(0);
 }

 //this method shuffles the deck by swapping the cards at random
 public void shuffle() {
    for (int i = 0; i <cards.size(); i++) {
        int random = (int)(Math.random() * cards.size());
        Card temporary = cards.get(i);
        cards.set(i, cards.get(random));
        cards.set(random,temporary);
    }
 }
 /** this method adds one card to the deck
  * @param c (the card to add)
  */

 public void addCard(Card c) {
    if(c != null) {
        cards.add(c);
    }
 }

 /** this method adds all cards from an array and shuffles the deck
  * @param arr (cards to add)
  */

 public void reshuffle(Card[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != null) {
            cards.add(arr[i]);
        }
    }
    shuffle(); //calling shuffle method after adding new cards to deck
 }


}