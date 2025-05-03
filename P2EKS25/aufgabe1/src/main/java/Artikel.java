public class Artikel {
    private double grundpreis;
    private String bezeichnung;

    public Artikel(double grundpreis, String bezeichnung) {
        this.grundpreis = grundpreis;
        this.bezeichnung = bezeichnung;
    }

    public double getGrundpreis() {
        return grundpreis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setGrundpreis(double grundpreis) {
        this.grundpreis = grundpreis;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
