import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int num = enterNumber();
        num = reverse(num);
        print(num);

        num = reverse2(num);
        print(num);
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        return reverse;
    }

    public static int reverse2(int number) {
        int reverse = 0;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }

        return reverse;
    }

    public static void print(int reverse) {
        System.out.println("The reverse of the given number is: " + reverse);
    }

    public static int enterNumber() {
        int n = 0;
        Scanner s = null;
        System.out.print("Enter Number:");
        try {
            s = new Scanner(System.in);
            n = s.nextInt();
        } catch (Exception ex) {
            System.err.println(ex.toString());
            n = 0;
        }
        return n;
    }
}
