/**
 * Main.java - this is to test that the card game framework classes work
 * it creates a deck, player, and lets them draw and discard cards
 * 
 * @author Kavin Mohanadas
 * May 10, 2025
 * ICS4U1
 * @version 1
 */

 public class Main {
    /**
     * Main method to test the functionality
     */

    public static void main(String[] args) {
        //Create new deck and shuffle it
        Deck deck = new Deck();
        deck.shuffle();

        // creates a new player with my name and age
        Player p = new Player("Kavin", 17);

        //draw 3 cards from deck
        p.draw(deck);
        p.draw(deck);
        p.draw(deck);

        //print player info and hand
        System.out.println("Player after drawing cards: ");
        System.out.println(p);

        //Create discard pile
        DiscardPile pile = new DiscardPile();

        //Discard 1st card in the player's hand
        p.discardCard(p.getHand()[0], pile);

        //Show the players hand and discard pile
        System.out.println("\nAfter discarding one card:");
        System.out.println(p);
        System.out.println("Discard pile: " + pile);

    }

 }