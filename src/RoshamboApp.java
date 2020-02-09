import java.util.Scanner;

public class RoshamboApp {
	public static void main(String[] args) {
		PlayerOne rocky = new PlayerOne("Rocky");
		PlayerTwo randy = new PlayerTwo("Randy");
		
		
		PlayerThree p3 = new PlayerThree(setPlayerName());

		
		
		int c = playerChoice(p3);
		Player p2 = rocky;
		switch (c) {
		case 1: {
			p2 = rocky;
			break;
		}
		case 2: {
			p2 = randy;
			break;
		}

		}

		do {

			Roshambo one = p3.generateRoshambo();
			Roshambo two = p2.generateRoshambo();
			System.out.println(p3.getName() + " picks " + one + ". "+p2.getName() + " picks " + two + ".");

			String s = winLoseTie(one, two);
			if (s.equals("Wins")) {
				p3.score();
				System.out.println(p3.getName() + " Wins.");
			} else if (s.equals("Loses")) {
				p2.score();
				System.out.println(p3.getName() +" Loses.");
			} else {
				System.out.println(p3.getName() +" Ties with " + p2.name + ".");
			}

		} while (cont());

		String t;
		String t1;
		if(p2.getScore()==1) {
			t=" time.";
		} else {
			t=" times.";
		}
		if(p3.getScore()==1) {
			t1=" time.";
		} else {
			t1=" times.";
		}
		
		
		System.out.println(p3.getName() +" won " + p3.getScore() + t1);
		System.out.println(p2.getName() + " won " + p2.getScore() + t);

	}

	public static int playerChoice(Player p) {
		String prompt1 = "Whom would you like to play against, " + p.getName() + "?";
		String prompt2 = "1. Rocky";
		String prompt3 = "2. Randy";
		Scanner scanner = new Scanner(System.in);
		int c = Validator.getInt(scanner, prompt1+"\n"+prompt2+"\n" +prompt3+"\n", 1, 2);
		return c;
	}

	public static String winLoseTie(Roshambo a, Roshambo b) {
		String w = "Loses";

		if (a.equals(b)) {
			w = "Ties";
		} else if (a.equals(Roshambo.ROCK)) {
			if (b.equals(Roshambo.SCISSORS)) {
				w = "Wins";
			} else if (b.equals(Roshambo.PAPER)) {
				w = "Loses";
			}
		} else if (a == Roshambo.PAPER) {
			if (b.equals(Roshambo.ROCK)) {
				w = "Wins";
			} else if (b.equals(Roshambo.SCISSORS)) {
				w = "Loses";
			}
		} else if (a.equals(Roshambo.SCISSORS)) {
			if (b.equals(Roshambo.PAPER)) {
				w = "Wins";
			} else if (b.equals(Roshambo.ROCK)) {
				w = "Loses";
			}
		}
		return w;
	}

	public static int score() {
		int count = 0;
		return count;
	}

	public static boolean cont() {
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		String s = Validator.getStringMatchingRegex(scanner, "Do you wish to play again? y/n \n", "[yn]").toLowerCase()
				.trim();
		loop = s.contains("y");
		return loop;
	}
	
	public static String setPlayerName() {
		Scanner scanner = new Scanner(System.in);
		String n = Validator.getString(scanner, "Enter player name: ");
		return n;
	}
	

}