package aufgabe1;

import java.util.stream.IntStream;

import aufgabe1.strategy.CyclicValueWuerfelStrategy;
import aufgabe1.strategy.FixedValueWuerfelStrategy;
import aufgabe1.strategy.RandomWuerfelStrategy;

public class Main {

	public static void main(String[] args) {
		Wuerfel wuerfel = new Wuerfel();
		Manipulator manipulator = new Manipulator(wuerfel);
		Klient klient = new Klient(wuerfel);

		manipulator.manipuliereStrategie(new RandomWuerfelStrategy());
		IntStream.range(0, 10).forEach(i -> klient.werfen());

		manipulator.manipuliereStrategie(new FixedValueWuerfelStrategy());
		IntStream.range(0, 10).forEach(i -> klient.werfen());

		manipulator.manipuliereStrategie(new CyclicValueWuerfelStrategy());
		IntStream.range(0, 10).forEach(i -> klient.werfen());

	}
}