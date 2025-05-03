package aufgabe1.strategy;

public class FixedValueWuerfelStrategy implements WuerfelStrategy {

	private static final int FIXED_VALUE = 4;

	@Override
	public int execute() {
		return FIXED_VALUE;
	}
}
