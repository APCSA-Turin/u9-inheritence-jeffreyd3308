public class Device {
    private String name;
    private int storage;

    public Device(String name, int storage) {
        this.name = name;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public int getStorage() {
        return storage;
    }

    public void shutOff() {
        System.out.println("device shutting off");
    }

    public void charge() {
        System.out.println("charging device");
    }
}
