import java.util.Scanner;

public class MiniProject1Task02 {

  public static int summe(int n) {
    int result = 0;
    for (int i = n / 10; i > 9; i /= 10) {
      result += i % 10;
    }
    return result;
  }

  public static void main(String[] args) {}
}
