package strategy;

public class BigDuck extends Duck {

  public BigDuck() {
    this.speed = "sdafsdf";
  }

  @Override
  public void walk() {
    System.out.println("BigDuck walk");
  }

}
