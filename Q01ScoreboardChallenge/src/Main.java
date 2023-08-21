import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int instance = 1;

        while (scanner.hasNext()) {
            int numInstances = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Instance " + instance);

            ArrayList<Student> students = new ArrayList<>();

            for (int i = 0; i < numInstances; i++) {
                System.out.print("Student's name " + (i + 1) + "; number of problems solved: ");
                String input = scanner.nextLine();
                String[] parts = input.split(" ");
                String name = parts[0];
                int numProblemsPerStudent = Integer.parseInt(parts[1]);

                Student student = new Student(name, numProblemsPerStudent);
                students.add(student);
            }

            students.sort((a, b) -> {
                if (a.getNumProblems() != b.getNumProblems()) {
                    return Integer.compare(a.getNumProblems(), b.getNumProblems());
                } else {
                    return b.getName().compareTo(a.getName());
                }
            });

            Student failingStudent = students.get(0);

            System.out.println("Instance " + instance);
            System.out.println(failingStudent.getName());

            instance++;
            System.out.println();
        }

        scanner.close();
    }
}