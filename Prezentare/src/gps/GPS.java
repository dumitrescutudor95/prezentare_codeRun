package gps;

public class GPS {

  DestinationStrategy destinationStrategy;

  public GPS(DestinationStrategy destinationStrategy) {
    this.destinationStrategy = destinationStrategy;
  }

  public void reachDestionation(String destination){
    this.destinationStrategy.reachDestination(destination);
  }


  public void setDestinationStrategy(DestinationStrategy destinationStrategy) {
    this.destinationStrategy = destinationStrategy;
  }
}
