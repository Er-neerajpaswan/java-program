import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Float Multiplication\n");
        System.out.println("Please enter first decimal number: ");
        double first = input.nextDouble();
        System.out.println("Now, please second number");
        double second = input.nextDouble();

        //double mul = first * second;
        System.out.println("\n Result is: "  + (first + second));
    }
}
