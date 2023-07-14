package Day19_staticKeyword_passByVolue;

public class C04_staticOlmayanBlok {

    public static void main(String[] args) {
        System.out.println("mailn method çalıştı");

        C04_staticOlmayanBlok obj1 = new C04_staticOlmayanBlok();
        C04_staticOlmayanBlok obj2 = new C04_staticOlmayanBlok();
        C04_staticOlmayanBlok obj3 = new C04_staticOlmayanBlok();


    }

    static {
        System.out.println("static blok çalıştı");

    }
    /*
    static olmayan kod bloklari objelere baglıdır.
    her obje oluşturulduğunda statik olmayan blok tekrar çalışır

    static blok ise sadece 1 kere class ilk çalışmaya başladığında çalışır.

    obje oluşturulduğunda constructor içinde yapmak istemediğiniz
    ama obje için ihtiyaç duyduğumuz bir işlem varsa static olmayan blok kullanılabilir.
     */

    {
        System.out.println("static olmayan kod bloğu çalışti");
    }
}

