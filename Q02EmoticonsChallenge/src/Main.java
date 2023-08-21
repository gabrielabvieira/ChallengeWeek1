import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String message = scanner.nextLine();
            int funCount = countOccurrences(message, ":-)");
            int upsetCount = countOccurrences(message, ":-(");

            if (funCount == upsetCount) {
                System.out.println("neutral");
            } else if (funCount > upsetCount) {
                System.out.println("fun");
            } else {
                System.out.println("upset");
            }
        }

        scanner.close();
    }

    private static int countOccurrences(String text, String pattern) {
        int count = 0;
        int index = text.indexOf(pattern);

        while (index != -1) {
            count++;
            index = text.indexOf(pattern, index + 1);
        }

        return count;

    }
}
