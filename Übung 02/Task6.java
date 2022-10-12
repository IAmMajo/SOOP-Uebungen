import java.io.PrintStream;
import java.util.Scanner;

public final class Task6 {

  public static void main(final String[] args) {
    final PrintStream output = System.out;
    output.print("Zahl [0..9999]: ");
    final Scanner scanner = new Scanner(System.in);
    final int number = scanner.nextInt();
    scanner.close();
    (number + "").length();
    String.valueOf(number).length();

  private static String digitToString(byte digit) {
    switch (digit) {
      case 1:
        return "eins";
      case 2:
        return "zwei";
      case 3:
        return "drei";
      case 4:
        return "vier";
      case 5:
        return "fünf";
      case 6:
        return "sechs";
      case 7:
        return "sieben";
      case 8:
        return "acht";
      case 9:
        return "neun";
      default:
        return "";
    }
  }
}
