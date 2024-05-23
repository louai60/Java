package Week_1.Day_3.ZooKeeper;

public class Gorilla extends Mammal {

    public Gorilla() {
        super();
    }

    public void throwSomething() {
        this.energyLevel -= 5;
        System.out.println("The gorilla has thrown something. Energy decreased by 5.");
    }

    public void eatBananas() {
        this.energyLevel += 10;
        System.out.println("The gorilla is satisfied after eating bananas. Energy increased by 10.");
    }

    public void climb() {
        this.energyLevel -= 10;
        System.out.println("The gorilla has climbed a tree. Energy decreased by 10.");
    }
}

