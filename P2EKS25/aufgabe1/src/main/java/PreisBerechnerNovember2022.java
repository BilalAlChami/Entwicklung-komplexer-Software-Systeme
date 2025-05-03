public class PreisBerechnerNovember2022 implements PreisBerechner {

	private static final double PROFIT_MARGIN = 0.2;
	private static final double TAX_RATE = 0.07;

	@Override
	public double gewinn(double grundpreis) {
		return grundpreis * PROFIT_MARGIN;
	}

	@Override
	public double mwst(double nettopreis) {
		return nettopreis * TAX_RATE;
	}
}
