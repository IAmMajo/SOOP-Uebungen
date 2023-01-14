public class MiniProject3Checkout {

  private MiniProject3Bill[] rechnungen = new MiniProject3Bill[0];
  private double barBestand = 0;

  public MiniProject3Checkout() {}

  public MiniProject3Checkout(double barBestand) {
    this.barBestand = barBestand;
  }

  public MiniProject3Bill[] getRechnungen() {
    return this.rechnungen;
  }

  public double getBarBestand() {
    return this.barBestand;
  }

  public void setRechnungen(final MiniProject3Bill[] rechnungen) {
    this.rechnungen = rechnungen;
  }

  public void setBarBestand(final double barBestand) {
    this.barBestand = barBestand;
  }

  public void neueRechnung() {
    final int billsLength = this.rechnungen.length;
    final MiniProject3Bill[] newBills = new MiniProject3Bill[billsLength + 1];
    for (int i = 0; i < billsLength; i++) {
      newBills[i] = this.rechnungen[i];
    }
    newBills[billsLength] = new MiniProject3Bill();
    this.rechnungen = newBills;
  }

  public void neuerArtikel(final MiniProject3Article article) {
    this.rechnungen[this.rechnungen.length - 1].neuerArtikel(article);
  }

  public double kassieren() {
    return this.rechnungen[this.rechnungen.length - 1].getBetrag();
  }

  public double bezahlen(double gegeben) {
    final double amount = this.kassieren();
    this.barBestand += amount;
    return gegeben - amount;
  }

  public double getUmsatz() {
    double sum = 0;
    for (final MiniProject3Bill bill : rechnungen) {
      sum += bill.getBetrag();
    }
    return sum;
  }
}
