package black;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public abstract class Hand {
	List<Card> hand;
	
	public Hand(){
		hand = new ArrayList<>();
	}
	
	public void receiveCard(Card received) {
		hand.add(received);
	}
	
	/* public int getPointGamer(){
		 int sum = 0;
		 for(Card card : hand) {
			 sum += card.getPoint();       
		 }
		 return sum;
	 }*/
	
}
