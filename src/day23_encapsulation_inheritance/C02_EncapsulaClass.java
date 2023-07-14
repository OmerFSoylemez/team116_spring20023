package day23_encapsulation_inheritance;

public class C02_EncapsulaClass {

    private int satısTutari;
    private int toplamsatistutari;
    String strDefault;
    protected String strProtected;
    public String strPublic;

    //burau-ya private class üyesinei
    //read ve write yetkisi olan
    //2 farklı method oluşturalım

    //satış tutarı başka class dan write edilebilsin

    public void setSatısTutari(int satısTutari) {
        this.satısTutari = satısTutari;
        toplamsatistutari+=satısTutari;
    }

    //satış tutarı başka class dan read edilebilsin


    public int getToplamsatistutari() {
        return toplamsatistutari;
    }
}
