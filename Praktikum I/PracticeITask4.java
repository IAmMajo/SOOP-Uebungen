import java.io.PrintStream;
import java.util.Scanner;

/*
 * Vergleich von next(), nextLine() und nextDouble() verfügbar unter
 * https://1drv.ms/w/s!As0cv-ZqAHgP_YF13DekcJWavhuiLw?e=CKggNF
 */
public final class PracticeITask4 {

  public static void main(final String[] args) {
    final PrintStream output = System.out;
    output.println(
      "Geben Sie Ihre ASCII-Art zeilenweise ein:\nGeben Sie die 1. Zeile ein:"
    );
    final Scanner scanner = new Scanner(System.in);
    final String line1 = scanner.nextLine();
    output.println("Geben Sie die 2. Zeile ein:");
    final String line2 = scanner.nextLine();
    output.println("Geben Sie die 3. Zeile ein:");
    final String line3 = scanner.nextLine();
    output.println("Geben Sie die 4. Zeile ein:");
    final String line4 = scanner.nextLine();
    output.println("Geben Sie die 5. Zeile ein:");
    final String line5 = scanner.nextLine();
    output.println("Geben Sie die 6. Zeile ein:");
    final String line6 = scanner.nextLine();
    output.println("Geben Sie die 7. Zeile ein:");
    final String line7 = scanner.nextLine();
    output.println("Geben Sie die 8. Zeile ein:");
    final String line8 = scanner.nextLine();
    output.println("Geben Sie die 9. Zeile ein:");
    final String line9 = scanner.nextLine();
    scanner.close();
    System.out.println(
      "Ihre finale Eingabe lautet:\n" +
      line1 +
      "\n" +
      line2 +
      "\n" +
      line3 +
      "\n" +
      line4 +
      "\n" +
      line5 +
      "\n" +
      line6 +
      "\n" +
      line7 +
      "\n" +
      line8 +
      "\n" +
      line9
    );
  }
}
