package Day09_stringManipulation_forLoop;

public class C11_ForLoopAsalSayi {

    public static void main(String[] args) {

        //verilen bir sayının asal sayı olup olmadığını yazdırın

        int sayi = 91;
        boolean asalMi = true;

        for (int i = 2; i <sayi ; i++) {
            System.out.println("dene"+i);

            if(sayi %i==0) {
                asalMi = false;
                break;
            }
        }
        /*
        Bir loop'un içerisinde loop'un çalışmasını isterseniz
        break; yazabilirsiniz
         */
        if (asalMi) {
            System.out.println("sayi asal");
        } else {
            System.out.println("sayi asal değil");
        }
    }
}
