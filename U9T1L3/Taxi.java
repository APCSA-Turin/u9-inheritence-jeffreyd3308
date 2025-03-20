package U9T1L3;

public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Fare collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider;
        if (getPassengers() >= 4) {
            if (!isDiscountApplied()) {
                setTollFee(getTollFee() * 0.5);
                setDiscountApplied();
            }
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareCollected += farePerRider * (getPassengers() - 1);
        return super.dropOffPassengers(getPassengers() - 1);
    }

    public void paintVehicle() {
        System.out.println("Taxi must be yellow or green");
    }
}
