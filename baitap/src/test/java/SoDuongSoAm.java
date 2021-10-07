import java.util.Scanner;
public class SoDuongSoAm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen:");
        int a = sc.nextInt();
        if (a >=0) {
            System.out.println("Ban vua nhap so duong: " + a);
        } else {
            System.out.println("Ban vua nhap so am: " + a);
        }
    }
}
