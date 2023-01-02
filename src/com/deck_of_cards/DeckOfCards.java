package com.deck_of_cards;

import java.util.Random;

public class DeckOfCards {
    String[] deck = new String[52];
    String[] suit = {"Clubs", "Hearts", "Spades", "Diamond"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    Random random = new Random();

    public void initializeCards() {
        int deckIndex = 0;
        for (String s : suit) {
            for (String value : rank) {
                deck[deckIndex] = value + " of " + s;
                deckIndex++;
            }
        }
    }

    public void shuffleTheCards() {
        int randomNum;
        String temp;
        for (int i = 0; i < deck.length; i++) {
            randomNum = random.nextInt(52);
            temp = deck[i];
            deck[i] = deck[randomNum];
            deck[randomNum] = temp;
        }
    }

    public void displayTheCards() {
        if(deck[0] == null) {
            System.out.println("\nPlease Initialize And Shuffle the Cards First");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck[i]);
            if(i < deck.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
