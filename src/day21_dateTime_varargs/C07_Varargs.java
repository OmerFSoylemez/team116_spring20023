package day21_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        topla(15,6);// sayilar[]= {15,6}Verilen2elementin toplami:21
        topla(15,20,25);
        topla(10,13,44,33);
        topla(12,44,57,87,15);
        topla(15,6,78,58,45,14,25);
    }
    public static void topla(int...sayilar){

        /*
        java'da int...,String...gibi variable data türünün yanına...konursa
        uzunluğu değişken olan bir array ifade eder
        buna varargs denir (variety of arguments)
         */

        int toplam= 0;

        for (int each: sayilar
        ){
            toplam+= each;
        }

        System.out.println("Verilen"+sayilar.length+"elementin toplami:"+toplam);
    }
}
