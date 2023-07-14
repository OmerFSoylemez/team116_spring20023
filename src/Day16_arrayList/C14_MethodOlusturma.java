package Day16_arrayList;

public class C14_MethodOlusturma {

    public static void main(String[] args) {

        // iki sayiyi toplayan ve dondüren bir method

        int a = 12;
        int b = 23;
        System.out.println(ikiSayiToplami(a, b)); //35


    }

    public static int ikiSayiToplami (int a,int b){

        int sonuc =0;

        sonuc=a+b;

        return sonuc;
    }


}
