package goodCase;

public class Duck {

  FlyingStrategy flyingStrategy;

  public Duck(FlyingStrategy flyingStrategy) {
    this.flyingStrategy = flyingStrategy;
  }


  public void fly(){
    flyingStrategy.fly();
  }

  public void setFlyingStrategy(FlyingStrategy strategy){
    this.flyingStrategy=strategy;
  }
}
