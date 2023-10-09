import java.util.Arrays;
import java.util.Scanner;

public class AlignStr {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("string >> ");
            String text = scanner.nextLine();

            System.out.print("desired length >> ");
            int desiredLength = scanner.nextInt();

            if (text.length() >= desiredLength) {
                System.out.println(text);
                return;
            }

            String[] words = text.split(" ");
            int wordCount = words.length;

            System.out.println("words:\n" + Arrays.toString(words));

            if (wordCount == 1) {
                System.out.println(text);
                return;
            }

            int spacesNeeded = desiredLength - text.length();
            int betweenEach = spacesNeeded / (wordCount - 1);
            int extraSpaces = spacesNeeded % (wordCount - 1);

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < wordCount; i++) {
                if(i == wordCount - 1){
                    result.append(words[i]);
                    break;
                }
                result.append(words[i] + " ");

                if(i == 0 && extraSpaces != 0){
                    result.append(" ".repeat(extraSpaces));
                }

                if(i < spacesNeeded) {
                    result.append(" ".repeat(betweenEach));
                }
            }

            System.out.println("result:\n" + result);
    }
}
