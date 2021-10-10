public class HoanDoi2Chuoi {
    public static void main(String[] args) {
        String s1 = "abcd";

        String s2 = "helo";

        display("Truoc khi hoan doi :", s1, s2);

        s1 = s1 + s2;

        s2 = s1.substring(0, s1.length() - s2.length());

        s1 = s1.substring(s2.length());

        display("Sau khi hoan doi :", s1, s2);
    }

    private static final void display(String str, String s1, String s2) {
        System.out.println(str);
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
    }
}