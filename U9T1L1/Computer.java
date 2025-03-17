public class Computer extends Device {
    private boolean touchscreen;

    public Computer(String name, int storage, boolean touchscreen) {
        super(name, storage);
        this.touchscreen = touchscreen;
    }

    public boolean isTouchScreen() {
        return touchscreen;
    }

    public void connectKeyboard() {
        System.out.println("connecting keyboard");
    }

    public void connectMouse() {
        System.out.println("connecting mouse");
    }
}
