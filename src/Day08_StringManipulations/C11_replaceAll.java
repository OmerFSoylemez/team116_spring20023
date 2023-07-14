package Day08_StringManipulations;

public class C11_replaceAll {
    public static void main(String[] args) {
        String str = "      J23a3345+%v^+%4+%353a 23%&4C%&3543/(45a3()456n345d/(i&/r^+          ";

        //bütün sayıları hiçlik yap
        str= str.replaceAll("\\d","");
        System.out.println(str);

        //baştaki ve sondaki boşlukları sil
        str= str.trim();
        System.out.println(str);

        //boşluğu 5 yap
        str= str.replace(" ","5");
        System.out.println(str);

        //harf ve sayi olan herşeyi sil
        str= str.replaceAll("\\W","");
        System.out.println(str);

        //5 i tekrardan boşluk yap.
        str= str.replace("5"," ");
        System.out.println(str);





    }


}
