package JavaLevel1.Lessons_L1.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        play(scanner, random);
    }

    static void play(Scanner scanner, Random random){
        char[][] field = getField();
        drawField(field);

        do {
            doPlayerMove(scanner, field);
            if (isDraw(field)){
                System.out.println("There is draw detected,no one won");
                break;
            }

            if (checkWin(field, 'X')) {
                System.out.println("Player won");
                break;
            }

            doAIMove(random, field);
            if (isDraw(field)){
                System.out.println("There is draw detected,no one won");
                break;
            }

            if (checkWin(field, 'X')) {
                System.out.println("AI won");
                break;
            }
            drawField(field);
        }while(true);

        System.out.println("Final score");
        drawField(field);

    }

    static boolean checkWin(char[][] field, char sign){
        for (int i = 0; i < field.length; i++) {
            if(field[i][0] == sign && field[i][1] == sign &&field[i][2] == sign){
                return true;
            }

        }

        for (int i = 0; i < field.length; i++) {
            if(field[0][i] == sign && field[1][i] == sign &&field[2][i] == sign){
                return true;
            }

        }
        for (int i = 0; i < field.length; i++) {
            if(field[0][0] == sign && field[2][2] == sign &&field[3][3] == sign){
                return true;
            }

        }
        return false;
    }

    static boolean isDraw(char[][] field){
        int count = field.length * field.length;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if(field[i][j] != '-'){
                    count --;
                }
            }
        }
        return count == 0;
    }

    static void doAIMove(Random random, char[][] field){
        int x,y;

        do {
        x = random.nextInt(3);
        y = random.nextInt(3);
        }while (field[x][y] != '-');
        field[x][y] = 'O';
    }

    static void doPlayerMove(Scanner scanner, char[][] field){
        int x,y;
        do {
            x = convertCoordinateToIndex(scanner, 'x');
            y = convertCoordinateToIndex(scanner, 'y');
        }while (field[x][y] != '-');
        field[x][y] = 'X';
    }

    static int convertCoordinateToIndex(Scanner scanner, char coordName){
        int coord;
        do {
            System.out.println(String.format("Please enter %s coordinate in range [1, 3]", coordName));
            coord = scanner.nextInt()-1;
        }while (coord < 0 || coord > 2);
        return coord;
    }

    static char[][] getField(){
       return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
