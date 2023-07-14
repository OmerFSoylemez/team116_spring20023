package Day10_nestedForLoop_methodolusturma;

public class C09_FaktoryelDegeriYazdırma {
    public static void main(String[] args) {

        // verdiğimiz bir sayının faktöriyel değerini yazdıran
        // bir method oluşturun


        faktoryelDegeriYazdır(5);

        faktoryelDegeriYazdır(7);

    }
    public static void faktoryelDegeriYazdır(int sayi){

        int faktoryel = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *= i;

        }
        System.out.println(sayi+"! = "+faktoryel);
    }


}
