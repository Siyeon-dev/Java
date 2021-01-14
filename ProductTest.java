class Product {
  static int count = 0;
  int serialNo;

  // 코드의 의미상 모든 생성자에서 공통적으로 수행되어야하는 내요이므로
  // 인스턴스 블럭을 사용한다.
  {
    ++count;
    serialNo = count;
  }
}

public class ProductTest {
  public static void main(String[] args) {
    Product p1 = new Product();
    Product p2 = new Product();
    Product p3 = new Product();

    System.out.println("p1 : " + p1.serialNo);
    System.out.println("p2 : " + p2.serialNo);
    System.out.println("p3 : " + p3.serialNo);
  }
  
}
