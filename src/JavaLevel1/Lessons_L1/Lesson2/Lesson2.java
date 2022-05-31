package JavaLevel1.Lessons_L1.Lesson2;

public class Lesson2 {
    public static void main(String[] args) {



        System.out.println(makeCoffeeCup(7));

    }

    /**
     * 1 - Espresso
     * 2 - Americano
     * 3 - Machiato
     *
     * @param type Type of coffee cup
     * @return
     */
    
    static void playFieldGame(){

    }

    static String makeCoffeeCup(int type){
//       if (type == 1) {
//           return "Espresso";
//       }else if (type == 2) {
//            return "Americano";
//       }else if (type == 3) {
//            return "Machiato";
//создание константы        final int val = 5;

        switch (type) {
            case 1: {
                return "Espresso";
            }
            case 2: {
                return "Americano";
            }
            case 3: {
                return "Machiato";
            }
        }

        return "unknown type";
    }
}
