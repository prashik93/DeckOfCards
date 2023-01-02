package com.deck_of_cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Deck Of Cards!");
        Scanner scnr = new Scanner(System.in);
        DeckOfCards deckOfCards = new DeckOfCards();
        boolean flag = true;
        while(flag) {
            System.out.println("\nWhat do you want to do? ");
            System.out.print("1.Initialize The Cards\n0.Exit");
            System.out.print("\nEnter Your Choice : ");
            int usrChoice = scnr.nextInt();
            switch (usrChoice) {
                case Constants.INITIALIZE_THE_CARDS :
                    deckOfCards.initializeCards();
                    break;
                case Constants.EXIT :
                    flag = false;
                    break;
                default :
                    System.out.println("\nPlease give valid input...");
            }
        }
    }
}