import java.util.Scanner;

class GreatestThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Greatest of three number Calculator\n");
        System.out.println("Please enter you first number: ");
        int first = input.nextInt();
        System.out.println("Now enter your second number: ");
        int second = input.nextInt();
        System.out.println("Finally enter your four number: ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first + "is the greatest number");
        } else if (second >= first && second >= third) {
            System.out.println(second + "is the greatest number");
        } else {
            System.out.println(third + "is the greatest number");
        }

    }
}
