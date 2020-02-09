import java.util.*;

public class PlayerThree extends Player {
	
	
	public PlayerThree(String name) {
		super(name);
	}

	@Override
	Roshambo generateRoshambo() {
		Scanner scanner = new Scanner(System.in);
		Roshambo r = Roshambo.ROCK;
		String rps = Validator.getString(scanner, "Rock, Paper, or Scissors? \n").toLowerCase().trim();
		switch (rps) {
		case "rock":
			r = Roshambo.ROCK;
			break;
		case "paper":
			r = Roshambo.PAPER;
			break;
		case "scissors":
			r= Roshambo.SCISSORS;
			break;
		default: 
			System.out.println("Invalid entry");
			r =generateRoshambo();
			break;
		}
		return r;
	}

}
