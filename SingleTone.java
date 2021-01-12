class SingleTone {
  /**
   * 최초 한번만 메모리 할당 (static) 실제 사용하는 객체는 하나
   * 
   * 사용 이유 1. 메모리 낭비 막을 수 있다 (고정된 메모리 영역 - 하나의 인스턴스 재활용) 2. 전역 인스턴스이므로 데이터 공유 쉽다
   * 3. DBCP 공통된 객체를 여러개 생성해서 사용할 때
   * 
   * 주의점 1. 멀티쓰레드 환경에서 동기화 처리를 안하면 인스턴스가 여러 개가 되는 사태가 발생 가능 2. 한 번 사용하면 앱 종료시까지
   * 메모리에 상주 3. 테스팅 어려움.. etc
   * 
   * 참고 사이트
   * http://blog.naver.com/PostView.nhn?blogId=h9911120&logNo=222056488835&categoryNo=0&parentCategoryNo=4&viewDate=&currentPage=1&postListTopCurrentPage=1&from=search
   */

  public static void main(String[] args) {
    SingleToneExample test1 = SingleToneExample.init();
    SingleToneExample test2 = SingleToneExample.init();

    System.out.println(test1);
    System.out.println(test2);
  }
}

class SingleToneExample {
  private SingleToneExample() {
  };

  static SingleToneExample instance;

  // 참고로 this keyword 는 static member var 에 사용할 수 없다.
  static SingleToneExample init() {
    if (instance == null)
      instance = new SingleToneExample();

    return instance;
  }
}