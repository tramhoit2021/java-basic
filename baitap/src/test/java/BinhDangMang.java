public class BinhDangMang {
    static void KTBinhdangHaiMang (int[] my_array1, int[] my_array2) {
        boolean BangHoacKhong = true;

        if (my_array1.length == my_array2.length) {
            for (int i = 0; i < my_array1.length; i++) {
                if (my_array1[i] != my_array2[i]) {
                    BangHoacKhong = false;
                }
            }
        } else {
            BangHoacKhong = false;
        }

        if (BangHoacKhong) {
            System.out.println("Hai mảng bằng nhau.");
        } else {
            System.out.println("Hai mảng không bằng nhau.");
        }
    }

    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 9, 11};
        int[] array2 = {2, 5, 7, 8, 11};
        int[] array3 = {2, 5, 7, 9, 11};

        KTBinhdangHaiMang (array1, array2);
        KTBinhdangHaiMang (array1, array3);
    }
}

