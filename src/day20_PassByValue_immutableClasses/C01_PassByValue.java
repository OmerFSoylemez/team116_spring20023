package day20_PassByValue_immutableClasses;

public class C01_PassByValue {

    public static void main(String[] args) {

        int sayi = 20;

        sayi= method2(sayi);

        System.out.println("Method2 call sonrasında sayi:"+sayi);

        System.out.println("Method call sonucu: "+method1(sayi));

        System.out.println("Method call sonrası sayi:"+sayi);

    }


    public static int method2(int sayi){

        sayi = 25;
        System.out.println("Method içinde dayi: "+ sayi);

        return sayi;
    }

    public static int method1(int sayi){

        sayi = 25;
        System.out.println("Method içinde dayi: "+ sayi);

        return sayi;
    }






}
