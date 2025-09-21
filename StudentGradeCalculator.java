import java.util.Scanner;

class StudentGradeCalculator {
    private int[] marks;
    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        marks = new int[n];
        System.out.println("Enter marks for each subject (out of 100):");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
    }

    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

 
    public double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    public char calculateGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 75) return 'B';
        else if (average >= 50) return 'C';
        else return 'F';
    }

    public void displayResults() {
        int total = calculateTotal();
        double average = calculateAverage();
        char grade = calculateGrade(average);

        System.out.println("Total Marks = " + total);
        System.out.println("Average Percentage = " + average + "%");
        System.out.println("Grade = " + grade);
    }

    public static void main(String[] args) {
        StudentGradeCalculator calc = new StudentGradeCalculator();
        calc.takeInput();
        calc.displayResults();
    }
}
