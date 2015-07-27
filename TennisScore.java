package TennisGame;

public class TennisScore {
	
	public static void main(String[] args) {
		TennisGame game = new TennisGame(args[0]);
		
		System.out.println(game.scoreAt(5));
		
	}
}
