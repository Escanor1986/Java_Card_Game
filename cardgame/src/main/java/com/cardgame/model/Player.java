package com.cardgame.model;


public class Player {
	private String name;
	private Hand hand;
	
	public Player(String name) {
		this.name = name;
		hand = new Hand();
	}
	
	public void addCardToHand(PlayingCard pc) {
		hand.addCard(pc);
	}
	
	public PlayingCard getCard(int index) {
		return hand.getCard(index);
	}
	
	public PlayingCard removeCard() {
		return hand.removeCard();
	}
  public int getHandSize() {
    return hand.getSize();
  }
  
  public String getName() {
    return name;
  }
	
	
}
