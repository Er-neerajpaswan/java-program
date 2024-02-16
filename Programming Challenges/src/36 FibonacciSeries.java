import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the fibonacci series");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacci Series: ");
        fib(num);
    }
    public static void fib(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third +" ");
            first = second;
            second = third;

        }
    }
}
