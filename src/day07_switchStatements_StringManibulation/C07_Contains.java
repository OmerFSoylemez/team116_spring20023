package day07_switchStatements_StringManibulation;

public class C07_Contains {
    public static void main(String[] args) {

        String str = "Java ogren offer al";

        // str'da a harfi var mı?

        System.out.println(str.contains("a"));// true
        System.out.println(str.contains("x"));// false

        //sadece harfmi aratıyoruz?

        System.out.println(str.contains("Offer"));//false
        System.out.println(str.contains("offer"));// true

        // char aratabilir miyim?

        //System.out.println(str.contains('e')); char sequence  lazım char aratamayız






    }
}
