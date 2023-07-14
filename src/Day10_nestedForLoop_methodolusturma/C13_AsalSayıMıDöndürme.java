package Day10_nestedForLoop_methodolusturma;

public class C13_AsalSayıMıDöndürme {

    public static void main(String[] args) {

        // Verilen bir sayının asal sayı olup olmadığını
        // true/false olarak döndüren bir method oluşturun

        System.out.println(asalSayiMi(23)); //true

        /*
        Method call sırasında parantez içine yazdığımız değer veya variable lara argument denir
        method () içindeki variable lara parametre denir.

        method un çaışması için
        argument ve parametrelerin sayıları ve data türleriuyumlu olmalıdır.
         */
    }
    
    public static boolean asalSayiMi (int sayi){
        boolean asalMi= true;

        for (int i = 2; i <sayi; i++) {

            if (sayi%i == 0){
                asalMi= false;
                break;
            }
        }
        
       return asalMi;
    }
}
