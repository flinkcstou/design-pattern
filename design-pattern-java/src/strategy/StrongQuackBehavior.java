package strategy;

public class StrongQuackBehavior implements IQuackBehavior {

  @Override
  public void quack() {
    System.out.println("String quack behavior");
  }

}
