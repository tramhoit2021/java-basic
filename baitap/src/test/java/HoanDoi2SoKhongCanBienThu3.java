public class HoanDoi2SoKhongCanBienThu3 {
    public static void main(String[] args) {
        double x = 20;
        double y = 40;
        twoNumbers(x, y);
    }
    public static void twoNumbers(double x, double y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x= " + x);
        System.out.println("y= " + y);
    }
}
