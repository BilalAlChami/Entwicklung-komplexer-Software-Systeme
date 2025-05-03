package aufgabe2.zustand;

import aufgabe2.Waschmaschine;

public class Aus implements Zustand {
	@Override
	public void ein(Waschmaschine waschmaschine) {
		waschmaschine.setZustand(new StandBy());
	}

}
