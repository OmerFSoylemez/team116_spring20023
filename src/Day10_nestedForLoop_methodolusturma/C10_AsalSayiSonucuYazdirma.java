package Day10_nestedForLoop_methodolusturma;

public class C10_AsalSayiSonucuYazdirma {

    public static void main(String[] args) {
        // verilen sayinin asal sayi olup olmadığını yazdıran bir method oluşturun

        asalSayiMiYazdır(37);
        asalSayiMiYazdır(79);
        asalSayiMiYazdır(234567);

    }

    public static void asalSayiMiYazdır (int sayi){

        boolean asalMi = true;

        for (int i = 2; i <sayi ; i++) {
            System.out.println("dene"+i);

            if(sayi% i==0){
                asalMi=false;
                break;
            }

        }


        if (asalMi){
            System.out.println("sayi asal");

        }else{
            System.out.println("sayi asal değil");
        }
    }

}
