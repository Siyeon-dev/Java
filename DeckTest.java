public class DeckTest {
  public static void main(String[] args) {
    Deck d = new Deck();  // 카드 한 벌(Deck)을 만든다.
    Card c = d.pick();    // 섞기 전 제일 위 카드 뽑는다.
    System.out.println(c);  // 해당 카드 출력

    d.suffle(); // 카드를 섞는다.
    c = d.pick(); // 섞은 후 제일 위 카드를 뽑는다.
    System.out.println(c);  // 해당 카드 출력
  }
}

class Deck {
  final int CARD_NUM = 52; // 카드의 수
  Card[] cardArr = new Card[CARD_NUM];

  // Desc의 카드를 초기화 한다.
  Deck() {
    int i = 0;

    for (int k = Card.KIND_MAX; k > 0; k--)
      for (int n = 0; n < Card.NUM_MAX; n++)
        cardArr[i++] = new Card(k, n + 1);
  }

  // 지정된 위치(Index)에 있는 카드 하나를 꺼내서 반환
  Card pick(int index) {
    return cardArr[index];
  }

  // Deck 에서 카드 하나를 선택한다.
  Card pick() {
    int index = (int) (Math.random() * CARD_NUM);
    return pick(index);
  }

  void suffle() {
    for (int i = 0; i < cardArr.length; i++) {
      int r = (int) (Math.random() * CARD_NUM);

      Card temp = cardArr[i];
      cardArr[i] = cardArr[r];
      cardArr[r] = temp;
    }
  }
}

class Card {
  static final int KIND_MAX = 4; // 카드 무늬의 수
  static final int NUM_MAX = 13; // 무늬별 카드 수

  static final int SPADE = 4;
  static final int DIAMOND = 3;
  static final int HEART = 2;
  static final int CLOVER = 1;

  int kind;
  int number;

  Card() {
    this(SPADE, 1);
  }

  Card(int kind, int number) {
    this.kind = kind;
    this.number = number;
  }

  public String toString() {
    String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
    String numbers = "0123456789XJQK"; // 숫자 10은 x로 표현

    return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
  }
}
