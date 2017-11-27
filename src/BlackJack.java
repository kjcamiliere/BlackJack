import java.util.Random;

public class BlackJack {

}

class Hand {
    int value;
    Card hand[];

    public int getValue () {

    }
    public void addToHand() {

    }
    public void showHand(){

    }
}
class Player {
    int limit;

    public boolean moreCards() {

    }
    public void getCard() {

    }
    public void showHand(){

    }
    public int getValueOfHand(){

    }
}
class Dealer {
    public void startNewGame() {

    }
    public Card getCard() {

    }

}
class Deck {
    Card cards;
    Card shuffledCards;
    Random random;
    int NextItem;

    public void resetDeck() {

    }

    public int getDeckSize() {

    }

    public Card getNextCard() {

    }

    public void shuffleDeck() {

    }

    public void showOriginalDeck() {

    }

    public void showShuffledDeck() {

    }

    public void completeDeck() {

    }

    private void createHearts() {

    }

    private void createSpades() {

    }

    private void createClubs() {

    }

    private void createDiamonds() {

    }
}
class Card {
    String name;
    int value;
    String suit;

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
