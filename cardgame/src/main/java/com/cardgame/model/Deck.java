package com.cardgame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Deck {

  private List<PlayingCard> cards;
  private final Logger logger = Logger.getLogger(Deck.class.getName());
  final Random random = new Random();


  public Deck() {
    cards = new ArrayList<>();
    for (Rank rank : Rank.values()) {
      for (Suit suit : Suit.values()) {
        // On vérifie si le logger est configuré pour afficher les messages de niveau INFO
        if (logger.isLoggable(Level.INFO)) {
          // On utilise String.format pour formater le message avec le caractère de formatage %s
          logger.info(String.format("Creating card: %s of %s", rank, suit));
        }
        cards.add(new PlayingCard(rank, suit));
      }
    }
      shuffle();
  }

  private void shuffle() {
    // On mélange le paquet de cartes
    for (int i = cards.size() - 1; i > 0; i--) {
      Collections.swap(cards, i, random.nextInt(cards.size()));
    }
  }

  public PlayingCard removeTopCard() {
    if (cards.isEmpty()) {
      return null;
    }
    return cards.remove(0);
  }

  public void returnCardToDeck(PlayingCard card) {
    if (card != null) {
      cards.add(card);
      shuffle();
    }
  }

  public List<PlayingCard> getCards() {
    return cards;
  }

}
