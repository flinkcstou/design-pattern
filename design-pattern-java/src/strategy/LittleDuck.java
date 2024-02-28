package strategy;

public class LittleDuck extends Duck {

  public LittleDuck() {
    this.speed = "asd";
  }

  @Override
  public void walk() {
    System.out.println("LittleDuck walk");
  }

}
