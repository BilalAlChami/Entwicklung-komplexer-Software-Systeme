package aufgabe2.zustand;

import aufgabe2.Waschmaschine;

public class Pause implements Zustand {
	@Override
	public void abbrechen(Waschmaschine waschmaschine) {
		waschmaschine.setZustand(new StandBy());
	}

	@Override
	public void weiter(Waschmaschine waschmaschine) {
		waschmaschine.setZustand(new InBetrieb());
	}
}
