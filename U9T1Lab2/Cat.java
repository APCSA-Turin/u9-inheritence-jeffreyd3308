public class Cat extends Animal {
    private boolean hasPlayedWith;
    private int scratchVictims;

    public Cat(String name, int age, boolean vaccinated, int weight, boolean hasPlayedWith, int scratchVictims) {
        super(name, age, vaccinated, weight);
        this.hasPlayedWith = hasPlayedWith;
        this.scratchVictims = scratchVictims;
    }

    public boolean hasPlayedWith() {
        return hasPlayedWith;
    }

    public int getScratchVictims() {
        return scratchVictims;
    }

    public void play() {
        hasPlayedWith = true;
        System.out.println(getName() + " is being played with");
    }

    public void scratch() {
        scratchVictims++;
        System.out.println(getName() + " has scratched someone");
    }
}
