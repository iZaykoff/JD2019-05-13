package by.it.buymistrov.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA {
    private static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-2d ", i, j, i * j);

            }
            System.out.println();
        }
    }

    private static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);

        double first = array[0];
        double last = array[array.length - 1];

        System.out.println();
        Helper.sort(array);
        int indexFirst = Arrays.binarySearch(array, first);
        System.out.println("Index of first element=" + indexFirst);
        int indexLast = Arrays.binarySearch(array, last);
        System.out.println("Index of last element=" + indexLast);


        InOut.printArray(array, "V", 4);


    }


    public static void main(String[] args) {
        printMulTable();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        buildOneDimArray(line);

    }


}