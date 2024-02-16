import java.util.Scanner;

class OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome toOdd even Calculator\n");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your number in an even");

        } else{
            System.out.println("Your number is Odd");
        }
    }
}
