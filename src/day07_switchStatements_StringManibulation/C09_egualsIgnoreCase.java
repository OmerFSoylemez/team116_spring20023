package day07_switchStatements_StringManibulation;

public class C09_egualsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "JaVa";
        String str6 = new String("Java");

        System.out.println(str1.equalsIgnoreCase(str3));//true
        System.out.println(str1.equalsIgnoreCase(str5));//true
        System.out.println(str6.equalsIgnoreCase(str2));//true

    }
}
