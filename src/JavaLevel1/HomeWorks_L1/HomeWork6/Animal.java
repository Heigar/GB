package JavaLevel1.HomeWorks_L1.HomeWork6;

import java.util.Random;

public class Animal {

    protected String name;
    protected String type;
    protected int run;
    protected int swim;
    protected double jump;

    public Random random = new Random();

    public Animal(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (run <= distance) {
            System.out.println(type + " " + name + " не может бегать так далеко");
        }else System.out.println(type + " " + name + " пробежал " + distance);
    }

    public void swim(int distance) {
        if (run <= distance) {
            System.out.println(type + " " + name + " не может плавать так далеко");
        }else System.out.println(type + " " + name + " проплыл " + distance);
    }

    public void jump(double distance) {
        if (run <= distance) {
            System.out.println(type + " " + name + " не может прыгать так высоко");
        }else System.out.println(type + " " + name + " прыгнул на " + distance);
    }

    public void watchInfo() {
        System.out.println(type + " " + name + " Пробежал: " + run + " , проплыл " + swim + ", прыгнул на " + jump);
    }
}
