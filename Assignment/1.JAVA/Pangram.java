import java.util.Scanner;
import java.util.Random;

public class Pangram{
    public static boolean isPangram(String str) {
        boolean[] isAlphabetPresent = new boolean[26];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isLowerCaseLetter(c)) {
                int index = c - 'a';
                if (!isAlphabetPresent[index]) {
                    isAlphabetPresent[index] = true;
                    count++;
                }
            }
        }

        return count == 26;
    }

    public static boolean isLowerCaseLetter(char c) {
        return (c >= 'a' && c <= 'z');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }
}

