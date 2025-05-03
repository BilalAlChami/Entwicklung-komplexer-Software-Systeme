package aufgabe1;

public class Klient {

	private final Wuerfel meinWuerfel;

	public Klient(Wuerfel meinWuerfel) {
		this.meinWuerfel = meinWuerfel;
	}

	public void werfen() {
		System.out.println("Ich habe " + meinWuerfel.werfen() + " gewuerfelt");
	}

}