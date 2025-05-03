package aufgabe2.zustand;

import aufgabe2.Waschmaschine;

public interface Zustand {

	String ERROR_TEXT_PART_1 = "Methode PLACEHOLDER ist im Zustand ";
	String ERROR_TEXT_PART_2 = " nicht möglich!";

	default void ein(Waschmaschine waschmaschine) {
		System.out.println(getReplacedErrorText("ein") + getName() + ERROR_TEXT_PART_2);
	}
	default void aus(Waschmaschine waschmaschine) {
		System.out.println(getReplacedErrorText("aus") + getName() + ERROR_TEXT_PART_2);
	}
	default void ende(Waschmaschine waschmaschine) {
		System.out.println(getReplacedErrorText("ende") + getName() + ERROR_TEXT_PART_2);
	}
	default void abbrechen(Waschmaschine waschmaschine) {
		System.out.println(getReplacedErrorText("abbrechen") + getName() + ERROR_TEXT_PART_2);
	}
	default void programm(Waschmaschine waschmaschine, int zahl) {
		System.out.println(getReplacedErrorText("programm") + getName() + ERROR_TEXT_PART_2);
	}
	default void start(Waschmaschine waschmaschine) {
		System.out.println(getReplacedErrorText("start") + getName() + ERROR_TEXT_PART_2);
	}
	default void pause(Waschmaschine waschmaschine) {
		System.out.println(getReplacedErrorText("pause") + getName() + ERROR_TEXT_PART_2);
	}
	default void weiter(Waschmaschine waschmaschine) {
		System.out.println(getReplacedErrorText("weiter") + getName() + ERROR_TEXT_PART_2);
	}

	private static String getReplacedErrorText(String replacement) {
		return ERROR_TEXT_PART_1.replace("PLACEHOLDER", replacement);
	}

	private String getName() {
		return this.getClass().getName().replace("aufgabe2.zustand.", "");
	}

}
