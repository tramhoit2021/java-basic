import java.util.Scanner;

public class DoiChuThuongThanhHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập vào chuỗi in HOA: ");
        message = sc.nextLine();
        System.out.println("Chuỗi sau khi chuyển đổi: ");
        System.out.println(message.toLowerCase());
    }
}
