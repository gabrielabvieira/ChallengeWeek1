public class Student {
    private String name;
    private int numProblems;

    public Student (String name, int numProblems) {
        this.name = name;
        this.numProblems = numProblems;
    }
    public String getName() {
        return name;
    }

    public int getNumProblems() {
        return numProblems;
    }
}