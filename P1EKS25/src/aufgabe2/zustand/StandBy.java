package aufgabe2.zustand;

import aufgabe2.Waschmaschine;

public class StandBy implements Zustand {
	@Override
	public void programm(Waschmaschine waschmaschine, int zahl) {
		waschmaschine.setZustand(new ProgrammGewaehlt(zahl));
	}

	@Override
	public void aus(Waschmaschine waschmaschine) {
		waschmaschine.setZustand(new Aus());
	}
}
