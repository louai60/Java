package Week_1.Day_3.ZooKeeper;

public class Mammal {
    protected int energyLevel;

    public Mammal() {
        this.energyLevel = 100;
    }

    public int displayEnergy() {
        System.out.println("Energy level: " + this.energyLevel);
        return this.energyLevel;
    }
}

