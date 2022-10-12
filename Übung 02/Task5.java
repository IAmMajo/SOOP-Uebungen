import java.io.PrintStream;
import java.util.Scanner;

public final class Task5 {

  public static void main(final String[] args) {
    final PrintStream output = System.out;
    output.print("1. Intervallgrenze: ");
    final Scanner scanner = new Scanner(System.in);
    int limit1 = scanner.nextInt();
    output.print("2. Intervallgrenze: ");
    int limit2 = scanner.nextInt();
    output.print("Zahl: ");
    final int number = scanner.nextInt();
    scanner.close();
    if (limit2 < limit1) {
      final int newLimit2 = limit1;
      limit1 = limit2;
      limit2 = newLimit2;
    }
    if (number >= limit1 && number <= limit2) {
      output.println(
        number + " liegt im Intervall [" + limit1 + ", " + limit2 + "]"
      );
      return;
    }
    output.println(
      number + " liegt nicht im Intervall [" + limit1 + ", " + limit2 + "]"
    );
  }
}
