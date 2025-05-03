package variationen;

import annotationen.Bearbeite2;

public class KlasseMitMethoden2 {
    private int lokaleZahl;

    public KlasseMitMethoden2() {
        lokaleZahl = 123;
    }
    @Bearbeite2
    private int macheWasMitZahl(int eingabe) {
        int ergebnis = eingabe * 3;
        return ergebnis;
    }

    public int rechne(int in) {
        int ergebnis = in * 15;
        return ergebnis;
    }

    public int addiereLokaleZahl(int eingabe) {
        int ergebnis = eingabe + lokaleZahl;
        return ergebnis;
    }

    public int getLokaleZahl() {
        return lokaleZahl;
    }

    public void setLokaleZahl(int lokaleZahl) {
        this.lokaleZahl = lokaleZahl;
    }
}
