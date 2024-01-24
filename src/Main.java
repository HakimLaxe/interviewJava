public class Main {

    public static void main(String[] args) {

        try {
            Deck d = Utility.fillDeck();
            System.out.print("\nStarting Deck:\n");
            d.displayDeck();
            d.shuffleDeck();
            System.out.println("\nAfter Shuffling:\n");
            d.displayDeck();

        } catch (Exception e) {
            System.out.println("Deck Creation fail due to Exception: " + e);
            throw new RuntimeException(e);
        }
    }
}