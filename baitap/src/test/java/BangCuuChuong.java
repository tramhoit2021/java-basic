import java.util.Scanner;

public class BangCuuChuong {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nc = new Scanner(System.in);
        System.out.println("nhap vao so cua ban cuu chuong VD: ban cuu chuong 2 thi nhap 2:");
        System.out.println("nhap vao 1 so:");
        int i = nc.nextInt();
        int num = 1;
        while (num <= 10) {
            System.out.printf("\n " + i + " * %d    = %d", num, (i * num));
            num++;
        }
    }
}


