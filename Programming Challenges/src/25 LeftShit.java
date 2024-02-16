import java.util.Scanner;

class LeftShit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LeftShit Operator\n ");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("Result is: " + result);
    }
}
