package TennisGame;

public class TennisScore {
	
	public static void main(String[] args) {
		TennisGame game = new TennisGame("D","H","12212121222212122");
		System.out.println(game.scoreAt(5));
		TennisGame game2 = new TennisGame("ALICE","BOB","11112121212111");
		System.out.println(game2.scoreAt(4));
		TennisGame game3 = new TennisGame("John Snow","Alliser","1212121211");
		System.out.println(game3.scoreAt(6));
		System.out.println(game3.scoreAt(7));
	}
}
