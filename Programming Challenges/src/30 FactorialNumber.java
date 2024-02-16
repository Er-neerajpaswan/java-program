import java.util.Scanner;

class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        long fact = factorialNumber(num);
        System.out.println("Factorial is: " + fact);
    }

    public static long factorialNumber(int num) {
        if (num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact ;
    }
}
