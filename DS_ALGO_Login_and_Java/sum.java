import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // call the function
        System.out.println(greetings());
        System.out.println(sum_result());
        int ans = sum3(5, 6);
        System.out.print(ans);

    }

    // pass the value of numbers when you are calling the mathod in main()

    static int sum3(int a, int b) {
        int sum = a+b;
        return sum;
    }

    static int sum_result() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum = "+ sum);
        return sum;
    }
    static String greetings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String val = sc.nextLine();
        return val;
    }

    /*
        return_type name() {
            body
            return statement;
        }
    */
}
