package aufgabe1.strategy;

import java.util.List;

public class CyclicValueWuerfelStrategy implements WuerfelStrategy {
	private int currentIndex = 0;
	private final List<Integer> VALUES = List.of(3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2);
	@Override
	public int execute() {
		if (currentIndex >= VALUES.size()) {
			currentIndex = 0;
		}
		Integer wuerfelValue = VALUES.get(currentIndex);
		currentIndex++;
		return wuerfelValue;
	}
}
