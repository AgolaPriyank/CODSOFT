import java.util.Scanner;

class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many subject to marks you want enter : ");
        int numberOfSub = sc.nextInt();

        int totalMarks = 0;

        System.out.println();
        System.out.println("Enter your obtained marks out of 100 : ");
        System.out.println("-------------------------------------------------");

        for (int i = 1; i <= numberOfSub; i++) {

            System.out.println(i + ". Enter your marks of subject - " + i + " :");
            int marks = sc.nextInt();

            totalMarks = totalMarks + marks;

        }

        double AveragePercentage = (totalMarks / numberOfSub);

        char grade = 'N';

        if (AveragePercentage <= 100 && AveragePercentage >= 90) {
            grade = 'A';
        }

        else if (AveragePercentage < 90 && AveragePercentage >= 80) {
            grade = 'B';
        }

        else if (AveragePercentage < 80 && AveragePercentage >= 70) {
            grade = 'C';
        }

        else if (AveragePercentage < 70 && AveragePercentage >= 60) {
            grade = 'D';
        }

        else if (AveragePercentage < 60 && AveragePercentage >= 50) {
            grade = 'E';
        }

        else if (AveragePercentage < 50 && AveragePercentage >= 0) {
            grade = 'F';
        }

        else {
            System.out.println("Invalid Average Percentag , Enter marks between 0 to 100");
            System.exit(0);
        }

        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println("-----------Display Results----------");
        System.out.println();
        System.out.println("=> Your achieved total marks = " + totalMarks);
        System.out.println("=> Your achieved Average Percentage = " + AveragePercentage);
        System.out.println("=> You hava achieve the grade : " + grade);
        System.out.println();

    }
}
