import java.io.PrintStream;
import java.util.Scanner;

public final class Excercise02Task2 {

  public static void main(final String[] args) {
    final PrintStream output = System.out;
    output.print("Geben Sie eine ganze Zahl ein: ");
    final Scanner scanner = new Scanner(System.in);
    final int number = scanner.nextInt();
    scanner.close();
    if (number % 3 == 0) {
      output.println(number + " ist durch 3 teilbar");
      return;
    }
    output.println(number + " ist nicht durch 3 teilbar");
  }
}
