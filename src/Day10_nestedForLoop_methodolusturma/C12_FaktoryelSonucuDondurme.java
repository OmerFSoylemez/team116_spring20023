package Day10_nestedForLoop_methodolusturma;

public class C12_FaktoryelSonucuDondurme {

    public static void main(String[] args) {

        //Verilen sayinin faktoryel degerini hesaplayıp
        //sonucu döndüren bir method oluşturun
        System.out.println(faktoryelDegeriDondur(6));

        int yediFaktoryel= faktoryelDegeriDondur(7);

    }

    public static int faktoryelDegeriDondur(int sayi){

        int faktoryel=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *= i;

        }
        return faktoryel;
    }


}
