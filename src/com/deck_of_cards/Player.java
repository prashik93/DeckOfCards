package com.deck_of_cards;

import java.util.ArrayList;

public class Player {
    String playerName;
    ArrayList<Card> playersDeck;

    public Player(String playerName, ArrayList<Card> playersDeck) {
        this.playerName = playerName;
        this.playersDeck = playersDeck;
    }

    @Override
    public String toString() {
        return "Player{" +
                playerName + '\'' +
                playersDeck +
                '}';
    }
}
