public class InterfaceTest implements IVCR {
  VCR vcr = new VCR();

  @Override
  public void play() {
    // TODO Auto-generated method stub
    vcr.play();
  }

  @Override
  public void stop() {
    // TODO Auto-generated method stub
    vcr.stop();
  }

  @Override
  public void reset() {
    // TODO Auto-generated method stub
    vcr.reset();
  }

  @Override
  public int getCounter() {
    // TODO Auto-generated method stub
    return vcr.getCounter();
  }

  @Override
  public void setCounter(int c) {
    // TODO Auto-generated method stub
    vcr.setCounter(c);
  }

}

class VCR {
  protected int counter;

  public void play() {
    System.out.println("재생하기");
  }

  public void stop() {
    System.out.println("재생 멈추기");
  }

  public void reset() {
    counter = 0;
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int c) {
    counter = c;
  }
}

interface IVCR {
  public void play();

  public void stop();

  public void reset();

  public int getCounter();

  public void setCounter(int c);
}
