public class DeviceRunner {
    public static void main(String[] args) {
        Device myDevice = new Device("device", 30);
        System.out.println(myDevice.getName());
        System.out.println(myDevice.getStorage());
        myDevice.charge();
        myDevice.shutOff();

        Phone myPhone = new Phone("iphone15", 64, 95);
        System.out.println(myPhone.getName());
        System.out.println(myPhone.getStorage());
        System.out.println(myPhone.getBattery());
        myPhone.charge();
        myPhone.shutOff();
        myPhone.call();
        myPhone.text();

        Computer myComputer = new Computer("windows11", 128, false);
        System.out.println(myComputer.getName());
        System.out.println(myComputer.getStorage());
        System.out.println(myComputer.isTouchScreen());
        myComputer.charge();
        myComputer.shutOff();
        myComputer.connectKeyboard();
        myComputer.connectMouse();
    }
}
