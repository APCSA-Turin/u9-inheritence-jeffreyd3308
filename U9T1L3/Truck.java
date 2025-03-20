package U9T1L3;

public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    public void printInfo() {
      super.printInfo();
      System.out.println("Number of axles: " + axles);
      System.out.println("Has trailer? " + hasTrailer);
    }

    public boolean validateLicensePlate() {
      if (hasTrailer) {
        if (axles > 4) {
          if (getLicensePlate().substring(4).equals("MX")) {
            return true;
          } else {
            return false;
          }
        } else {
          if (getLicensePlate().substring(4).equals("LX")) {
            return true;
          } else {
            return false;
          }
        }
      }
      return true;
    }

    public double calculateTollPrice() {
      double total = 0.0;
      total = getTollFee() * axles;
      if (hasTrailer) {
        return total * 2;
      } else {
        return total;
      }
    }
}
