import java.io.PrintStream;
import java.util.Scanner;

public final class Excercise02Task3 {

  public static void main(final String[] args) {
    final PrintStream output = System.out;
    output.print("Geben Sie eine ganze Zahl ein: ");
    final Scanner scanner = new Scanner(System.in);
    final int number1 = scanner.nextInt();
    output.print("Geben Sie eine ganze Zahl ein: ");
    final int number2 = scanner.nextInt();
    scanner.close();
    if (number1 > number2) {
      output.println("\n" + number1 + " ist größer als " + number2);
      return;
    }
    if (number2 > number1) {
      output.println("\n" + number2 + " ist größer als " + number1);
      return;
    }
    output.println("\nDie Zahlen sind gleich groß.");
  }
}
