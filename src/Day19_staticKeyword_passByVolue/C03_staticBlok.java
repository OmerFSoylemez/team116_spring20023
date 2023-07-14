package Day19_staticKeyword_passByVolue;

public class C03_staticBlok {

    static {
        System.out.println("En üsteki static blok calıştı");
    }

    public static void main(String[] args) {

        System.out.println("main method çalıştı");
    }


    static {
        /*
        Statik bloklar class çalışmaya başlar başlamaz devreye girer.
        tüm diğer kodlardan HATTA main method dan bile önce çalışırlar

        olurda main method çalışmadan önce
        ayarlamamız gereken bazı uyarlamalar varsa
        veya bazı variable lara başlangıç değerini atamak istiyorsak
        static bloklar kullanılabilir

        birden fazla static blok varsa
        yukarıdan aşağıya sıralı olarak çalışırlar
         */

        System.out.println("static blok çalıştı");
    }
    static {
        System.out.println("2 static blok çalıştı");
    }

}
