package Day19_staticKeyword_passByVolue;

public class C05_PasByValue {

    public static void main(String[] args) {

        double fiyat = 200;

        // fiyat üzerinden %10 inidrim yapıp, yeni fiyatı yazdıran bir method oluşturun
        indirimYap10(fiyat);

        System.out.println("Indirimli fiyat yazdirildikten sonra:"+fiyat);

    }

    public static void indirimYap10(double aaa){

        aaa = aaa * 90/100;

        System.out.println("%10 indirimli fiyat:"+aaa);
    }


    /*
    method a yazdığımız parametre ismi main method daki variable ile aynı olmak zorunda DEĞİLDİR.
    ama kodun daha anlaşılabilir olması için biz aynı ismi vermeyi TERCİH EDERİZ.
     */






}
