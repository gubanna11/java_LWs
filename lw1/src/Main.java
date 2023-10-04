//import convert.Convert;
import convert.*;

import java.util.Scanner;

import static convert.Convert.fromNumToBool;
//import static convert.Convert.*;

public class Main {

    public static final int N = 10;

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.print("from >> ");
        double from = scanner.nextDouble();

        System.out.print("to >> ");
        double to = scanner.nextDouble();

        System.out.print("step >> ");
        double step = scanner.nextDouble();

        if (from < 0 || to < 0 || from >= to || step <= 0){
            System.out.println("Неправильні дані");
            return;
        }
        for (double x = from; x <= to; x += step) {
                System.out.println("x = " + x + "\t y = " + calculate(x));
        }

        //2
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Уведіть n у діапазоні від 1 до 30");
        System.out.print("n >> ");
        int n = scanner.nextInt();
        int k = 8;
        int power = 1;
        if (n <= 0 || n > 30) {
            System.err.println("Неправильне значення n");
        }
        System.out.println("Арифметичне:");
        for (int i = 0; i <= n; i++) {
            System.out.printf(k + " ^ %d = %d\n", i, power);
            power *= k;
        }
        System.out.println("Побітове:");
        for (int i = 0; i <= n; i++) {
            System.out.printf("8 ^ %d = %d\n", i, 1 << (i * 3));
        }*/


        //3
       /*Scanner scanner = new Scanner(System.in);
        System.out.print("x >> ");
        double x = scanner.nextDouble();
        System.out.print("n >> ");
        int n = scanner.nextInt();

        double y = 1;
     label:
        for (int i = 1; i <= n - 1; i++) {
            double sum = 0;
            for (int j = 0; j <= n; j++) {
                if(i == j + x)
                    continue label;

                if(j + x == 0){
                    System.out.println("Помилка! Ділення на 0!");
                    y = 0;
                    break label;
                }

                sum += i / (j + x);
            }
            y *= sum;
        }

        System.out.println("y = " + y);*/


 /*Convert.fromBoolToNum(true);
        fromBoolToNum(true);*/


        //4
       /* boolean b = true;
        int a = 3;
        System.out.println("true = " + Convert.fromBoolToNum(true));
        System.out.println("false = " + Convert.fromBoolToNum(false));
        System.out.println("1 = " + Convert.fromNumToBool(1));
        System.out.println("0 = " + Convert.fromNumToBool(0));
        System.out.println("3 = " + fromNumToBool(3));*/
    }


    public static double calculate(double x){
        return x <= 20 ? formula(x) : -(Math.pow((0.5 * x - 9), 1.0/3 )) + 2 * N + 1;
    }

    private static double formula(double x) {
        double mult = 1;

        for (int i = 1; i <= N; i++) {
            mult *= Math.sin(0.1 * x - 0.3 * i + 1);
        }

        return x + 12 * mult;
    }
}