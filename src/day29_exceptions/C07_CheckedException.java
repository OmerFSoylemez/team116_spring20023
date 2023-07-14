package day29_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C07_CheckedException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
            java da dosya okuma ve yazmayla ilgiliexception lar
            (IOException ==> Input-Output Exception)
            Compile time'da devreye girip
            bizi uyarır

            Java ile bilgisayarınızdaki bir dosyaya ulaşmak isterseniz
            dosya yoluna ihtiyacınız olur

            Dosya yolunu String olarak kaydettikten sonra
            FileInputStream class'ından oluşturacağımız obje ile
            istediğimiz dosyaya erişebiliriz

            Input -Output işlemi yapmak istediğimizde
            Java ulaşmak istediğimiz dosyanın
            dosya yolunun doğru olduğundan
            yani o konumda bir dosya bulunduğundan
            ve dosyanın kullanılabilir olduğundan emin olmak ister.

            bir checked exception oluştuğunda
            2 şekilde bu kırmızı çizgi giderilir

            1-exception'i try catch ile handle edebilirsiniz
              yani exception oluşsa bile çalışmaya devam etmesini sağlayabilirsiniz

            2-Ben dosya yolundan eminim,
              çalışmaya devam et, exception oluşursa oluşsun
              diyebilirsiniz
              Bunun için method signature'na
              throws FileNotFoundException açıklaması beklenir




         */
            String dosyaYolu = "src/day29_exceptions/deneme.txt";

        FileInputStream fis = new FileInputStream(dosyaYolu);




    }
}
