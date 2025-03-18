public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private int weight;

    public Animal(String name, int age, boolean vaccinated, int weight) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getVaccinatedInfo() {
        return vaccinated;
    }

    public int getWeight() {
        return weight;
    }

    public void adopt() {
        System.out.println(name + " is now adopted");
    }

    public void feed() {
        System.out.println(name + " has just been fed");
    }

    public void vaccinate() {
        vaccinated = true;
        System.out.println(name + " is vaccinated");
    }
}