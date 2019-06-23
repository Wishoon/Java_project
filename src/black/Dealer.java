package black;

public class Dealer extends Player{
	private CardDeck dealerDeck;
	
	public Dealer(String name) {
		super();
		this.name = name;
		dealerDeck = new CardDeck();
	}

	@Override
	public Card drawCard() {
		return dealerDeck.getCard();
	}
	
}
