package Day12_doWhileLoop_scope;

public class C03_doWhileLoop {
    public static void main(String[] args) {


        // Soru 1- ‘k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

        //for loop ile yapalım

        for (int i = 'k'; i <='t'; i++) {
            System.out.print((char)i + "  ");
        }
        System.out.println("");

        //while loop ile yapalım

        char harf = 'k';

        while (harf<='t'){
            System.out.print(harf + "  ");
            harf++;
        }
        System.out.println("");

        //do while loop ile yapalım

        harf = 'k';

        do {
            System.out.print(harf + "  ");
            harf++;
        }while (harf<='t');
        }



    }



