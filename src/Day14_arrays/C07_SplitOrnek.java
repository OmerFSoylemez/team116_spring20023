package Day14_arrays;

import java.util.Arrays;

public class C07_SplitOrnek {

    public static void main(String[] args) {

        String str = "Java yilin bu zamanlarında bir başka güzel oluyor.Java olmadan java ogrenilmez";

        //Kaç tane "Java" var?

        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
;int sayac= 0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equalsIgnoreCase("java")){
                //her java kelimeisnde sayacı bir arttırdık
                sayac ++;

            }

        }

        System.out.println("java kelimesi sayac :"+ sayac);
    }
}
