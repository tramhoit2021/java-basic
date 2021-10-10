import java.util.Scanner;

public class SoSanh2chuoi {
    public static void main(String[] args) {
        String chuoi1, chuoi2;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi thứ nhất: ");
        chuoi1 = scanner.nextLine();
        System.out.println("Nhập vào chuỗi thứ hai: ");
        chuoi2 = scanner.nextLine();
        System.out.println("Kết quả so sánh sử dụng hàm compareToIgnoreCase(): ");
        result = chuoi1.compareToIgnoreCase(chuoi2);
        if (result < 0) {
            System.out.println("Chuỗi " + chuoi1 + " nhỏ hơn " + chuoi2);
        } else if (result > 0) {
            System.out.println("Chuỗi " + chuoi1 + " lớn hơn " + chuoi2);
        } else {
            System.out.println("Chuỗi " + chuoi1 + " bằng " + chuoi2);
        }
    }
}
