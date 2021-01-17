import java.util.Vector;

public class PolyArgumentTest3 {
  public static void main(String[] args) {
    Buyer b = new Buyer();
    Tv tv = new Tv();
    Computer com = new Computer();
    Audio audio = new Audio();

    b.buy(tv);
    b.buy(com);
    b.buy(audio);
    b.summary();
    System.out.println();
    b.refund(com);
    b.summary();
  }

}

class Product {
  int price;
  int bonusPoint;

  Product(int price) {
    this.price = price;
    bonusPoint = (int) (price / 10.0);
  }

  Product() {
    price = 0;
    bonusPoint = 0;
  }
}

class Tv extends Product {
  Tv() {
    super(100);
  }

  public String toString() {
    return "Tv";
  }
}

class Computer extends Product {
  Computer() {
    super(200);
  }

  public String toString() {
    return "Computer";
  }
}

class Audio extends Product {
  Audio() {
    super(50);
  }

  public String toString() {
    return "Audio";
  }
}

class Buyer {
  int money = 1000;
  int bonusPoint = 0;
  Vector item = new Vector();

  void buy(Product p) {
    if (money < p.price) {
      System.out.println("잔액 부족");
      return;
    }

    money -= p.price;
    bonusPoint += p.bonusPoint;
    item.add(p);
    System.out.println(p + "을/를 구매하셨습니다.");
  }

  void refund(Product p) {
    if (item.remove(p)) {
      money += p.price;
      bonusPoint -= p.bonusPoint;
      System.out.println(p + "을/를 반품하셨습니다.");
    } else {
      System.out.println("해당 제품이 없습니다.");
    }
  }

  void summary() {
    int sum = 0;
    String itemList = "";

    if (item.isEmpty()) {
      System.out.println("해당 제품이 없습니다.");
      return;
    }

    for (int i = 0; i < item.size(); i++) {
      // Vector method의 반환 타입이 Object 타입이므로 형변환 해줘야 함.
      Product p = (Product) item.get(i);
      sum += p.price;
      itemList += (i == 0) ? "" + p : ", " + p;
    }

    System.out.println("구매한 물품 총금액 : " + sum);
    System.out.println("구입한 제품 : " + itemList);
  }
}