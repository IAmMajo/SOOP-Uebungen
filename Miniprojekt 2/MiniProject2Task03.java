import java.util.Scanner;

public class MiniProject2Task03 {

  static final Scanner scanner = new Scanner(System.in);

  // Muster erstellen
  public static String[][] erzeugeSpielfeld() {
    return new String[6][7];
  }

  // Muster ausgeben
  public static void druckeSpielfeld(String[][] f) {
    String output = "";
    for (final String[] row : f) {
      for (final String cell : row) {
        if (cell == null) {
          output += "| ";
          continue;
        }
        output += '|' + cell;
      }
      output += "|\n";
    }
    System.out.println(output + "---------------");
  }

  // Rote Scheibe in die unterste leere Reihe legen
  public static void legeRot(String[][] f) {
    layColour("Rot", f);
  }

  // Selbe wie zuvor nur mit "B"
  public static void legeBlau(String[][] f) {
    layColour("Blau", f);
  }

  public static String pruefeSieger(String[][] f) {}

  // Methoden einsetzen
  public static void main(String[] args) {
    final String[][] gameBoard = erzeugeSpielfeld();
    while (true) {
      druckeSpielfeld(gameBoard);
      legeRot(gameBoard);
      System.out.println();
      druckeSpielfeld(gameBoard);
      legeBlau(gameBoard);
      System.out.println();
    }
  }

  private static void layColour(
    final String colour,
    final String[][] gameBoard
  ) {
    System.out.print("Spieler " + colour + ": Welche Spalte? [0-6]: ");
    final int column = scanner.nextInt();
    for (int i = 5; i >= 0; i--) {
      if (gameBoard[i][column] != null) {
        continue;
      }
      gameBoard[i][column] = colour.substring(0, 1);
      return;
    }
  }
}
