package black;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		List<Player> list = new ArrayList<>(); //�� �÷��̾���� ����Ʈ ����
		
		Player dealer = new Dealer("����"); //���� ����
		list.add(dealer);
		
		int playerNum;
		System.out.println("�÷��̾�(���̸�)�� ���� ���Ͻÿ�.");
		Scanner pn = new Scanner(System.in);
		playerNum = pn.nextInt();
		
		for(int i=1; i<=playerNum; i++) {
			Player gamer = new Gamer("�÷��̾�" + i); //�÷��̾� ����
			list.add(gamer);
		}	
		
		Board gameBoard = new Board(list);
		gameBoard.gameStart(dealer);
		gameBoard.gamePlaying(playerNum, dealer);
		
	}
}
