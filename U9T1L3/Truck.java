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

    public void printTruck() {
      System.out.println(getLicensePlate() + ", " + getTollFee() + ", " + getPassengers() + ", " + axles + ", " + hasTrailer);
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
}
