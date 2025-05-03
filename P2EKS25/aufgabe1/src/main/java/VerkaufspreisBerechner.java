import com.google.inject.Inject;
import com.google.inject.name.Named;

public class VerkaufspreisBerechner {
	@Inject
	@Named("profitComment")
	private String profitComment;
	@Inject
	@Named("taxComment")
	private String taxComment;

	private final PreisBerechner preisBerechner;
	@Inject
	public VerkaufspreisBerechner(PreisBerechner preisBerechner) {
		this.preisBerechner = preisBerechner;
	}

	public void verkaufspreis(Artikel dieserArtikel) {
		System.out.println("Berechne Preis für: " + dieserArtikel.getBezeichnung());
		double gewinn = preisBerechner.gewinn(dieserArtikel.getGrundpreis());
		System.out.println(profitComment + gewinn);
		double mwst = preisBerechner.mwst(dieserArtikel.getGrundpreis() + gewinn);
		System.out.println(taxComment + mwst);
		double verkaufspreis = dieserArtikel.getGrundpreis() + gewinn + mwst;
		System.out.println("Berechneter Verkaufspreis: " + verkaufspreis);
	}
}
