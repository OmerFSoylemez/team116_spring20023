package day22_stringBuilder_acceessModifier;

public class C01_StringBuilder {

    public static void main(String[] args) {

        // StringBuilder sb1 = "Java";
        // non-primitive data türlerindeki bir değeri,
        // farklı data türündeki bir variable'a atayabilmek için aralarında
        // parent-child ilişkisi olmalıdır.

        Object obj1 = "Java";
        Object obj2 = 23;
        Object obj3 = true;

        //3 farklı şekilde StringBuilder oluşturulabilir
        //bu yöntemler arasındaki fark capacity yani hafıza kullanımı ile ilgilidir

        StringBuilder sb2 = new StringBuilder("Java Candir");

        System.out.println(sb2);//Java Candir


        System.out.println(sb2.length());//11
        System.out.println(sb2.capacity());//11+16=27

        sb2.append(", buna inanmayan mı var?");

        System.out.println(sb2);//Java Candir, buna inanmayan mı var?
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//27*2+2=56

        //Eger SB'da kullanılmış kapasiteyi temizlemek,
        //lenght= kapasite yapmak isterseniz

        sb2.trimToSize();

        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//35






    }
}
