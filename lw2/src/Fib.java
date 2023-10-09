import java.util.Scanner;
public class Fib {

    public static final int N = 93;
    private static long[] fibNumbers = new long[N + 1];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("index >> ");
            int index = scanner.nextInt();
            if(index < 0)
                break;
            System.out.printf("Fibonacci[%d] = %d\n", index, calculate(index));
        }
        System.out.println("The end");
    }

    public static long calculate(int n){
        if(fibNumbers[n] != 0)
            return fibNumbers[n];
        if(n <= 1)
            fibNumbers[n] = n;
        else
            fibNumbers[n] = calculate(n - 1) + calculate(n - 2);
        return fibNumbers[n];
    }
}
