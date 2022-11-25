public class MiniProject1Task03 {

  public static boolean isValidTransaction(double credit, double transaction) {
    return credit >= transaction;
  }

  public static String recommendation(String type) {
    switch (type) {
      case "Vegetarisch":
        return "Salatbar";
      case "Low Carb":
        return "Menü 2";
      case "Kleiner Hunger":
        return "Menü 1";
    }
    return "Grill";
  }

  public static double price(String menu) {
    switch (menu) {
      case "Salatbar":
        return 2.5;
      case "Menü 1":
        return 1;
      case "Menü 2":
        return 1.2;
    }
    return 3.8;
  }

  public static void main(String[] args) {}
}
