package day23_encapsulation_inheritance;

public class C07_ChildClass extends C06_Parent {
    public static void main(String[] args) {
        C04_EncapsuleClass objBaskaClass= new C04_EncapsuleClass();
        System.out.println(objBaskaClass.publicStr);

        C07_ChildClass objKendiClass= new C07_ChildClass();
        System.out.println(objKendiClass.strPublic);//Parent class strPublic
        System.out.println(objKendiClass.strDefault);//Parent class strDefault
        System.out.println(objKendiClass.strProtected);//Parent class strProtected
        //System.out.println(objKendiClass.strPrivate);

        objKendiClass.strProtected="Child da atana değer";

        objKendiClass.protectedMethod();//Parent class protected method
        objKendiClass.defaultMethod();//Parent class default method
        objKendiClass.publicMethod();//child class public method



    }

        public void publicMethod(){
            System.out.println("child class public method");
        }

}
    /*
       Java'da child class'lar parent edinir
       Eger bir class'daki tüm özelliklere  otomatik olarak sahip olmak(miras edinmek) isterseniz
       o class'ı extends keyword kullanarak PARENT EDİNEBİLİRSİNİZ

       Baska bir class'dan obje oluşturarak o class'daki class üyelerini kullanmak
       INHERİTANCE değildir.

       Bir child class access modifier gözönünde bulundurularak
       parent class daki tüm özelliklere otomatik olarak sahip olur

            parent class daki
            -private class üyeleri : inherit edilemez
            -default class uyeleri : ancak aynı package içinde isek inherit edilebilir
            -protected class üyeleri: heryerden inherit edilebilir
            -public class üyeleri: her yerden inherit edilebilir.
                                   public olanlar sadece child classlardan değil
                                   tüm class lardan kullanılmaktadır
             parent-child ilişkisi olan class'larda kullanılacak
             en ideal access modifier PROTECTED dır.

             Parent-Child ilişkisi 2 durumda kullanılabilir:
             1- Eger bir projeyi sıfırdan oluşturuyorsanız
                Tasarım aşamasında parent-child class ları düşünüp
                uygulamayı ona göre geliştiririz
                böylece reusability ve kolay maintenance sağlanır
             2- Sonradan bir class oluşturulduğunda
                daha önceden oluşturulmuş bir class daki
                tüm özelliklere sahip olması istenirse
                o class a child yapabiliriz


             -Bir child class parent class'daki tüm özelliklere otomatik olarak sahip olur
             -İsterse parent class daki özelliklerden bazılarını kendisine uyarlar
             -İsterse de parent classlarında olmayan yeni özellikler ekleyebilir.

    */