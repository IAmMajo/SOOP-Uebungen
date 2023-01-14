public class MiniProject3Bill {

  private MiniProject3Article[] artikel = new MiniProject3Article[0];

  public MiniProject3Article[] getArtikel() {
    return this.artikel;
  }

  public void setArtikel(final MiniProject3Article[] artikel) {
    this.artikel = artikel;
  }

  public void neuerArtikel(final MiniProject3Article artikel) {
    final int articlesLength = this.artikel.length;
    final MiniProject3Article[] newArticles = new MiniProject3Article[articlesLength +
    1];
    for (int i = 0; i < articlesLength; i++) {
      newArticles[i] = this.artikel[i];
    }
    newArticles[articlesLength] = artikel;
    this.artikel = newArticles;
  }

  public double getBetrag() {
    double sum = 0;
    for (final MiniProject3Article article : artikel) {
      sum += article.getPreis();
    }
    return sum;
  }
}
