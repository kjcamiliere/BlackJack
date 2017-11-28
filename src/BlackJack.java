import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class BlackJack {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Deck mainDeck = new Deck();
        Hand playerHand = new Hand();
        Hand computerHand = new Hand();
        boolean endRound = false;

        mainDeck.completeDeck();
        mainDeck.shuffleDeck();

        // Deal two cards to player
        playerHand.addToHand(mainDeck.getNextCard());
        playerHand.addToHand(mainDeck.getNextCard());

        playerHand.showHand();
        System.out.println(playerHand.getValue());

        while (endRound == false) {
            if (playerHand.getValue() > 21) {
                endRound = true;
                System.out.println("BUST!");
            }
            else if (playerHand.getValue() == 21) {

                if (playerHand.getNumberOfCards() == 2) {
                    //blackjack

                }
                else {
                    // 21 but not blackjack

                }


            }
            else {
                System.out.println("1. Hit");
                System.out.println("2. Stand");
                int userSelect = scanner.nextInt();
                if (userSelect == 1) {
                    // user hit
                    playerHand.addToHand(mainDeck.getNextCard());
                    playerHand.showHand();
                    System.out.println("Value: " + playerHand.getValue());

                } else if (userSelect == 2) {
                    // user stand
                    System.out.println("Value: " + playerHand.getValue());
                    endRound = true;
                }
                else {
                    System.out.println("Enter a Valid Number! ");
                }
            }
        }

        // Computer Player
        // Hide one card from player
        // Computer will play to beat the player, after the player has chosen to stand




        // Deal two cards to computer

        // show Value of cards

        // Choice, Hit or Stand
    }



}

class Hand {

    ArrayList<Card> Hand = new ArrayList<Card>();

    public int getValue () {
        int value = 0;


        for (Card c : Hand) {
            value += c.getValue();
        }

        return value;
    }
    public void addToHand(Card cardAdded) {
        Hand.add(cardAdded);
    }
    public void showHand(){
        System.out.println(Hand.toString());
    }
    public int getNumberOfCards(){
        return Hand.size();
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
    private Card cards[] = new Card[53];
    private int NextItem = 0;
    private ArrayList<Card> DeckList = new ArrayList<Card>();

    private Card[] Diamonds = new Card[13];
    private Card[] Hearts = new Card[13];
    private Card[] Spades = new Card[13];
    private Card[] Clubs = new Card[13];

    public void resetDeck() {

    }

    public int getDeckSize() {
        return cards.length;
    }

    public Card getNextCard() {
        // return card
        NextItem++;
        return DeckList.get(NextItem);
    }

    public void shuffleDeck() {
        Collections.shuffle(DeckList);
    }

    public void showDeck() {
        System.out.println(DeckList.toString());
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

        //Convert to arrayList for future operations
        DeckList = new ArrayList<Card>(Arrays.asList(cards));

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
    public String toString(){
        String fullCardName = getName() + " of " + getSuit();
        return fullCardName;
    }
}


