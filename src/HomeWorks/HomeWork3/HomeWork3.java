package HomeWorks.HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            int number = random.nextInt(10);
            System.out.println("Guess a number from 0 to 9 in three tries");
            for (int i = 0; i < 3; i++) {
                System.out.println("input number");
                int input_number = scanner.nextInt();
                if (number == input_number){
                    System.out.println("You guessed the number.");
                    break;
                }
                System.out.println(input_number > number ? "The entered number is greater than" :
                        "Entered number is less than");
                System.out.println((i+1) < 3 ? "you used " + (i+1) + " attempts" : " There are no more attempts, you lost");
            }
            System.out.println("Repeat again? 1 - yes 0 - no");
        }
        while (scanner.nextInt() == 1);
    }
}
