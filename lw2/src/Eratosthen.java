import java.util.ArrayList;
import java.util.Arrays;

public class Eratosthen {

    public static final int N = 300;

    public static void main(String[] args){
        int[] numbers = new int[N + 1];

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i = 2; i * i < numbers.length; i++) {
            if (numbers[i] > 0) {
                for (int j = i * i; j < numbers.length; j += i) {
                    numbers[j] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

        ArrayList<Integer> primaryNums = new ArrayList<>();

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                primaryNums.add(numbers[i]);
            }
        }

        System.out.println(primaryNums);
    }
}
