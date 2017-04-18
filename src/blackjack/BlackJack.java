package blackjack;

/**
 * Created by Connor on 2017.04.18..
 */
public class BlackJack {
  public static void main(String[] args) {

    // We should be able to shuffle the deck, which randomly orders the cards
    // We should be able to draw the top card which returns the drawn card and also removes it from the deck
    // Deck should be represented as string in this format:
    // 12 cards -  3 Clubs, 3 Diamonds, 3 Hearts, 3 Spades
    Deck deck = new Deck(12);
    System.out.println(deck.myDeck.toString());
    // Should print out:
    // 12 cards -  3 Clubs, 3 Diamonds, 3 Hearts, 3 Spades
           /* Card drawn = deck.draw();
            System.out.println(drawn);
            System.out.println(deck);*/
    // Should print out:
    // Queen Spades
    // 11 cards - 3 Clubs, 3 Diamonds, 3 Hearts, 2 Spades
  }
}
