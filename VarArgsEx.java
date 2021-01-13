/**
 * 작성법 : 타입... 변수명 가변인자를 매개변수 중 제일 마지막에 선언해야 한다. (가변인자인지 아닌지 구분할 수 없기 때문에)
 * 
 * 문자열을 하나로 결합하여 반환하는 것과 같은 매서드를 작성할 때, 오버로딩을 하기보다 가변인자를 사용한 매서드를 작성하는 것이 효율적이다.
 * 
 * Q. 가변인자는 내부적으로 배열을 이용하는데, 매개변수의 타입을 배열로 하는 것과 어떤 차이가 있는가? -> 매개변수의 타입이 배열이라면,
 * 반드시 인자를 지정해줘야 한다. 따라서 인자를 생략할 수가 없다. 따라서 null이나 길이가 0인 배열을 인자로 지정해야 하는 불편함이
 * 있다.
 * 
 * !. 가변인자를 선언한 메서드를 오버로딩하면, 메서드를 호출했을 때 구분하지 못하는 경우가 발생할 수 있으므로 주의하자.
 */
public class VarArgsEx {

  public static void main(String[] args) {
    String[] strArr = { "100", "200", "300" };

    System.out.println(concatenate("", "100", "200", "300"));
    System.out.println(concatenate("-", strArr));
    System.out.println(concatenate(",", new String[] { "1", "2", "3" }));
    System.out.println("[" + concatenate(",", new String[0]) + "]");
    // 인자 값이 없어도 작동한다.
    System.out.println("[" + concatenate(",") + "]");
  }

  static String concatenate(String delim, String... args) {
    String result = "";

    for (String str : args)
      result += str + delim;

    return result;
  }
}
