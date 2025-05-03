package variationen;

import annotationen.Bearbeite2;
import annotationen.Bearbeite3;

public class KlasseMitMethoden3 {
    private int etwasLokales;

    public KlasseMitMethoden3() {
    }
    @Bearbeite3
    public int rechne(int in) {
        int ergebnis = in * 10;
        return ergebnis;
    }

    public int getEtwasLokales() {
        return etwasLokales;
    }

    public void setEtwasLokales(int etwasLokales) {
        this.etwasLokales = etwasLokales;
    }
}
