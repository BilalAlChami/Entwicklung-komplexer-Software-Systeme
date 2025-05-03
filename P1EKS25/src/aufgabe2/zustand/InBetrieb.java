package aufgabe2.zustand;

import aufgabe2.Waschmaschine;

public class InBetrieb implements Zustand {
	@Override
	public void abbrechen(Waschmaschine waschmaschine) {
		waschmaschine.setZustand(new StandBy());
	}
	@Override
	public void ende(Waschmaschine waschmaschine) {
		waschmaschine.setZustand(new StandBy());
	}

	@Override
	public void pause(Waschmaschine waschmaschine) {
		waschmaschine.setZustand(new Pause());
	}
}
