package com.deck_of_cards;

public class DeckOfCards {
    String[] deck = new String[52];
    String[] suit = {"Clubs", "Hearts", "Spades", "Diamond"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public void initializeCards() {
        int deckIndex = 0;
        for (String s : suit) {
            for (String value : rank) {
                deck[deckIndex] = value + " of " + s;
                deckIndex++;
            }
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
