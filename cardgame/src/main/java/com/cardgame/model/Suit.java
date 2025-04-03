package com.cardgame.model;

// Créer une énumération pour les couleurs de cartes
public enum Suit {
    DIAMONDS(1), HEARTS(2), SPADES(3), CLUBS(4);

    private final int value;

    // Constructeur de l'énumération
    Suit(int value) {
        this.value = value;
    }

    // Méthode pour obtenir la valeur de la couleur
    public int getSuit() {
        return value;
    }
}
