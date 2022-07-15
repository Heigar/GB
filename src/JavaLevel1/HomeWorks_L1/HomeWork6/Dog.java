package JavaLevel1.HomeWorks_L1.HomeWork6;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
        this.run = random.nextInt(500);
        this.type = "Собака";
        this.jump = random.nextDouble() * 0.5;
        this.swim = random.nextInt(11);
    }
}
