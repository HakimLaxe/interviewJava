public class Card {

    public static final String OK_MESSAGE = "OK";
    private String suit;
    private String value;

    public Card(String suit, String value) throws Exception {

        String validationResult = validateInputValues(suit, value);

        if ( !validationResult.equals(OK_MESSAGE) ) {
            throw new Exception(validationResult);
        }
        this.suit = suit;
        this.value = value;
    }

    public String validateInputValues(String suit, String value){
        String validationResult = "";
        if ( suit != null ){
            if ( !Utility.include(suit, Constants.SUITES) ){
                validationResult += "Invalid Suit ";
            }
        }

        if ( value != null ){
            if ( !Utility.include(value, Constants.VALUES) ){
                validationResult += "Invalid Value";
            }
        }
        return validationResult.isEmpty() ? OK_MESSAGE : validationResult;
    }

    public String getSuit(){ return this.suit; }

    public String getValue(){ return this.value; }
}
