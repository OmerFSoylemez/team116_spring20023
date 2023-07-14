package day07_switchStatements_StringManibulation;

public class C06_ChartAt_length {
    public static void main(String[] args) {

        String str = "Java gün geçtikçe güzelleşiyor";

        System.out.println(str.charAt(5));//g

        System.out.println(str.charAt(29));//r


        //System.out.println(str.charAt(35));//StringIndexOutOfBoundsException

        //str da toplam kaç karekter var?

        System.out.println(str.length());//30

        //son harfi yazdırın

        int uzunluk = str.length();

        System.out.println(str.charAt(uzunluk-1));//r

        // son harften bir önceki harfi yazdır, sondan ikinci harfi

        System.out.println(str.charAt(uzunluk-2));//o

        //sondan üçüncü harfi yazdırın




    }
}
