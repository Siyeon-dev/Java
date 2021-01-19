public class ParserTest {
  public static void main(String[] args) {
    Parseable parser = ParserManager.getParser("XML");
    parser.parse("document.xml");
    parser = ParserManager.getParser("HTML");
    parser.parse("document2.html");
  }
}

interface Parseable {
  // 구문 분석 작업 수행
  public abstract void parse(String fileName);
}

class ParserManager {
  // 리턴 타입이 Parseable 인터페이스이다.
  public static Parseable getParser(String type) {
    if (type.equals("XML")) {
      return new XMLParser();
    } else {
      Parseable p = new HTMLParser();
      return p;
      // return new HTMLParser();
    }
  }
}

class XMLParser implements Parseable {
  // 구문 분석 작업 수행 코드 작성
  @Override
  public void parse(String fileName) {
    // TODO Auto-generated method stub
    System.out.println(fileName + "-XML parsing completed.");
  }
}

class HTMLParser implements Parseable {
  // 구문 분석 작업 수행 코드 작성
  @Override
  public void parse(String fileName) {
    // TODO Auto-generated method stub
    System.out.println(fileName + "-HTML parsing completed.");
  }
}