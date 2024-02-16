import java.util.Scanner;

class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Greatest Common Divisor");
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();
        System.out.println("Please enter the second number: ");
        int second = input.nextInt();
        int gcd = gcd(first,second);
        System.out.println("GCD of the number is: " + gcd);
    }

    public static int gcd(int first, int second){
        int gcd = 1;
        int i = 2;
        int least = least(first, second);
        while (i <= least) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;

        }
        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 <num2) {
            return num1;
        }else {
            return num2;
        }
    }
}
