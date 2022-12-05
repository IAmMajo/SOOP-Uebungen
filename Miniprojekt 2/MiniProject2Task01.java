public class MiniProject2Task01 {

  public static double summeDiagonale(double[][] a) {
    final int length = a.length;
    double sum = 0;
    for (int i = 0; i < length; i++) {
      sum += a[i][i] + a[i][length - 1 - i];
    }
    return sum;
  }

  public static void main(String[] args) {}
}
