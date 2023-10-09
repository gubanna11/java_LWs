package extra;

import java.util.Scanner;

public class StrMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("string >> ");
        String str = scanner.nextLine();

        /*String result = strViceVersa(str);
        System.out.println("result:\n" + result);*/

     /*   String result = strDeleteChar(str, 'a');
        System.out.println("result:\n" + result);*/
    }

    public static String strDeleteChar(String text, char ch){
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != ch)
                strBuilder.append(text.charAt(i));
        }
        return strBuilder.toString();
    }

    public static String strViceVersa(String text){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            stringBuilder.append(text.charAt(i));
        }

        return stringBuilder.toString();
    }
}
