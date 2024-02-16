import java.util.Scanner;

class Grading {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Grade calculator\n");
         System.out.println("Please enter the percentage: ");
         float percentage = input.nextInt();

         if (percentage >= 90) {
             System.out.println("You have got A");
         } else if (percentage >= 75) {
             System.out.println("Good, You have got B");

         } else if (percentage >= 60) {
             System.out.println("You have got C, Work harder next time");

         } else if (percentage >= 30) {
             System.out.println("You have got d, You seriously need to work hard");

         } else {
             System.out.println("Sorry, You failed the test and got a F88");
         }

     }
}
