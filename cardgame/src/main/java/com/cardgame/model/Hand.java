package com.cardgame.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
  private List<PlayingCard> cards;

  public Hand() {
    cards = new ArrayList<>();
  }

  public void addCard(PlayingCard pc) {
    cards.add(pc);
  }

  public PlayingCard getCard(int index) {
    return cards.get(index);
  }

  public PlayingCard removeCard() {
    return cards.remove(0);
  }

  public int getSize() {
    return cards.size();
  }

}
