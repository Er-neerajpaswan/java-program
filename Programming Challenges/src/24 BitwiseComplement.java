import java.util.Scanner;
class BitwiseComplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Showcase of Not/Compliment Operator ");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your Result is: " + result);
    }

}
