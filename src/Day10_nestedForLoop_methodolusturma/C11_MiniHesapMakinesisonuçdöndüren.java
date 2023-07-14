package Day10_nestedForLoop_methodolusturma;

public class C11_MiniHesapMakinesisonuçdöndüren {
    public static void main(String[] args) {


        // kullanıcının verdiği iki sayı ve
        // sececeği isleme göre
        //sonucu double olarak bize döndüren method oluşturun
        // ornek sayılar 3, 5, islem * olduğunda method 15 döndürmeli


        miniHesapMakinasi(5,4,'+');
        // bize sonuc döndüren metodlarda
        // işlem sonucunu görmek iaterseniz direk yazdırabilir veya
        System.out.println(miniHesapMakinasi(5, 4, '+'));
        // işlem sonucunu kaydedip istediğimizde kullanabiliriz

        double sonuc = miniHesapMakinasi(5,4,'+');



    }

    public static double miniHesapMakinasi(int sayi1, int sayi2, char islemSembolu){

        // islem sembolü olarak +,-,*,/ kullanılabilsin

        double sonuc = 0;

        switch (islemSembolu){
            case '+' :
                sonuc =sayi1 + sayi2;
                break;
            case '-' :
                sonuc =sayi1 - sayi2;
                break;
            case '*' :
                sonuc =sayi1 * sayi2;
                break;
            case '/' :
                sonuc =sayi1 / sayi2;
                break;
            default:
                System.out.println("İşlem sembolü yanlış, sonuç 0 olarak atandı");
        }
        return sonuc;
    }
}
