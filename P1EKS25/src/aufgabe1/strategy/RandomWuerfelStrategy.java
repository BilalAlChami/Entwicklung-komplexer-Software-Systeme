package aufgabe1.strategy;

import java.util.Random;

public class RandomWuerfelStrategy implements WuerfelStrategy {

	Random random = new Random();
	@Override
	public int execute() {
		return random.nextInt(1, 7);
	}
}
