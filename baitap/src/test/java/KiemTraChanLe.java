import java.util.Scanner;
public class KiemTraChanLe {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Kiem tra chan le");
        System.out.println("Nhap n =  ");
        int n = input.nextInt();
        if(n%2 == 0){
            System.out.println("N = " +n +" La so chan");
        }else{
            System.out.println("N = " +n +" La so le");
        }
    }
}
