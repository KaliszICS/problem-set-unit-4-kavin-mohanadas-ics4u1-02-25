/** Card Game Framework - Problem Set 4
 * Card.java
 * @author Kavin Mohanadas
 * ICS4U1
 * May 10 2025
 * Description : This class creates a single playing card. Every card is assgined to a name, suit and value 
 * (ex. Ace, Hearts, 1). This can be used to compare cards or show the card as a string.
 * @version 1
 */

 //Card.java

 public class Card {
    String name; //card name
    String suit; //card suit
    int value; //value used when comparing cards
 

/** this is to store the card name,suit,value 
 * @param n (the name of the card (ex.Ace))
 * @param s (the suit (ex. Hearts))
 * @param v (the value for comparing)
*/

 public Card (String n, String s, int v) { 
    name = n;
    suit = s;
    value = v;
 }

 /** this is to return the card name, suit, value
  * @return card name
  * @return card suit
  * @return card value
 */

 public String getName() {
    return name;
 }
 
 public String getSuit() {
    return suit;
 }

 public int getValue() {
    return value;
 }

 /** Checking if two cards are the exact same
  * @param other (the card to comapre with)
  @return true (if name, suit, and value match)
  */

 public boolean equals(Card other) {
    return name.equals(other.name) && suit.equals(other.suit) && value == other.value;
 }

 /** @return so it says "name" of "suit" (ex. Queen of Spades) */

 public String toString() {
    return name + " of " + suit;
    }
 }