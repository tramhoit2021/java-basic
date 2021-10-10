import java.util.Scanner;

public class SoLonNhat3So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("So thu nhat:" +a);
        } else if (b >= c) {
            System.out.println("So thu hai: " +b);
        } else {
            System.out.println("so thu ba: " +c);
        }

    }
}

