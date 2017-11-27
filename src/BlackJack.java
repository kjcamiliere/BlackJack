import java.util.Random;

public class BlackJack {
    public static void main(String [] args){
        Deck mainDeck = new Deck();
        mainDeck.completeDeck();

        mainDeck.showOriginalDeck();


    }
    // Create Deck



    //Deal Cards


    //Allow User to draw a card

    // Check for 21

}

class Hand {
    int value;
    Card hand[];

    public int getValue () {
        return value;
    }
    public void addToHand() {

    }
    public void showHand(){

    }
}
class Player {
    int limit;

    public boolean moreCards() {

        return true;

    }
    public void getCard() {

    }
    public void showHand(){

    }
    public int getValueOfHand(){
        return limit;

    }
}
class Dealer {
    public void startNewGame() {

    }
    //public Card getCard() {


    //}

}
class Deck {
    Card cards[] = new Card[53];
    Card shuffledCards[];
    Random random;
    int NextItem;

    Card[] Diamonds = new Card[13];
    Card[] Hearts = new Card[13];
    Card[] Spades = new Card[13];
    Card[] Clubs = new Card[13];



    public void resetDeck() {

    }

    public int getDeckSize() {
        return cards.length;

    }

    public Card getNextCard() {
        return cards[NextItem];

    }

    public void shuffleDeck() {



    }

    public void showOriginalDeck() {
        int x = 0;
        for (x = 0; x < 52; x++) {
            System.out.println(cards[x].getName() + " of " + cards[x].getSuit()+" Value:"+cards[x].getValue());
        }

    }

    public void showShuffledDeck() {

    }

    public void completeDeck() {
        int n = 0,m = 0;

        createDiamonds();
        createClubs();
        createHearts();
        createSpades();

        do{
            cards[n] = Diamonds[m];
            cards[n+1] = Hearts[m];
            cards[n+2] = Clubs[m];
            cards[n+3] = Spades[m];
            n = n + 4;

            m++;


        }while (n < 52);




    }

    private void createHearts() {
        Integer i,m = 0;

        // Digit Cards
        for (i = 0; i < 13; i++) {
            Hearts[i] = new Card();
            m++;

            Hearts[i].setValue(m);
            Hearts[i].setSuit("Hearts");

            if (i == 0){
                Hearts[i].setName("Ace");
            }
            else if (i == 10 ){
                Hearts[i].setName("Jack");
                Hearts[i].setValue(10);
            }
            else if (i == 11) {
                Hearts[i].setName("Queen");
                Hearts[i].setValue(10);
            }
            else if (i == 12) {
                Hearts[i].setName("King");
                Hearts[i].setValue(10);
            }
            else{
                Hearts[i].setName(m.toString());
            }
        }
    }

    private void createSpades() {
        Integer i,m = 0;

        // Digit Cards
        for (i = 0; i < 13; i++) {
            Spades[i] = new Card();
            m++;

            Spades[i].setValue(m);
            Spades[i].setSuit("Spades");

            if (i == 0){
                Spades[i].setName("Ace");
            }
            else if (i == 10 ){
                Spades[i].setName("Jack");
                Spades[i].setValue(10);
            }
            else if (i == 11) {
                Spades[i].setName("Queen");
                Spades[i].setValue(10);
            }
            else if (i == 12) {
                Spades[i].setName("King");
                Spades[i].setValue(10);
            }
            else{
                Spades[i].setName(m.toString());
            }
        }
    }

    private void createClubs() {
        Integer i,m = 0;

        // Digit Cards
        for (i = 0; i < 13; i++) {
            Clubs[i] = new Card();
            m++;

            Clubs[i].setValue(m);
            Clubs[i].setSuit("Clubs");

            if (i == 0){
                Clubs[i].setName("Ace");
            }
            else if (i == 10 ){
                Clubs[i].setName("Jack");
                Clubs[i].setValue(10);
            }
            else if (i == 11) {
                Clubs[i].setName("Queen");
                Clubs[i].setValue(10);
            }
            else if (i == 12) {
                Clubs[i].setName("King");
                Clubs[i].setValue(10);
            }
            else{
                Clubs[i].setName(m.toString());
            }
        }
    }

    private void createDiamonds() {
        Integer i,m = 0;

        // Digit Cards
        for (i = 0; i < 13; i++) {
            Diamonds[i] = new Card();
            m++;

            Diamonds[i].setValue(m);
            Diamonds[i].setSuit("Diamonds");

            if (i == 0){
                Diamonds[i].setName("Ace");
            }
            else if (i == 10 ){
                Diamonds[i].setName("Jack");
                Diamonds[i].setValue(10);
            }
            else if (i == 11) {
                Diamonds[i].setName("Queen");
                Diamonds[i].setValue(10);
            }
            else if (i == 12) {
                Diamonds[i].setName("King");
                Diamonds[i].setValue(10);
            }
            else{
                Diamonds[i].setName(m.toString());
            }
        }
    }
}
class Card {
    private String name;
    private int value;
    private String suit;

    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    public String getSuit() {
        return suit;
    }
    public void setName(String x){
        name = x;
    }
    public void setValue (int x) {
        value = x;
    }
    public void setSuit(String x) {
        suit = x;
    }
}


