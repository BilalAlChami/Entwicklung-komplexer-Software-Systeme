import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainClass {
	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new GuiceModule());
		VerkaufspreisBerechner verkaufspreisBerechner = injector.getInstance(VerkaufspreisBerechner.class);
		Artikel artikel1 = new Artikel(210.78, "Artikel1");
		Artikel artikel2 = new Artikel(100.00, "Artikel2");

		verkaufspreisBerechner.verkaufspreis(artikel1);
		verkaufspreisBerechner.verkaufspreis(artikel2);
	}
}
