package day30_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_MultipleExceptions {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/day29_exceptions/deneme.txt");
            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) { //erişim

            System.out.println("Dosya yolu hatalı,dosyaya erişilemedi");

        } catch (IOException e) {//erişim ve okuma

            System.out.println("Dosyaya erişim ve okuma ile ilgili bir hata var");
        }
        /*
            eger patent-child ilişkisi olan
            birden fazla exception turunu try-catch ile handle etmek istersek

            1-iç şçe iki try-catch blogu oluşturabiliriz
            2-eger bir try birden fazla catch bloğu oluşturacaksak
              once child exception için catch bloğu yazmalıyız
              sonra parent exception içinç
              Çünkü parent'dan sonra child yazarsak
              parent'in yakalayamayıp, child ın yakalanacağı
              exception olmayacağından, java child exception ı silmesini ister.
            3-child exception için catch yazmadan
              sadece parent için 1 tane catch bloğu yazmak da yeterli olur.
         */
    }

}