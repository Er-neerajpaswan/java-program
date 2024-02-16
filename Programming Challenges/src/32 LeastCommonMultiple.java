import java.util.Scanner;

class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Least ");
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();
        int lcm = lcm(num1, num2);
        System.out.println("LCM of the tow number is: " + lcm);
    }
    public static int lcm(int num1, int num2) {
        int i = 1;
        while (true) {
            int factor = num1 *i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }

    }

}
