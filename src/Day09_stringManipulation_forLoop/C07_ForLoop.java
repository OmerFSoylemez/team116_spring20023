package Day09_stringManipulation_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

        //verilen iki sayi ve aralarındaki tüm tamasayıları toplayıp yazdırın
        //iki sayıdan hangisinin kuçuk olduğu bilinmiyor


        int sayi1 =10;
        int sayi2 =20;
        int toplam= 0;

        if (sayi1<sayi1) {

            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;
            }
        }else {

            for (int i = sayi1; i >=sayi2 ; i--) {
                toplam+=i;

            }

            }
        System.out.println(toplam);
        }


}
