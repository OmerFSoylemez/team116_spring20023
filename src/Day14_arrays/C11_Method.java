package Day14_arrays;

public class C11_Method {

    public static void main(String[] args) {

        //toplama methodu
        //iki sayı girişi
        //bir sayı sonucu

        int yazdiricam= toplamamethodu(5,7);
        System.out.println(yazdiricam);
    }

    public static int toplamamethodu (int sayi1, int sayi2) {

        int sonuc;

        sonuc= sayi1+sayi2;

        return sonuc;
    }
}
