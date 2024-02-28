package strategy;

public interface IStrategyDuck {

  void setFlyBehavior(IFlyBehavior flyBehavior);

  void performFLy();

  void setQuackBehavior(IQuackBehavior quackBehavior);

  void performQuack();

}
