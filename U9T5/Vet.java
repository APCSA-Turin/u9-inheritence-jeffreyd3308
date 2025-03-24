package U9T5;
import java.util.ArrayList;

public class Vet {
    private String vetName;
    private ArrayList<Animal> clients;

    public Vet(String vetName) {
        this.vetName = vetName;
        clients = new ArrayList<Animal>();
    }

    public boolean addClient(Animal animal) {
        boolean isIn = false;
        for (Animal animals : clients) {
            if (animals.equals(animal)) {
                isIn = true;
            }
        }
        if (isIn) {
            System.out.println(animal.getName() + " is already a client of " + vetName + ".");
            return false;
        } else {
            System.out.println("Welcome to " + vetName + " office, " + animal.getName() + ".");
            clients.add(animal);
            return true;   
        }
    }

    public void printClientList() {
        for (Animal animal : clients) {
            System.out.println(animal.getName());
            System.out.println(animal.getClass());
        }
    }
}
