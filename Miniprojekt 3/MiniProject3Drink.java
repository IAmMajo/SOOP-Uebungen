public class MiniProject3Drink extends MiniProject3Article {

  private double pfand = 0;

  public MiniProject3Drink() {}

  public MiniProject3Drink(
    final String name,
    final double preis,
    final double mwstsatz,
    final double pfand
  ) {
    super(name, preis, mwstsatz);
    this.pfand = pfand;
  }

  public double getPfand() {
    return this.pfand;
  }

  public void setPfand(final double pfand) {
    this.pfand = pfand;
  }

  @Override
  public String toString() {
    return (
      this.getName() +
      " - " +
      this.getPreis() +
      " Euro (inkl. " +
      this.pfand +
      " Pfand) (inkl. " +
      this.berechneMwst() +
      " Euro Mwst.)"
    );
  }
}
