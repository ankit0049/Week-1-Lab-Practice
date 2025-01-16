import java.util.Scanner;
// Create a class CardGame to ditribute cards among players
class CardPlayerGame  
{

    // Method to initialize the deck of cards
    public static String[] initializeDeck() 
	{
        // Define the suits and ranks for the cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack",  
                          "Queen", "King", "Ace"};

        // Calculate the total number of cards in the deck
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        // Populate the deck with cards in the format "rank of suit"
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) 
    {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            // Generate a random index to swap with the current card
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the deck to players
    public static String[][] distributeCards(String[] deck, int n, int x)  
    {
        // Calculate the number of cards per player
        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];

        // Distribute cards to each player
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
               // Print each card of the player
                System.out.println(card); 
            }
            // Add a blank line between players
            System.out.println();
        }
    }

    public static void main(String[] args)  
    {   // Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Initialize the deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Get input for the number of cards to distribute and the number of players
        System.out.println("Enter the number of cards to distribute:");
        int n = scanner.nextInt();

        System.out.println("Enter the number of players:");
        int x = scanner.nextInt();

        // Distribute the cards among players
        String[][] players = distributeCards(deck, n, x);

        // Print the players and their cards
        printPlayers(players);
      
	    // Close the scanner resource
        scanner.close(); 
        
    }
}