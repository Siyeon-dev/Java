public class CastingTest1 {
  public static void main(String[] args) {
    Car car = null;
    FireEngine fe = new FireEngine();
    FireEngine fe2 = null;

    fe.water();
    car = fe;
    car.water();
    fe2 = (FireEngine) car;
    fe2.water();
  }
}

class Car {
  String color;
  int door;

  void drive() {
    System.out.println("드라이브");
  }

  void stop() {
    System.out.println("멈추기");
  }
}

class FireEngine extends Car {
  void water() {
    System.out.println("물뿌리기");
  }
}