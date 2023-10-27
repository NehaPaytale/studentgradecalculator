import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.print("Enter the number of assignments: ");
        int numAssignments = scanner.nextInt();
        double totalScore = 0;
        double maxPossibleScore = numAssignments * 100; // Assuming each assignment is out of 100 points
        for (int i = 1; i <= numAssignments; i++) {
            System.out.print("Enter score for Assignment " + i + ": ");
            double assignmentScore = scanner.nextDouble();
            totalScore += assignmentScore;
        }
        double finalPercentage = (totalScore / maxPossibleScore) * 100;
        char letterGrade;
        if (finalPercentage >= 90) {
            letterGrade = 'A';
        } else if (finalPercentage >= 80) {
            letterGrade = 'B';
        } else if (finalPercentage >= 70) {
            letterGrade = 'C';
        } else if (finalPercentage >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println("Final Percentage: " + finalPercentage + "%");
        System.out.println("Letter Grade: " + letterGrade);
        scanner.close();
    }
}
