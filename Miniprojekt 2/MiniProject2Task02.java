public class MiniProject2Task02 {

  public static int wieOftWort(String s, String[] a) {
    int amount = 0;
    for (final String word : a) {
      if (word.equalsIgnoreCase(s)) {
        amount++;
      }
    }
    return amount;
  }

  public static void main(String[] args) {}
}
