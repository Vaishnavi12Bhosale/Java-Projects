import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Marks obtained in each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();
        int subject5 = scanner.nextInt();

        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / 5;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\nResults for Your Marks:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
