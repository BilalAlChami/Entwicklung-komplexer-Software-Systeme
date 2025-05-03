import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class GuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(PreisBerechner.class).to(PreisBerechnerNovember2022.class);
		bind(String.class).annotatedWith(Names.named("profitComment")).toInstance("Gewinn beträgt 20%: ");
		bind(String.class).annotatedWith(Names.named("taxComment")).toInstance("MWSt beträgt 7%: ");
	}

}
