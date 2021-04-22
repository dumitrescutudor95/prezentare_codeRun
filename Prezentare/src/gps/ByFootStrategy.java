package gps;

public class ByFootStrategy implements DestinationStrategy{

  @Override
  public void reachDestination(String destination) {
    System.out.println("To reach " + destination + " by foot, take the route " + Route.ROUTE);

  }
}
