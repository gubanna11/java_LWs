package extra;

import java.util.Arrays;
import java.util.Scanner;

public class MasSort {

    private static Scanner scanner = new Scanner(System.in);;

    public static void main(String[] args){
        System.out.print("size >> ");
        int n = scanner.nextInt();

        int[] mas = new int[n];

        initializeIntArray(mas);
        System.out.println(Arrays.toString(mas));

        sort(mas);
        System.out.println(Arrays.toString(mas));
/*
        scanner.nextLine();
        String[] lines = new String[n];
        initializeStrArray(lines);

        System.out.println(Arrays.toString(lines));

        boolean isAsc = false;
        sort(lines, isAsc);
        System.out.println(Arrays.toString(lines));*/
    }

    public static void initializeStrArray(String[] mas){
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("mas[%d] >> ", i);
            mas[i] = scanner.nextLine();
        }
    }

    public static void sort(String[] lines, boolean isAsc) {
        boolean mustSort;
        do {
            mustSort = false;
            for (int i = 0; i < lines.length - 1; i++) {
                if (isAsc ?
                        lines[i].compareTo(lines[i + 1]) > 0 :
                        lines[i].compareTo(lines[i + 1]) < 0) {
                    String temp = lines[i];
                    lines[i] = lines[i + 1];
                    lines[i + 1] = temp;
                    mustSort = true;
                }
            }
        }
        while (mustSort);
    }

    public static void initializeIntArray(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("mas[%d] >> ", i);
            mas[i] = scanner.nextInt();
        }
    }

    public static void sort(int[] mas){
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - i - 1; j++) {
                if(mas[j] > mas[j + 1]){
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }
    }
}
