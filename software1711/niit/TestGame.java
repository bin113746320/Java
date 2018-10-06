package software1711.niit;

import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********欢迎进入游戏世界**********\n");
		System.out.println("\t****************\t");
		System.out.println("\t**猜拳，开始**\t");
		System.out.println("\t****************\t");
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
		Game game=new Game();
		game.init();
		game.beginGame();
		game.showResult();
	}
}
