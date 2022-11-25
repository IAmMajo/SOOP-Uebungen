public class MiniProject1Task04 {

  public static String convertMillisec(long ms) {
    int seconds = (int) (ms / 1000);
    int minutes = seconds / 60;
    return String.format(
      "%02d:%02d:%02d",
      minutes / 60,
      minutes % 60,
      seconds % 60
    );
  }

  public static void main(String[] args) {}
}
