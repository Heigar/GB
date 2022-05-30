package Lessons.Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Lesson1");

        // primitive types
        // int,float,boolean,double...
        int value1 = 1;
        double value2 = 2d;
        float value3 = 10f;
        boolean value4 = true;
        byte value5 = 127;
        char value6 = 'd';


        // reference types
        // string, object, class

        String str = "hello";

        cleanUpCoffeeMachine();
        String coffeeCup = makeCoffeeCup();
        System.out.println("Coffee is ready " + coffeeCup);
        String americano = makeCoffeeCup2(2);
        System.out.println("Coffee is ready " + americano);
    }

    static void cleanUpCoffeeMachine(){
        System.out.println("Cleaning up the coffee machine");
    }

    static String makeCoffeeCup2(int type) {
        if (type == 1) {
            return "Espresso";
        } else if (type == 2) {
            return "Americano";
        } else {
            return "Unknow";
        }
    }

    static String makeCoffeeCup() {
        return "Espresso";
    }



}
