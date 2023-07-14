package day29_exceptions;

import java.util.Scanner;

public class C05_MultipleException {
    /*
    Eger birden fazla exception oluşma ihtimali varsa
    ve bu exceptionlar arasında parent-child ilişkisi yoksa
    3 farklı yaklaşım kullanabiliriz

    1-iki farklı exception ihtimali için 2 farklı try-catch oluşturabiliriz
    2-bir try 2 catch blogu oluşturabiliriz
    3-2 exception i kapsayan tek bir exception varsa onu kullanarak 1 try-1 catch ile sorunu çözeriz

     */

    public static void main(String[] args) {
        //Elinizde input olarak verilmiş bir String ve sayılardan oluşan bir array var

        String str = "Java herseyi duşunmüş" ;
        int [] sayılar = {2,4,6,7,8,9,1,3,4,2,6,3,7,4};

        //Kullanıcıdan 0 veya pozitif bir tamsayı isteyin
        //verilen tamsayıyı index olarak kullanıp
        //String ve Arrayden o index deki harf ve sayıyı yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen index olarak pozitif bir tamsayı giriniz");
        //kullanıcı düzgün tamsayı girecek kabıul edelim.
        int index = scanner.nextInt();

        //"1.Yöntem
        // iki farklı exception ihtimali için 2 farklı try-catch oluşturabiliriz
        // 1 try birden fazla catch olduğunda
        // bir catch çalışınca otekilere bakmaz(if-else if-else gibi)

        /*
        System.out.print("istenen index deki değerler : ");

        try {
            System.out.println(str.charAt(index));

        } catch (StringIndexOutOfBoundsException e) {

            System.out.print("Verilen index String sınırların dışında ");
        }

        try {
            System.out.println(sayılar[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Verilen index array sınırları dışında ");
        }
         */
        // 2.yöntem
        // bir try 2 catch blogu oluşturabiliriz

        /*
        try {
            System.out.print("istenen index deki değerler : "+ str.charAt(index)+ sayılar[index]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Verilen index String in sınırları dışında");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Verilen index Array in sınırları dışında");
        }
         */

        //3.Yöntem
        //2 exception i kapsayan tek bir exception varsa onu kullanarak 1 try-1 catch ile sorunu çözeriz
        //Bu çözümde detaya bakmadığımız için
        //iki exception da kapsayacak genel bir açıklama yazabiliriz

        try {
            System.out.print("istenen index deki değerler : "+ str.charAt(index)+ sayılar[index]);
        } catch (Exception e) {
            System.out.println("Verilen index input'un sınırları dışında");
        }
    }
    }

