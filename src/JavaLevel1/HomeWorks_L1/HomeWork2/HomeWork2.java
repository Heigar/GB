package JavaLevel1.HomeWorks_L1.HomeWork2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("\r\n task 1");
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] == 1 ? 0 : 1;
            System.out.print(array1[i] + " ");

        }
        System.out.println("\r\n __________________________________________");

        System.out.println("\r\n task 2");
        int[] array2 = new int[8];
        for (int i = 1, j = 0; i < array2.length; i++) array2[i] = j += 3;
        for (int x : array2) System.out.print(x + " ");
        System.out.println("\r\n __________________________________________");

        System.out.println("\r\n task 3");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) array3[i] *= 2;
            System.out.print(array3[i] + " ");
        }
        System.out.println("\r\n __________________________________________");

        System.out.println("\r\n task 4");
        int[][] array4 = new int[9][9];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0, j2 = array4[i].length; j < array4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) array4[i][j] = 1;
                System.out.print(array4[i][j] + " ");
            }
            System.out.print("\r\n");
        }


    }
}
