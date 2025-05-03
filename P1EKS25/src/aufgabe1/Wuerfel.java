package aufgabe1;

import aufgabe1.strategy.WuerfelStrategy;

public class Wuerfel {
	private WuerfelStrategy strategy;
	public int werfen() {
		return strategy.execute();
	}

	public void setzeStrategie(WuerfelStrategy strategy) {
		this.strategy = strategy;
	}
}