import java.util.Scanner;
public class LonNhoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("\n\nNhập số lượng phần tử cho mảng: ");
        n = sc.nextInt();
        int numberArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhập phần tử thứ " + i + ": ");
            numberArr[i] = sc.nextInt();
        }
        System.out.println("Các phần tử trong mảng là: ");
        for (int i : numberArr) {
            System.out.print(i + ", ");
        }
        int max = numberArr[0];
            for (int num : numberArr) {
            if (max < num)
                max = num;
        }
        System.out.printf("\nSố lớn nhất trong mảng là: %d", max);

        int min = numberArr[0];
            for (int num : numberArr) {
            if (min > num)
                min = num;
        }
        System.out.printf("\nSố nhỏ nhất trong mảng là: %d", min);
        System.out.println("\n----------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}


