package com.deck_of_cards;

import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {
    String[] suit = {"Clubs", "Hearts", "Spades", "Diamond"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    Card[] deck = new Card[Constants.LENGTH_OF_DECK_OF_CARDS];
    Random random = new Random();

    public void initializeCards() {
        int deckIndex = 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[deckIndex] = new Card(suit[i], rank[j]);
                deckIndex++;
            }
        }
    }

    public void shuffleTheCards() {
        boolean result = checkDeckIsEmpty();
        if(result) {
            System.out.println("\nPlease Initialize The Cards First");
            return;
        }
        for (int i = 0; i < Constants.LENGTH_OF_DECK_OF_CARDS; i++) {
            int randomNum = random.nextInt(Constants.LENGTH_OF_DECK_OF_CARDS);
            Card temp = deck[i];
            deck[i] = deck[randomNum];
            deck[randomNum] = temp;
        }
    }

    public void distributeTheCards() {
        boolean result = checkDeckIsEmpty();
        if(result) {
            System.out.println("\nPlease Initialize And Shuffle The Cards First");
            return;
        }
        ArrayList<Player> listOfPlayer = new ArrayList<>();
        int indexPosition = 0;
        int numOfPlayer = 1;
        for (int i = 0; i < Constants.NUMBER_OF_PLAYER; i++) {
            ArrayList<Card> cardOfPlayer = new ArrayList<>();
            for (int j = 0; j < Constants.CARD_PER_PLAYER; j++) {
                cardOfPlayer.add(deck[indexPosition]);
                indexPosition++;
            }
            listOfPlayer.add(new Player("Player" + numOfPlayer, cardOfPlayer));
            numOfPlayer++;
        }
        for (Player player : listOfPlayer) {
            System.out.println(player);
        }
    }

    public boolean checkDeckIsEmpty() {
        if(deck[0] == null) {
            return true;
        }
        return false;
    }

    public void displayTheCards() {
        boolean result = checkDeckIsEmpty();
        if(result) {
            System.out.println("\nPlease Initialize And Shuffle The Cards First");
            return;
        }
        System.out.print("[");
        for(int i = 0; i < deck.length; i++) {
            System.out.print(deck[i]);
            if(i < deck.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
