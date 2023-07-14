package Day19_staticKeyword_passByVolue;

public class C06_PassByValue {

    public static void main(String[] args) {
        double fiyat = 200;

        //verilen fiyattan %10 indirim yapıp
        //yeni fiyatı bize döndüren bir method oluşturun

        //sadece indirimli fiyatı yazdırmak istersem
        System.out.println(indirimYap10(fiyat)); //180

        System.out.println("İndirimli fiyat yazdırıldıktan sonra:" + fiyat);//200.0

        // indirimli fiyatı kalıcı hale getirmek istersem
        // main method içinde atama yapmalıyım

        fiyat = indirimYap10(fiyat);
        System.out.println("indirimli fiyat kaydettikten sonra:" + fiyat);//200.0

    }

    public static double indirimYap10(double fiyat){

        fiyat = fiyat*90/100;

        return fiyat;
    }




}

