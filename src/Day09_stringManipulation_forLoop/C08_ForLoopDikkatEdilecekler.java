package Day09_stringManipulation_forLoop;

public class C08_ForLoopDikkatEdilecekler {

    public static void main(String[] args) {


        //verilen ilk değer bitiş şartını sağlamıyorsa

        for (int i = 10; i <0 ; i++) {

            System.out.println(i);

        }
        // Kod çalışır ancak ilk değer için bile bitiş şartı sağlamadığından loop body hiç çalışmaz

        // başlangıç değeri ve artış azalış mikterı ile bitiş şartı hiç sağlanamazsa

        for (int i = 10; i >=0 ; i++) {

            System.out.println(i);

            //buna sonsuz loop denir makinenin ram i dolana kadar kod çalışır.

        }
    }
}
