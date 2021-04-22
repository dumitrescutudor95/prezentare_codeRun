package goodCase;

public class Garden {


  public static void main(String[] args) {
    Duck domesticDuck = new Duck(new FlyingLowStrategy());
    Duck wildDuck = new Duck(new FlyingHighStrategy());
    Duck mallardDuck = new Duck(new FlyingHighStrategy());
    Duck rubberDuck = new Duck(new NoFlyStrategy());

    domesticDuck.fly();
    wildDuck.fly();
    mallardDuck.fly();
    rubberDuck.fly();

    rubberDuck.setFlyingStrategy(new FlyingLowStrategy());
    rubberDuck.fly();


  }
}
