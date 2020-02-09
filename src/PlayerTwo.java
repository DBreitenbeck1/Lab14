
public class PlayerTwo extends Player {

	public PlayerTwo(String name) {
		super(name);
	}

	@Override
	Roshambo generateRoshambo() {
		int a = (int) (Math.random()*3);
		switch (a) {
		case 0:
			return Roshambo.ROCK;
		case 1:
			return Roshambo.PAPER;
		case 2:
			return Roshambo.SCISSORS;
		}
		return null;
		
	}

}
