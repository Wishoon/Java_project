package black;

//�÷��̾�� �߻� Ŭ���� �� �������̽��� �����ؾ� �Ѵ�.
//gamer�� player�� ���� �� ���ΰ�? �ƴϸ� ...

public abstract class Player extends Hand{
	
	String name;
	Rule rule;
		
	public Player() {
		super();
	}
	
	public void setRule(Rule rule) {
		this.rule = rule;
	}
	
	public abstract Card drawCard();
	
	public void showCards() {
		System.out.print(name + " ");
		System.out.println(hand.toString());
	}
	public void showCards_gamer() {
			System.out.println(hand.toString());
	}


	
}
