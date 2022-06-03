public class Utils {
  //
  public static int isPercent(int value, String type) {
    if (value >= 0 && value <= 100) {
      return value;
    } else {
      System.out.println("Type must contain" + type + " range beetwen 0 and 100");
      System.out.println(type + " set to 0");
      return 0;
    }
  }
}
