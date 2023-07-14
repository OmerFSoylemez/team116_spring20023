package day22_stringBuilder_acceessModifier;

public class C06_accessModifierKullanım {

    public static void main(String[] args) {

        //başka class daki static class üyelerinden
        //private olmayanlara direk class ismi ile ulaşabiliriz
        System.out.println(C05_accessModifier.defaultStaticSayi);
        C05_accessModifier.defaultStaticMethod();

        //aynı package içinde başka class'daki static olmayan class üyelerinden
        //private olanlar hariç tamamına obje ile erişebiliriz

        C05_accessModifier obj= new C05_accessModifier();
        System.out.println(obj.defaultStr);
        obj.protectedMethod();


    }

    void baskaClassdanKullanımMethodu(){

        System.out.println(C05_accessModifier.publicStaticSayi);
        C05_accessModifier obj = new C05_accessModifier();
        System.out.println(obj.defaultStr);;
        obj.protectedMethod();


    }
}
