import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card c){
        this.cards.add(c);
    }

    public void shuffleDeck(){
        Collections.shuffle(this.cards);
    }

    public void displayDeck(){
        for( int i = 0 ; i < this.cards.size() ; i++ ){
            System.out.printf("%d° Card: %s of %s%n", i + 1, this.cards.get(i).getValue(), this.cards.get(i).getSuit());

        }
    }

}
