public final class PracticeII {

  static int[][][] gameAFS_praII = {
    { {}, { 0 }, {}, {}, {}, {} },
    { {}, {}, { 2 }, { 5 }, {}, {} },
    { { 1 }, {}, {}, {}, {}, {} },
    { {}, {}, {}, {}, { 4 }, {} },
    { {}, {}, {}, {}, {}, { 6 } },
    { {}, {}, {}, { 4 }, {}, {} },
    { { 1 }, { 0 }, { 0 }, { 0 }, { 0 }, { 2 } },
  };

  static int[][][] gameAFS_origin = {
    { {}, { 0 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 1 }, {}, {}, {} },
    { {}, {}, { 2 }, { 1 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
    { { 1 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
    {
      {},
      {},
      {},
      {},
      { 4 },
      {},
      { 4 },
      {},
      {},
      { 5 },
      { 3 },
      {},
      {},
      {},
      {},
      {},
    },
    { {}, {}, {}, {}, {}, { 6 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
    { {}, {}, {}, { 4 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
    { {}, {}, {}, {}, {}, {}, {}, { 6 }, {}, {}, {}, {}, {}, {}, {}, {} },
    { {}, {}, {}, {}, {}, {}, {}, {}, { 1 }, {}, {}, {}, {}, {}, {}, {} },
    { {}, {}, {}, { 5 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
    { {}, {}, {}, { 0 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
    { {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 2 }, {}, {}, {}, {} },
    { {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
    { {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 6 }, {}, {} },
    { {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 0 }, {} },
    { {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 4 } },
    { {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 6 }, {}, {}, {}, {} },
    {
      { 1 },
      { 0 },
      { 0 },
      { 0 },
      { 0 },
      { 0 },
      { 0 },
      { 0 },
      { 0 },
      { 0 },
      { 0 },
      { 2 },
      { 0 },
      { 0 },
      { 0 },
      { 0 },
    },
  };

  private static String[][] ICONS = {
    { "        ", " /\\ /\\  ", "  o o   ", "  --    ", "        " },
    { "        ", "   *    ", "  ***   ", "   *    ", "   *    " },
    { "        ", " ~~~~~  ", "  ~~~~~ ", " ~~~~~  ", "        " },
    { "  ****  ", " *    * ", "*      *", "*      *", "*      *" },
    { " ****** ", " *    * ", " * *  * ", " *    * ", " ****** " },
    { "        ", "* * *** ", "****   *", "    *** ", "        " },
    { "        ", "  ****  ", " ****** ", " * ** * ", " ****** " },
  };

  private static char[] LETTERS = { 'D', 'S', 'R', 'A', 'O', 'K', 'T' };

  public static String createTable(
    int[][][] gameboard,
    int n,
    int currentState
  ) {
    int nDigits = 0;
    for (int i = n; i > 0; i /= 10) {
      nDigits++;
    }
    final int firstColumnLength = nDigits + 5;
    String output = repeatChar(' ', firstColumnLength) + '|';
    for (int i = 1; i <= n; i++) {
      output += String.format("%8d|", i);
    }
    final int lineLength = firstColumnLength + 1 + 9 * n;
    output += '\n' + repeatChar('*', lineLength) + '\n';
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < 5; j++) {
        if (j == 2) {
          if (i == currentState) {
            output += "-->";
          } else {
            output += "   ";
          }
          output += String.format(" %" + nDigits + "s ", i);
        } else {
          output += repeatChar(' ', firstColumnLength);
        }
        output += '|';
        for (int k = 0; k < n; k++) {
          final int[] state = gameboard[i - 1][k];
          final int stateLength = state.length;
          if (stateLength == 1) {
            output += ICONS[state[0]][j];
          } else if (stateLength > 1) {
            String lettersString = String.valueOf(LETTERS[state[0]]);
            for (int l = 1; l < stateLength; l++) {
              lettersString += ',';
              if (l % 3 != 0) {
                lettersString += ' ';
              }
              lettersString += LETTERS[state[l]];
            }
            final int lettersStringLength = lettersString.length();
            final int start = j * 8;
            final int end = start + 8;
            if (start > lettersStringLength) {
              output += "        ";
            } else if (end > lettersStringLength) {
              output +=
                lettersString.substring(start) +
                repeatChar(' ', 8 - lettersStringLength % 8);
            } else {
              output += lettersString.substring(start, end);
            }
          } else {
            output += "        ";
          }
          output += '|';
        }
        output += '\n';
      }
      output += repeatChar('*', lineLength) + '\n';
    }
    output += repeatChar(' ', firstColumnLength) + '|';
    for (int i = 0; i < n; i++) {
      output += String.format("%8d|", gameboard[n][i][0]);
    }
    System.out.println(output);
    return output;
  }

  public static void main(final String[] args) {}

  private static String repeatChar(final char toRepeat, final int repetitions) {
    String result = "";
    for (int i = 0; i < repetitions; i++) {
      result += toRepeat;
    }
    return result;
  }
}
