import java.io.PrintStream;
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

  public static String pruefeSieger(String[][] f) {
    // Horizontal durchgehen
    for (final String[] row : f) {
      String colour = null;
      int sequence = 0;
      for (final String cell : row) {
        if (cell == null || !cell.equals(colour)) {
          colour = cell;
          sequence = 0;
          continue;
        }
        if (sequence == 2) {
          return cell;
        }
        sequence++;
      }
    }
    // Vertikal durchgehen
    for (int i = 0; i < 7; i++) {
      String colour = null;
      int sequence = 0;
      for (final String[] row : f) {
        final String cell = row[i];
        if (cell == null || !cell.equals(colour)) {
          colour = cell;
          sequence = 0;
          continue;
        }
        if (sequence == 2) {
          return cell;
        }
        sequence++;
      }
    }
    // Diagonal von links oben nach rechts unten durchgehen
    for (int i = 0; i < 6; i++) {
      String colour = null;
      int sequence = 0;
      for (int j = 0; i + j < 6 && j < 7; j++) {
        final String cell = f[i + j][j];
        if (cell == null || !cell.equals(colour)) {
          colour = cell;
          sequence = 0;
          continue;
        }
        if (sequence == 2) {
          return cell;
        }
        sequence++;
      }
    }
    for (int i = 0; i < 7; i++) {
      String colour = null;
      int sequence = 0;
      for (int j = 0; j < 6 && i + j < 7; j++) {
        final String cell = f[j][i + j];
        if (cell == null || !cell.equals(colour)) {
          colour = cell;
          sequence = 0;
          continue;
        }
        if (sequence == 2) {
          return cell;
        }
        sequence++;
      }
    }
    // Diagonal von rechts oben nach links unten durchgehen
    for (int i = 0; i < 7; i++) {
      String colour = null;
      int sequence = 0;
      for (int j = 0; j < 6 && i - j >= 0; j++) {
        final String cell = f[j][i - j];
        if (cell == null || !cell.equals(colour)) {
          colour = cell;
          sequence = 0;
          continue;
        }
        if (sequence == 2) {
          return cell;
        }
        sequence++;
      }
    }
    for (int i = 0; i < 6; i++) {
      String colour = null;
      int sequence = 0;
      for (int j = 0; i + j < 6; j++) {
        final String cell = f[i + j][6 - j];
        if (cell == null || !cell.equals(colour)) {
          colour = cell;
          sequence = 0;
          continue;
        }
        if (sequence == 2) {
          return cell;
        }
        sequence++;
      }
    }
    return null;
  }

  // Methoden einsetzen
  public static void main(String[] args) {
    final String[][] gameBoard = erzeugeSpielfeld();
    final PrintStream output = System.out;
    while (true) {
      druckeSpielfeld(gameBoard);
      if (pruefeSieger(gameBoard) != null) {
        output.println("Spieler Blau hat gewonnen!");
        return;
      }
      legeRot(gameBoard);
      output.println();
      druckeSpielfeld(gameBoard);
      if (pruefeSieger(gameBoard) != null) {
        output.println("Spieler Rot hat gewonnen!");
        return;
      }
      legeBlau(gameBoard);
      output.println();
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
