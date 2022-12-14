import java.util.Random;

public class MyCards {
  public static void main(String[] args) {
    // Create an array of 52 cards
    String[] deck = new String[52];
    int index = 0;

    // Create an array of strings for the suits
    String[] shapes = {"Spades", "Hearts", "Diamonds", "Clubs"};

    // Create an array of strings for the ranks
    String[] nums = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    // Loop through the suits and ranks to create a deck of cards
    for (String shape : shapes) {
      for (String num : nums) {
        deck[index] = num + " of " + shape;
        index++;
      }
    }

    // Shuffle the deck
    shuffle(deck);

    // Print the first eight cards
    for (int i = 0; i < 8; i++) {
      System.out.println(deck[i]);
    }
  }

  // Method to shuffle the deck of cards
  public static void shuffle(String[] deck) {
    Random rnd = new Random();

    for (int i = deck.length - 1; i > 0; i--) {
      int index = rnd.nextInt(i + 1);
      // Swap the cards
      String temp = deck[index];
      deck[index] = deck[i];
      deck[i] = temp;
    }
  }
}
