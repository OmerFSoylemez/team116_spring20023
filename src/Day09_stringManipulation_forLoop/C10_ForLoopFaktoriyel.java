package Day09_stringManipulation_forLoop;

public class C10_ForLoopFaktoriyel {

    public static void main(String[] args) {

        // verilen bir sayının faktoriyel değerini bulun
        // 5!= 5*4*3*2*1=120

        int sayi = 7;
        int faktoryel= 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *= i;


        }

        System.out.println(faktoryel);

        //sonucu 5! = 5*4*3*2*1= 120 şeklinde yazdırın

        String sonuc = sayi+" ! = ";
        System.out.print(sonuc);
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i;
            if (i != 1){
                System.out.print(i+" * ");
            }else{
                System.out.print("1 = ");
            }
        }
        System.out.println(faktoryel);


    }
}
