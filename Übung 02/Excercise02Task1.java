import java.io.PrintStream;
import java.util.Scanner;

public class Excercise02Task1 {

  public static void main(String[] args) {
    final PrintStream output = System.out;
    int laenge = 0;
    int breite = 0;
    int flaeche = 0;
    int umfang = 0;

    // Eingabe:
    output.print("Länge des Rechtecks: ");
    final Scanner scanner = new Scanner(System.in);
    laenge = scanner.nextInt();
    if (laenge <= 0) {
      scanner.close();
      output.println("Die Länge des Rechtecks muss positiv sein!");
      return;
    }
    output.print("Breite des Rechtecks: ");
    breite = scanner.nextInt();
    scanner.close();
    if (breite <= 0) {
      output.println("Die Breite des Rechtecks muss positiv sein!");
      return;
    }

    // Berechnung:
    umfang = 2 * (laenge + breite);
    flaeche = laenge * breite;

    // Ausgabe:
    output.println(
      "\nR: " +
      laenge +
      " " +
      breite +
      "\nUmfang: " +
      umfang +
      "\nFläche: " +
      flaeche
    );
  }
}
