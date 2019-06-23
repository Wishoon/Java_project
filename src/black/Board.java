package black;

import java.util.List;
import java.util.Scanner;

public class Board {
	//여려명의 플레이어들
	List<Player> users;
	
	
	//플레이어 저장
	public Board(List<Player> users) {
		this.users = users;
	}	
	
	public void gameStart(Player dealer) {
		for(int i=0; i<2; i++) {
			for(Player player : users) {
				player.receiveCard(dealer.drawCard());
			}
		}
			
		for(Player player : users) {
			
			player.showCards();
		}
        for(int i=1; i<users.size(); i++){
        	int num=0;
        	
        	System.out.println("1.HIT  2.STAY");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			users.get(i).receiveCard(dealer.drawCard());
        	users.get(i).showCards();
		
			
			
		}
		/*int i=0;
		while(true) {
			//users.get(i).showCards(); // player.showCards() 같은 뜻(딜러만 뺴고)
			/*int num=0;
			System.out.println("1.HIT  2.STAY");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			if(1==num) {
				users.get(i).receiveCard(dealer.drawCard());
			}
			else if(2==num) {
				
			}
			i++;
		}*/
	}	
	
	public void gamePlaying(int num, Player dealer) {
		do {
			/*for(int i=1; i<=users.size(); i++) {
				System.out.println(users.get(i));
			}*/
			
		}while(true);
	}
	
	////////////////////////////////////////////
	/*public void gameJudge(Player dealer) {
		int num=0;
		System.out.println("1.HIT  2.STAY");
		
		if(1==num) {
			player.receiveCard(dealer.drawCard());
		}
		else if(2==num){
			return ;
		}
		else {
			System.out.println("지정되지 않은 방법입니다.");
		}
	}*/
	
}
