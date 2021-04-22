package gps;

public class Telefon {


  public static void main(String[] args) {
    GPS gps = new GPS(new ByCarStrategy());

    gps.reachDestionation("Militari");

    gps.setDestinationStrategy(new ByFootStrategy());

    gps.reachDestionation("Drumul Taberei");
  }
}
