package aufgabe2;

import aufgabe2.zustand.Aus;
import aufgabe2.zustand.Zustand;

public class Waschmaschine {
	private Zustand zustand = new Aus();
	public void getZustand() {
		System.out.println("Waschmaschine ist im Zustand " + zustand.getClass().getName().replace("aufgabe2.zustand.", ""));
	}

	public void ein() {
		zustand.ein(this);
	}

	public void aus() {
		zustand.aus(this);
	}
	public void ende() {
		zustand.ende(this);
	}
	public void abbrechen() {
		zustand.abbrechen(this);
	}
	public void programm(int zahl) {
		zustand.programm(this, zahl);
	}
	public void start() {
		zustand.start(this);
	}
	public void pause() {
		zustand.pause(this);
	}
	public void weiter() {
		zustand.weiter(this);
	}

	public void setZustand(Zustand zustand) {
		this.zustand = zustand;
	}
}
