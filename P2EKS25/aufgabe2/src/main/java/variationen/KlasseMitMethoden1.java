package variationen;

import annotationen.Bearbeite1;

public class KlasseMitMethoden1 {
    private int meineZahl;

    public KlasseMitMethoden1() {
        meineZahl = 244;
    }

    @Bearbeite1
    private  int rechne(int eingabe){
        int ergebnis = eingabe * 2;
        return ergebnis;
    }

    private int recheneMitMeinerZahl(int eingabe) {
        int ergebnis = eingabe * meineZahl;
        return ergebnis;
    }

    public int getMeineZahl() {
        return meineZahl;
    }

    public void setMeineZahl(int meineZahl) {
        this.meineZahl = meineZahl;
    }
}
