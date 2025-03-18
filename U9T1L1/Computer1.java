public class Computer1 extends Device {
    private boolean touchscreen;

    public Computer1(String name, int storage, boolean touchscreen) {
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
