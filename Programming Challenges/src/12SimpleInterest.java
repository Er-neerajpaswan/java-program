import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator\n");
        System.out.println("Please enter your principle amount Rs");
        int principle = input.nextInt();
        System.out.println("Now, Tell me your rate of interest: ");
        float rate = input.nextFloat();
        System.out.println("Now, tell me for how many years borrowing this money: ");
        float years = input.nextFloat();


         float interest = (principle * rate * years) / 100;
        System.out.println("\n\n Your Simple interest is Rs" + interest);
    }
}
