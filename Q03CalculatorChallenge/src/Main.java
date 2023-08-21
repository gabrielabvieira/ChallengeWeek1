import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/input.txt"));
        int testNumber = 1;

        while (true) {
            int m = scanner.nextInt();
            scanner.nextLine();

            if (m == 0){
                break;
            }
            String expression = scanner.nextLine();
            int result = Expression.evaluateExpression(expression);

            System.out.println("Test " + testNumber);
            System.out.println(result);
            System.out.println();

            testNumber++;
        }
        scanner.close();
    }
}