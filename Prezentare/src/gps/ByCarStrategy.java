package gps;

public class ByCarStrategy  implements DestinationStrategy{

  @Override
  public void reachDestination(String destination) {
    System.out.println("To reach " + destination + " by car, take the route " + Route.ROUTE);
  }
}
