
public enum Roshambo {
	ROCK{
		public String toString() {
			return "Rock";
		}
		
	}, 
	
	PAPER{
		public String toString() {
			return "Paper";
		}
	}
	,
	
	SCISSORS{
	public String toString() {
		return "Scissors";
	}
	};

	public String toString() {
		
		return this.name();
	} 
	
}
