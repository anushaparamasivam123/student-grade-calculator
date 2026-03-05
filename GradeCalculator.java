import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Getting input
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int totalMarks = 0;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = sc.nextInt();
            
            // Validating marks
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0-100.");
                i--; // Retry same subject
                continue;
            }
            totalMarks += marks;
        }

        // 2. Calculations
        double averagePercentage = (double) totalMarks / numSubjects;

        // 3. Grade Calculation (Using simple If-Else)
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // 4. Displaying Results
        System.out.println("\n---------- RESULTS ----------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade Assigned: " + grade);
        System.out.println("-----------------------------");

        sc.close();
    }
}