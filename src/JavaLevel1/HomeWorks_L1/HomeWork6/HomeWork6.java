package JavaLevel1.HomeWorks_L1.HomeWork6;

public class HomeWork6 {
    public static void main(String[] args) {
        Dog dog = new Dog("Лакки");
        Cat cat = new Cat("Лёня");

        dog.watchInfo();
        cat.watchInfo();

        System.out.println("______________________");

        dog.run(dog.run);
        dog.swim(dog.swim);
        dog.jump(dog.jump);

        System.out.println("______________________");

        cat.run(cat.run);
        cat.swim(cat.swim);
        cat.jump(cat.jump);


    }
}
