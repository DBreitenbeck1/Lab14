
public class PlayerOne extends Player {

	public PlayerOne(String name) {
		super(name);
	}

	@Override
	Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
