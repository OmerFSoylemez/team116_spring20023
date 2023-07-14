package day07_switchStatements_StringManibulation;

public class C10_Substring {
    public static void main(String[] args) {

        String str = "Java Candir";

        // sadece Candir yazdırmak istersen

        System.out.println(str.substring(5));// Candir

        System.out.println(str.substring(2));// va Candir

        System.out.println(str.substring(10));// r

        System.out.println(str.substring(11));// boş satır

        // System.out.println(str.substring(12));// StringIndexOutOfBoundsException

        // Sadece Java kısmını yazdırın.

        System.out.println(str.substring(0,4)); //Java

        // Javada başlangıç ve bitiş indexleri verildiğinde
        // Genellikle başlangıç index i dahil(inclusive)
        // bitis index ı hariç(exclusive) olur

        System.out.println(str.substring(3,4)); //a

        System.out.println(str.substring(1,2)); //a

        // Eger sadece bir harf almak isterseniz substring(harfin indexi,harfin indexi +1)

        System.out.println(str.substring(5,5)); // hiçlik

        // System.out.println(str.substring(8,5)); //StringIndexOutOfBoundsException

        String str2 = "eSRa";
        // ilk harfini büyük kalanları küçük olacak şekilde düzenleyin.

        str2 = str2.substring(0,1).toUpperCase()+str2.substring(1).toLowerCase();
        System.out.println(str2);// Esra


    }
}
