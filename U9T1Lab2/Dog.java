public class Dog extends Animal {
    private boolean hasBeenWalked;
    private int walkingAmount;

    public Dog(String name, int age, boolean vaccinated, int weight, boolean hasBeenWalked, int walkingAmount) {
        super(name, age, vaccinated, weight);
        this.hasBeenWalked = hasBeenWalked;
        this.walkingAmount = walkingAmount;
    }

    public boolean hasBeenWalked() {
        return hasBeenWalked;
    }

    public int getWalkingAmount() {
        return walkingAmount;
    }

    public void walk() {
        walkingAmount++;
        hasBeenWalked = true;
        System.out.println(getName() + " is walking");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching");
    }
}
