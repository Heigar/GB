package JavaLevel1.HomeWorks_L1.HomeWork6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.run = random.nextInt(201);
        this.type = "кот";
        this.jump = random.nextDouble() * 2;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }
}
