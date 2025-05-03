package aufgabe2.zustand;

import aufgabe2.Waschmaschine;

public class ProgrammGewaehlt implements Zustand {
	private int programm;

	public ProgrammGewaehlt(int programm) {
		this.programm = programm;
	}

	@Override
	public void abbrechen(Waschmaschine waschmaschine) {
		waschmaschine.setZustand(new StandBy());
	}

	@Override
	public void start(Waschmaschine waschmaschine) {
		waschmaschine.setZustand(new InBetrieb());
	}
}
