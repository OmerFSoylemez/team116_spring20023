package Day09_stringManipulation_forLoop;

public class C09_ForLoop {
    public static void main(String[] args) {

        // verielen bir metindeki
        // büyük harf, kucuk harf ve space sayılarını bulun
        // space sayısını gözonune alarak kaç kelime olduğunu,
        // kaç tane küçük ve büyük harf olduğunu yazdirin

        String str = "Java ogrenen işi kapar.";
        
        int buyukHarfSayisi = 0;
        int kucukHarfSayisi = 0;
        int spaceSayisi = 0;

        for (int index = 0; index < str.length(); index++) {

            char karekter = str.charAt((index));

            if (karekter>= 'a' && karekter<='z'){
                kucukHarfSayisi++;
            } else if (karekter>='A' && karekter<= 'Z') {
                buyukHarfSayisi++;
            } else if (karekter==' ') {
                spaceSayisi++;

            }

        }
        System.out.println("Metindeki kelime sayısı:"+(spaceSayisi+1)+
                "\n kucuk harf sayısı :"+ kucukHarfSayisi+
                "\n BUYUK harf sayısı :"+buyukHarfSayisi);

    }
}
