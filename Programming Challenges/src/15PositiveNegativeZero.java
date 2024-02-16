import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Number checker\n");
        System.out.println("Please enter your Number");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Your number is positive");
        } else if (num == 0) {
            System.out.println("Your number is zero ");
        } else {
            System.out.println("Your Number is Negative");
        }
    }
}
