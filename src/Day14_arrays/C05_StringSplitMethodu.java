package Day14_arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {

    public static void main(String[] args) {

        // split methodu: istediğimiz yerden bir sayıyı bölerek parçacıkları array e atar

        String str = "Java gerçekten çok güzel";

        String [] tanetane = str.split("");
        System.out.println(Arrays.toString(tanetane));

        int sayac = 0;

        for (int i = 0; i <tanetane.length ; i++) {

            if (tanetane[i].equals("e")){
                // 3)kaç tane var
            sayac++;
        }

        }

        System.out.println("Aradığımız e harfi arrayin içinde "+sayac+ " tane var");

    }


}
