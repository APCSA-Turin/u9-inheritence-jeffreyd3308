package U9T1L1;

public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----

        Bicycle myBike = new Bicycle("bike", 2, 3);
        System.out.println(myBike.getName());
        System.out.println(myBike.getWheels());
        System.out.println(myBike.getGearCount());
        myBike.move(30);
        myBike.turn();
        myBike.brake();
        myBike.ringBell();

        Train myTrain = new Train("Q", 16, 4); 
        System.out.println(myTrain.getName());
        System.out.println(myTrain.getWheels());
        System.out.println(myTrain.getCabs());
        myTrain.move(30);
        myTrain.turn();
        myTrain.brake();
        myTrain.closeDoors();
    }
}