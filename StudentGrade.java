import java.util.Scanner;

public class StudentGrade {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter the student's name: ");
      String studentName = input.nextLine();

      int[] marks = new int[5];
      for (int i = 0; i < marks.length; i++) {
         System.out.print("Enter marks for subject " + (i+1) + ": ");
         marks[i] = input.nextInt();
      }

      double average = calculateAverage(marks);

      String grade = calculateGrade(average);

      System.out.println("Student Name: " + studentName);
      System.out.println("Average Marks: " + average);
      System.out.println("Grade: " + grade);
   }

   public static double calculateAverage(int[] marks) {
      double sum = 0;
      for (int i = 0; i < marks.length; i++) {
         sum += marks[i];
      }
      return sum / marks.length;
   }

   public static String calculateGrade(double average) {
      if (average >= 90) {
         return "A+";
      } else if (average >= 80) {
         return "A";
      } else if (average >= 70) {
         return "B";
      } else if (average >= 60) {
         return "C";
      } else if (average >= 50) {
         return "D";
      } else {
         return "F";
      }
   }
}
