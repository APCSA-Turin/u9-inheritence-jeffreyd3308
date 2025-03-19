package U9T1L3;

public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    public void setDiscountApplied() {
      discountApplied = true;
    }

    public void printCar() {
      System.out.println(getLicensePlate() + ", " + getTollFee() + ", " + getPassengers() + ", " + isElectric() + ", " + isDiscountApplied());
    }

    public boolean dropOffPassengers(int numOut) {
      if (numOut >= getPassengers()) {
        return false;
      } else {
        setPassengers(getPassengers() - numOut);
        return true;
      }
    }

    public void applyDiscount() {
      if (!discountApplied) {
        if (electric) {
          setTollFee(getTollFee() * 0.5);
          discountApplied = true;
        }
      }
    }
}
