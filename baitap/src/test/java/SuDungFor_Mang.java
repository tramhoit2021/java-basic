public class SuDungFor_Mang {
    public static void main(String[] args)
    {
        int[] arrNumbers = new int[]{2, 4, 6, 8, 10};
        System.out.println("Mảng đã cho: ");
        for(int a = 0; a < arrNumbers.length; a++)
        {
            System.out.print(arrNumbers[a] + " ");
        }
        System.out.println("Mảng đảo ngược: ");
        for(int a = arrNumbers.length - 1; a >= 0; a--)
        {
            System.out.print(arrNumbers[a] + " ");
        }
    }

}
