package black;

//플레이어는 추상 클래스 및 인터페이스로 설정해야 한다.
//gamer과 player를 생성 할 것인가? 아니면 ...

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
