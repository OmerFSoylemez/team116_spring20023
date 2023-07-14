package Day10_nestedForLoop_methodolusturma;

public class C07_MethodOluşturma {
    public static void main(String[] args) {

        //verilen iki sayının toplamını yazdıran bir method oluşrurun

        İkiSayiTopla(5,9);
        İkiSayiTopla(67,56);


    }
    public static void İkiSayiTopla(int sayi1, int sayi2){
        /*
        public: access modifier ==> erişim belirleyici, şimdilik hep public yapalım
        static: özel bir keyword dur,ileride anlatılacak,şimdilik hep statik yapalım
        void  : return type, methodun bana birşey döndürmeyeceğini, sadece yazdıracağını belirtir
        isim  : method un yaptığı iş ile bağlantılı olmalı.
        (parametreler) : method un yapacağı iş için bizim göndermemiz gereken değişkenler.
         */

        System.out.println("iki sayının toplamı :"+(sayi1+sayi2));
    }


}
