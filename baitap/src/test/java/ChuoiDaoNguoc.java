public class ChuoiDaoNguoc {
    public static void main(String[] args) {
        String Ch = "abcdef";
        String Dao = new StringBuffer(Ch).
                reverse().toString();
        System.out.println("\nChuỗi trước khi đảo: " + Ch);
        System.out.println("Chuỗi sau khi đảo ngược: " + Dao);
    }
}


