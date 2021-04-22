package gps;

public class ByPublicTransportStrategy  implements DestinationStrategy{

  @Override
  public void reachDestination(String destination) {
    System.out.println("To reach " + destination + " by public transport, take the route " + Route.ROUTE);

  }
}
