public class ConstructorEx {
  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car(c1);

    System.out.println(c1);
    System.out.println(c2);
  }

}

class Car {
  String color;
  String gearType;
  int door;

  Car() {
    this("white", "auto", 4);
  }

  // 생성자에 객체를 매개변수로 받아서 객체 cloning 을 할 수 있다. (Object클래스에 clone method 제공 !)
  Car(Car c) {
    this(c.color, c.gearType, c.door);
  }

  Car(String color, String gearType, int door) {
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }

  public String toString() {
    String str = "";

    str += color + " " + gearType + " " + door;

    return str;
  }
}