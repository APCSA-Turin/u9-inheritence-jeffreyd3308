public class Phone extends Device {
    private int battery;

    public Phone(String name, int storage, int battery) {
        super(name, storage);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void call() {
        System.out.println("calling");
    }

    public void text() {
        System.out.println("texting");
    }
}
