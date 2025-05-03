package schablone;

import variationen.KlasseMitMethoden1;
import variationen.KlasseMitMethoden2;
import variationen.KlasseMitMethoden3;

import java.lang.reflect.InvocationTargetException;

public class Starter {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Class<?>[] klassen = {KlasseMitMethoden1.class, KlasseMitMethoden2.class, KlasseMitMethoden3.class};
        SchablonenKlasse schablone = new SchablonenKlasse(klassen);
        schablone.schablonenMethode();
    }
}
