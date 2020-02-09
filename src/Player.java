
public abstract class Player {
	protected String name;
	protected int score;

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return this.score;
	}

	abstract Roshambo generateRoshambo();
	
	public void score() {
		this.score++;
	}

}
