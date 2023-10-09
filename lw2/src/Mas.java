import java.util.Arrays;
import java.util.Random;

public class Mas {
    public static final int M = 4;
    public static final int N = 3;

    public static void main(String[] args) {
        final int from = 20;
        final int to = 30;
        boolean isAsc = false;
        int[][] arr = new int[M][];

        //1
    /*    initializeIntArray(arr, from, to);
        showIntArray(arr);

        String[] lines = new String[M];

        int[] maxes = getMaxesInArrayRows(arr);
        System.out.println("maxes in each row:");
        showIntArray(maxes);

        initializeStrArray(lines, maxes);
        showStrArray(lines);


        System.out.println("sorted: ");
        sort(lines, isAsc);
        showStrArray(lines);*/

        //2
        Random random = new Random();
        Arrays.setAll(arr, i -> fillRow(random, N, from, to));
        System.out.println(Arrays.deepToString(arr));

        int[] maxes = new int[M];
        Arrays.setAll(maxes, i -> getMaxInRow(arr, i));
        System.out.println("maxes in each row:");
        System.out.println(Arrays.toString(maxes));

        String[] lines = new String[M];
        fillStrArray(lines, maxes);
        System.out.println(Arrays.toString(lines));

        sort(lines, isAsc);
        System.out.println("sorted:");
        System.out.println(Arrays.toString(lines));
    }


    //1) methods
    public static void initializeStrArray(String[] lines, int[] maxes){
        Random random = new Random();
        for (int i = 0; i < lines.length; i++) {
            char randomChar = (char)(random.nextInt(26) + 'a');
            lines[i] = Character.toString(randomChar).repeat(maxes[i]);
        }
    }

    static void initializeIntArray(int[][] numbers, int from, int to){
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new int[N];
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] =  Math.abs(random.nextInt() % (to - from)) + from;
            }
        }
    }

    public static void showIntArray(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length - 1; j++) {
                System.out.printf("%d, ", arr[i][j]);
            }
            System.out.printf("%d]", arr[i][arr[i].length - 1]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.printf("]\n");
    }

    public static void showIntArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.printf("%d]\n", arr[arr.length - 1]);
    }

    public static void showStrArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%s, ", arr[i]);
        }
        System.out.printf("%s]\n", arr[arr.length - 1]);
    }

    public static int[] getMaxesInArrayRows(int[][] arr){
        int[] maxes = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 0; j < arr[i].length - 1; j++) {
                int temp = Math.max(arr[i][j], arr[i][j+1]);
                if (temp > max)
                    max = temp;
            }
            maxes[i] = max;
        }
        return maxes;
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


    //2) methods
    public static void fillStrArray(String[] lines, int[] maxes){
        Random random = new Random();
        Arrays.setAll(lines, i -> {
            char randomChar = (char)(random.nextInt(26) + 'a');
            return Character.toString(randomChar).repeat(maxes[i]);
        });
    }

    public static int[] fillRow(Random random, int size, int from, int to) {
        int[] result = new int[size];
        Arrays.setAll(result, j -> Math.abs(random.nextInt() % (to - from)) + from);
        return result;
    }

    public static int getMaxInRow(int[][] arr, int j){
        int[] row = new int[arr[j].length];
        Arrays.setAll(row, i -> arr[j][i]);
        Arrays.sort(row);
        return row[row.length - 1];
    }
}
