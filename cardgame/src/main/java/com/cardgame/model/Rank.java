package com.cardgame.model;

// Créer une énumération pour les rangs de cartes
public enum Rank {
  ACE(1),
  TWO(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8),
  NINE(9),
  TEN(10),
  JACK(11),
  QUEEN(12),
  KING(13);

  private final int value;

  // Constructeur pour initialiser la valeur du rang
  Rank(int value) {
    this.value = value;
  }

  // Méthode pour obtenir la valeur du rang
  public int getValue() {
    return value;
  }

}

