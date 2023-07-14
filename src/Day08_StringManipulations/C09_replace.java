package Day08_StringManipulations;

public class C09_replace {
    public static void main(String[] args) {

        String str = "Javasiz olmaz";

        System.out.println(str.replace('J', 'H'));// Havasiz olmaz

        System.out.println(str.replace("a", ""));// Jvsiz olmz


        System.out.println(str); // Javasiz olmaz

        // str = str.replace("va","lallala"); //Jalallalasiz olmaz// atama yaparsak orjinal str değişir
        System.out.println(str);


        /*
        atama yapılmadığı sürece değişiklikler sadece o satır için geçerlidir.
        atama yapılana kadar kalıcı olmaz
         */

        String str2 = "Java hayattir";
        System.out.println(str2.replaceFirst("a", "X")); //JXva hayattir



    }
}
