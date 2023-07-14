package Day08_StringManipulations;

public class C06_lastIndexOf {
    public static void main(String[] args) {

        String str = "Java çok faydalı";

        System.out.println(str.lastIndexOf("a"));//13

        System.out.println(str.lastIndexOf("a", 10));//10
        System.out.println(str.lastIndexOf("a", 12));//10

        System.out.println(str.indexOf("a")); // 1
        System.out.println(str.lastIndexOf("a"));//13
        System.out.println(str.lastIndexOf("a", 2));//1
        System.out.println(str.lastIndexOf("a", 1));//1

        System.out.println(str.indexOf("o"));       //6
        System.out.println(str.lastIndexOf("o"));  //6

        System.out.println(str.indexOf("çok"));     //5
        System.out.println(str.lastIndexOf("çok"));//5

        System.out.println(str.indexOf('k')); //7
        System.out.println(str.lastIndexOf('k'));//7

        // Verien bir c,mlede istenen bir string için
        // aşağıdaki cümlelerden uygun olanını yazdırın
        // 1-aradığınız kelime cümlede bir kez kullanılmış
        // 2-aradığınız kelime cümlede birden fazla kullanılmış
        // 3-aradız kığınelime cümlede hiç kullanılmamış

        String str1 ="Java cok kolay";
        String str2 = "cok";

        int bastanIndex= str1.indexOf("str2");
        int sondanIndex= str1.lastIndexOf("str2");

        if (bastanIndex==-1){
            System.out.println("aradız kığınelime cümlede hiç kullanılmamış");
        }else if (bastanIndex==sondanIndex) {
            System.out.println("aradığınız kelime cümlede bir kez kullanılmış");
        }else{
            System.out.println("aradığınız kelime cümlede birden fazla kullanılmış");
        }



    }
}
