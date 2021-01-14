public class DrawShape {
  public static void main(String[] args) {
    Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };

    Triangle t = new Triangle(p);
    Circle c = new Circle(new Point(150, 150), 50);

    t.draw();
    c.draw();
  }

}

class Shape {
  String color = "Black";

  void draw() {
    System.out.printf("[color=%s]\n", color);
  }
}

class Point {
  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  Point() {
    this(0, 0);
  }

  String getXY() {
    return "(" + x + ", " + y + ")";
  }
}

class Circle extends Shape {
  Point center; // 원의 원점좌표 (클래스 포함관계)
  int r; // 반지름

  Circle() {
    this(new Point(0, 0), 100);
  }

  Circle(Point center, int r) {
    this.center = center;
    this.r = r;
  }

  void draw() {
    System.out.println("center = " + center.x + ", " + center.y);
    System.out.println("r = " + r);
    System.out.println("color = " + color);
  }
}

class Triangle extends Shape {
  Point[] p = new Point[3]; // 클래스 포함관계

  Triangle(Point[] p) {
    // 배열의 시작 주소값을 p로부터 전달받는다.
    this.p = p;
  }

  void draw() {
    System.out.printf("p1 : %s   p2 : %s   p3 : %s,   color : %s\n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
  }
}