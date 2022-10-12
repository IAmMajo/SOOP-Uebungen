import java.io.PrintStream;
import java.util.Scanner;

public final class Task4 {

  public static void main(final String[] args) {
    final PrintStream output = System.out;
    output.print("erste Zahl: ");
    final Scanner scanner = new Scanner(System.in);
    final int number1 = scanner.nextInt();
    output.print("zweite Zahl: ");
    final int number2 = scanner.nextInt();
    scanner.close();
    if (number1 % number2 == 0) {
      output.println(number1 + " ist durch " + number2 + " teilbar");
      return;
    }
    output.println(number1 + " ist nicht durch " + number2 + " teilbar");
  }
}
