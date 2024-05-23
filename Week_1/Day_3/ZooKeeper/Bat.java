package Week_1.Day_3.ZooKeeper;

public class Bat extends Mammal {

    public Bat() {
        this.energyLevel = 300;
    }

    public void fly() {
        this.energyLevel -= 50;
        System.out.println("The bat is airborne. Energy decreased by 50.");
    }

    public void eatHumans() {
        this.energyLevel += 25;
        System.out.println("The bat has eaten a human. Energy increased by 25.");
    }

    public void attackTown() {
        this.energyLevel -= 100;
        System.out.println("The bat is attacking a town. Energy decreased by 100.");
    }
}

