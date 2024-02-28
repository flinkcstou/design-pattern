package strategy;

public abstract class Duck implements IStrategyDuck {

  protected IFlyBehavior flyBehavior;
  protected IQuackBehavior quackBehavior;
  protected String speed;
  protected String voice;
  protected String race;

  public void walk() {
    System.out.println("Duck walk");
  }

  @Override
  public void setFlyBehavior(IFlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  @Override
  public void setQuackBehavior(IQuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  @Override
  public void performFLy() {
    flyBehavior.fly();
  }

  @Override
  public void performQuack() {
    quackBehavior.quack();
  }

}
