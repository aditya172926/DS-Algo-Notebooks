import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q: take input of 2 numbers and print the sum
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum = "+ sum);
    }
}