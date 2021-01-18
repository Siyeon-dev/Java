public class AbstractTest {
  public static void main(String[] args) {
    Unit[] group = new Unit[4];
    group[0] = new Marine();
    group[1] = new Tank();
    group[2] = new Marine();
    group[3] = new Dropship();

    // 다형성의 매서드 동적 바인딩을 통해서 각 인스턴스 별 구현된 move 매서드를 실행할 수 있다.
    for (int i = 0; i < group.length; i++) {
      group[i].move(100, 200);
    }
  }
}

abstract class Unit {
  int x;
  int y;

  abstract void move(int x, int y);

  void stop() {
    System.out.println("정지");
  }

}

class Marine extends Unit {
  @Override
  void move(int x, int y) {
    // TODO Auto-generated method stub
    System.out.println("이동");
  }

  void stimPack() {
    System.out.println("스팀팩");
  }

}

class Tank extends Unit {

  @Override
  void move(int x, int y) {
    // TODO Auto-generated method stub
    System.out.println("이동");
  }

  void changeMode() {
    System.out.println("공격모드 변환");
  }
}

class Dropship extends Unit {

  @Override
  void move(int x, int y) {
    // TODO Auto-generated method stub
    System.out.println("이동");
  }

  void load() {
    System.out.println("대상 태우기");
  }

  void unload() {
    System.out.println("대상 내리기");
  }
}