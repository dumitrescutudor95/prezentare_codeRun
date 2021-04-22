package goodCase;

public class NoFlyStrategy implements FlyingStrategy{

  @Override
  public void fly() {
    System.out.println("This duck can't fly");
  }
}
