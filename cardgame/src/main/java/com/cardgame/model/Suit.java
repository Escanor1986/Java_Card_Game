package com.cardgame.model;

// Créer une énumération pour les couleurs de cartes
public enum Suit {
    DIAMONDS(1), HEARTS(2), SPADES(3), CLUBS(4);

    int suit;

    // Constructeur de l'énumération
    Suit(int suit) {
        this.suit = suit;
    }

    // Méthode pour obtenir la valeur de la couleur
    public int getSuit() {
        return suit;
    }
}
