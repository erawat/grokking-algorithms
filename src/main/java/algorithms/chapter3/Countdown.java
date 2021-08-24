package algorithms.chapter3;

public class Countdown {
  
  public static void main(String[] args) {
    Countdown cd = new Countdown();
    cd.countdown(256);
  }

  public void countdown(int i) {
    System.out.println(i);
    if (i == 0) {
      return;
    }
    countdown(i - 1);
  }
}
