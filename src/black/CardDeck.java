package black;

import java.util.LinkedList;
import java.util.List;

public class CardDeck {
	private static String[] PATTERNS = {"spade", "diamond", "heart", "clover"};
	private static final int CARD_COUNT = 13;
	
	private List<Card> cards = new LinkedList<>();
	
	public CardDeck() {
		for(String pattern : PATTERNS){
            for(int i=1; i<=CARD_COUNT; i++) {
                Card card = new Card(pattern, i);
                cards.add(card);
            }
        }
	}
		
    public Card getCard() {
		int select = (int)(Math.random()*cards.size());
		Card selected = cards.get(select);
		cards.remove(select);
		
		return selected;
	}
    
    public List<Card> getDeck(){
    	return cards;
    }
	
}
