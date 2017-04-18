package blackjack;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Connor on 2017.04.18..
 */

// Create a Deck class, that has a list of cards in it
// Create a constructor that takes a whole number as parameter
// The constructor should fill the list with the number of different cards using at least 4 different colors (except if the number given is smaller than four, than all cards should have different colors)

public class Deck {

  ArrayList<Card> myDeck;
  String[] colors;
  String[] values;

  public Deck(int number) {
    colors = new String[] {"Clubs", "Diamonds", "Hearts", "Spades"};
    values = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
            "King", "Ace"};
    myDeck = new ArrayList<>();
    if (number < 4) {
      for (int i = 0; i < (number - 1); i++) {
        Card card = new Card(colors[i], values[randomNumberGenerator(14)]);
        myDeck.add(card);
      }
    } else {
      for (int i = 0; i < number; i++) {
        Card card = new Card(colors[randomNumberGenerator(4)],
                values[randomNumberGenerator(14)]);
      }
    }
  }

  public int randomNumberGenerator(int max) {
    int random = (int) (Math.random() * max);
    System.out.println(random);
    return random;
  }

  public String getDeckStatus() {
    HashMap<String, Integer> deck = new HashMap<>();
    for (Card card : myDeck) {
      if(deck.get(card.color) != null) {
        deck.put(card.color, deck.get(card.color) + 1);
      }else {
        deck.put(card.color, 1);
      }
    }

    String deckStatus = myDeck.size() + " cards - " + deck.get("Clubs") + " Clubs, " +  deck.get("Diamonds")+ " Diamonds, " +  deck.get("Hearts") + " Hearts, " +  deck.get("Spades") + "Spades";
    return deckStatus;
  }


}
