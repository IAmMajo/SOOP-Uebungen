import java.io.PrintStream;
import java.util.Scanner;

public class Aufgabe01 {

  public static void main(String[] args) {
    // Hier die Lösung eintragen
    final PrintStream output = System.out;
    output.print("Geben Sie die Höhe des Dreiecks an: ");
    final Scanner scanner = new Scanner(System.in);
    final int height = scanner.nextInt();
    scanner.close();
    int highestNumber = 0;
    for (int i = 1; i <= height; i++) {
      highestNumber += i;
    }
    int charactersPerNumber = 2;
    for (int i = highestNumber; i > 0; i /= 10) {
      charactersPerNumber++;
    }
    charactersPerNumber += charactersPerNumber % 2;
    int number = 1;
    String result = "";
    for (int i = 1; i <= height; i++) {
      for (int j = 0; j < (height - i) * charactersPerNumber / 2; j++) {
        result += " ";
      }
      for (int j = 0; j < i; j++) {
        int digits = 0;
        for (int k = number; k > 0; k /= 10) {
          digits++;
        }
        int padding = (charactersPerNumber - digits) / 2;
        for (int k = 0; k < padding + digits % 2; k++) {
          result += "+";
        }
        result += number;
        for (int k = 0; k < padding; k++) {
          result += "*";
        }
        number++;
      }
      result += "\n";
    }
    output.println(result);
  }
}
