package Arrays;

import java.util.Scanner;

public class DoiChuHoaThanhThuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập vào chuỗi in thường: ");
        message = sc.nextLine();

        char[] charArray = message.toCharArray();
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }

        message = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: \n" + message);

    }
}

