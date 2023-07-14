package Day08_StringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        /*
        indexOf() methodu arana yazı parçacığının , yazı içerisinde index'ini bize cevap olarak verir.(döndürür)
         */

        String str = "Java en iyisi";

        System.out.println(str.indexOf("e")); //5
        System.out.println(str.indexOf("a")); //1

        System.out.println(str.indexOf("en")); //5
        System.out.println(str.indexOf("yi"));//9
        System.out.println(str.indexOf("iyisi")); //8
        System.out.println(str.indexOf("is")); //10
        System.out.println(str.indexOf("iy"));//8
        System.out.println(str.indexOf("o"));//-1
        System.out.println(str.indexOf("en güzeli"));//-1

        System.out.println(str.indexOf("a")); //1
        System.out.println(str.indexOf("a", 1));//1
        System.out.println(str.indexOf("a", 2));//3
        System.out.println(str.indexOf("i"));//8
        System.out.println(str.indexOf("i", 5));//8
        System.out.println(str.indexOf("i", 11));//12

        //Verilen bir cümlede, istenilen bir string için
        //aşağıdaki cümlelerden uygun olanı yazdırın
        //1-aradığınız kelime cümlede 1 kere kullanışmış
        //2-aradığınız kelime cümlede 2 veya daha fazla kullanılmış.

        //Java en iyisi içerinde "en" kelimesi için
        //str.indexOf("en")

        if (str.indexOf("en")==-1) {
            System.out.println("bu cümlede aradığınız kelime yok");
        }else{
            int birinciKelimeindex =str.indexOf("en");
            if( str.indexOf("en",birinciKelimeindex+1)==-1){
                System.out.println("bu cümlede aradığınız kelime bir tane");
            }else{
                System.out.println("Bu cümlede aradığınız kelimeden birden çok adet var");
            }
        }

    }
}
