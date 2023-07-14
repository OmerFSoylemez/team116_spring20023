package Day08_StringManipulations;

public class C07_isEmpty_isBlank {
    public static void main(String[] args) {

        String str = "Java Candir";

        //str boş mu?
        System.out.println(str.isEmpty()); //false

        //str sadece boşluklardan mı oluşur
        System.out.println(str.isBlank()); //false

        str ="                  ";

        System.out.println(str.isEmpty());// false
        System.out.println(str.isBlank());//true

        str="";

        System.out.println(str.isEmpty()); //true
        System.out.println(str.isBlank()); //true

        System.out.println(str.length()); //0
    }

}
