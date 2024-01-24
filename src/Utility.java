public class Utility {
    public static Deck fillDeck() throws Exception {
        Deck deck = new Deck();
        for ( String suite : Constants.SUITES ){
            for ( String value : Constants.VALUES ){
                deck.addCard(new Card(suite,value));
            }
        }
        return deck;
    }
    public static boolean include(String searchString, String[] stringList){
        for (String elem : stringList) {
            if (elem.equals(searchString)) {
                return true;
            }
        }
        return false;
    }
}
