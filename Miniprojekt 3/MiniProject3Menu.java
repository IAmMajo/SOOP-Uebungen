public class MiniProject3Menu extends MiniProject3Article {

  private boolean vegetarisch = false;
  private int kalorien = 0;
  private MiniProject3Drink getraenk = null;
  private String beschreibung = "";

  public MiniProject3Menu() {}

  public MiniProject3Menu(
    final String name,
    final double preis,
    final double mwstsatz,
    final boolean vegetarisch,
    final int kalorien,
    final MiniProject3Drink getraenk,
    final String beschreibung
  ) {
    super(name, preis, mwstsatz);
    this.vegetarisch = vegetarisch;
    this.kalorien = kalorien;
    this.getraenk = getraenk;
    this.beschreibung = beschreibung;
  }

  public boolean isVegetarisch() {
    return this.vegetarisch;
  }

  public int getKalorien() {
    return this.kalorien;
  }

  public MiniProject3Drink getGetraenk() {
    return this.getraenk;
  }

  public String getBeschreibung() {
    return this.beschreibung;
  }

  public void setVegetarisch(final boolean vegetarisch) {
    this.vegetarisch = vegetarisch;
  }

  public void setKalorien(final int kalorien) {
    this.kalorien = kalorien;
  }

  public void setGetraenk(final MiniProject3Drink getraenk) {
    this.getraenk = getraenk;
  }

  public void setBeschreibung(final String beschreibung) {
    this.beschreibung = beschreibung;
  }

  public String getEmpfehlung() {
    if (this.kalorien > 750) {
      return "rot";
    }
    if (this.kalorien > 500) {
      return "gelb";
    }
    return "gruen";
  }

  @Override
  public String toString() {
    String string = this.getName() + " - " + beschreibung;
    if (this.vegetarisch) {
      string += " (vegetarisch)";
    }
    return string + " (" + this.getPreis() + " Euro)";
  }
}
