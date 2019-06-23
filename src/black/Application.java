package black;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		List<Player> list = new ArrayList<>(); //총 플레이어들의 리스트 생성
		
		Player dealer = new Dealer("딜러"); //딜러 생성
		list.add(dealer);
		
		int playerNum;
		System.out.println("플레이어(게이머)의 수를 정하시오.");
		Scanner pn = new Scanner(System.in);
		playerNum = pn.nextInt();
		
		for(int i=1; i<=playerNum; i++) {
			Player gamer = new Gamer("플레이어" + i); //플레이어 생성
			list.add(gamer);
		}	
		
		Board gameBoard = new Board(list);
		gameBoard.gameStart(dealer);
		gameBoard.gamePlaying(playerNum, dealer);
		
	}
}
