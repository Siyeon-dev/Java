public class FinalCardTest {
  public static void main(String[] args) {
    Cards c = new Cards("HEART", 10);
  }
}

class Cards {
  final int NUMBER;
  final String KIND;
  static int width = 100;
  static int height = 250;

  Cards(String kind, int num) {
    this.KIND = kind;
    this.NUMBER = num;
  }

  Cards() {
    this("HEART", 1);
  }
}
