import java.util.Scanner;
public class SoAmHaySoDuong {
    public static void main(String[] args)
    {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào số mà bạn muốn kiểm tra:");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(number+" là số dương!!");
        }
        else if(number < 0)
        {
            System.out.println(number+" là số âm!!");
        }
        else
        {
            System.out.println(number+" không phải là số âm cũng không phải số dương!!");
        }
    }
}