public class MiniProject3Article {

  private String name = "";
  private double preis = 0;
  private double mwstsatz = 0;

  public MiniProject3Article() {}

  public MiniProject3Article(
    final String name,
    final double preis,
    final double mwstsatz
  ) {
    this.name = name;
    this.preis = preis;
    this.mwstsatz = mwstsatz;
  }

  public String getName() {
    return this.name;
  }

  public double getPreis() {
    return this.preis;
  }

  public double getMwstsatz() {
    return this.mwstsatz;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public void setPreis(final double preis) {
    this.preis = preis;
  }

  public void setMwstsatz(final double mwstsatz) {
    this.mwstsatz = mwstsatz;
  }

  public double berechneMwst() {
    return Math.round(this.mwstsatz * this.preis * 100) / 100d;
  }

  @Override
  public String toString() {
    return (
      this.name +
      " - " +
      this.preis +
      " Euro (inkl. " +
      this.berechneMwst() +
      " Euro Mwst.)"
    );
  }
}
