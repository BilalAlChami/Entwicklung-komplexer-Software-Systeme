package aufgabe2;

public class Main {
	public static void main(String[] args) {
		Waschmaschine waschmaschine = new Waschmaschine();

		waschmaschine.getZustand();

		waschmaschine.ein();
		waschmaschine.getZustand();

		waschmaschine.programm(3);
		waschmaschine.getZustand();

		waschmaschine.start();
		waschmaschine.getZustand();

		waschmaschine.pause();
		waschmaschine.getZustand();

		waschmaschine.weiter();
		waschmaschine.getZustand();

		waschmaschine.ende();
		waschmaschine.getZustand();



		waschmaschine.aus();
		waschmaschine.getZustand();

		waschmaschine.ein();
		waschmaschine.programm(4);

		waschmaschine.abbrechen();
		waschmaschine.getZustand();



		waschmaschine.programm(2);
		waschmaschine.start();
		waschmaschine.programm(2);
		waschmaschine.abbrechen();


		waschmaschine.pause();
		waschmaschine.pause();
		waschmaschine.abbrechen();
		waschmaschine.getZustand();
		waschmaschine.aus();
		waschmaschine.getZustand();

	}
}
