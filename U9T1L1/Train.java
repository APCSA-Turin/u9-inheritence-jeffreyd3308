public class Train extends Vehicle {
    private int cabs;

    public Train(String name, int wheels, int cabs) {
        super(name, wheels);
        this.cabs = cabs;
    }

    public int getCabs() {
        return cabs;
    }

    public void closeDoors() {
        System.out.println("beware of the closing doors");
    }
}
