package aufgabe1;

import aufgabe1.strategy.WuerfelStrategy;

public class Manipulator {
	private final Wuerfel wuerfel;

	public Manipulator(Wuerfel wuerfel) {
		this.wuerfel = wuerfel;
	}

	public void manipuliereStrategie(WuerfelStrategy strategy) {
		wuerfel.setzeStrategie(strategy);
	}
}