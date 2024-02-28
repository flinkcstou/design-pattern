package strategy;

public class Main {

  public static void main(String[] args) {

    Duck duck = new BigDuck();

    duck.setFlyBehavior(new HighFLyBehavior());
    duck.performFLy();

    duck.setQuackBehavior(new StrongQuackBehavior());
    duck.performQuack();

    duck.setFlyBehavior(new ReactiveFLyBehavior());
    duck.performFLy();
  }

}
