import java.io.PrintStream;
import java.util.Scanner;

public final class Task6 {

  public static void main(final String[] args) {
    final PrintStream output = System.out;
    output.print("Zahl [0..9999]: ");
    final Scanner scanner = new Scanner(System.in);
    final int number = scanner.nextInt();
    scanner.close();
    if (number < 0) {
      output.println("Die Zahl darf nicht negativ sein!");
      return;
    }
    if (number > 9999) {
      output.println("Die Zahl muss kleiner als 10 000 sein!");
      return;
    }
    String numberString = "";
    final String digit1 = digitToString(number / 1000);
    if (digit1 != "") {
      numberString += digit1 + "tausend";
    }
    final String digit2 = digitToString(number / 100 % 10);
    if (digit2 != "") {
      numberString += digit2 + "hundert";
    }
    String digit3 = digitToString(number / 10 % 10);
    switch (digit3) {
      case "ein":
        digit3 = "zehn";
        break;
      case "zwei":
        digit3 = "zwanzig";
        break;
      case "sieben":
        digit3 = "siebzig";
        break;
      default:
        if (digit3 != "") {
          digit3 += "zig";
        }
    }
    final String digit4 = digitToString(number % 10);
    switch (digit4) {
      case "":
        if (digit1 == "" && digit2 == "" && digit3 == "") {
          numberString = "null";
          break;
        }
        numberString += digit3;
        break;
      case "ein":
        if (digit3 == "") {
          numberString += "eins";
          break;
        }
        if (digit3 == "zehn") {
          numberString += "elf";
          break;
        }
      case "zwei":
        if (digit3 == "zehn") {
          numberString += "zwölf";
          break;
        }
      default:
        if (digit3 == "") {
          numberString += digit4;
          break;
        }
        if (digit3 == "zehn") {
          numberString += digit4 + digit3;
          break;
        }
        numberString += digit4 + "und" + digit3;
    }
    output.println(numberString);
  }

  private static String digitToString(int digit) {
    switch (digit) {
      case 1:
        return "ein";
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
