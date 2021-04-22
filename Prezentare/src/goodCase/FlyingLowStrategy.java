package goodCase;

public class FlyingLowStrategy implements FlyingStrategy{

  @Override
  public void fly() {
    System.out.println("This duck is flying low");
  }
}
