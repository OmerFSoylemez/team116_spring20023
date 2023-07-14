package Day15_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Yazdirma {

    public static void main(String[] args) {
        /*
        MDA yazdırma işlemi yaparken
        yazdırmak istediğimizin ne olduğuna bakmamız gerekir
        -element ise direk yazdırabiliriz
        -tek katlı bir array ise Arrays.toString() kullanabiliriz
        -MDA ise Arrays.deepToString kullanmalıyız
         */

        int [][] arr= {{1,5,9},{3,4},{2,8,1,2},{10}};

        System.out.println(arr[0][0]);//1

        //System.out.println(arr[3][2]);//ArrayIndexOutOfBoundsException

        System.out.println(arr.length);//4

        System.out.println(arr[2].length);//4

        System.out.println(arr[3].length);//1

        // arr [2][1] bir element olduğu için length i olmaz

        System.out.println(arr[2]);//[I@568db2f2

        System.out.println(Arrays.toString(arr[2]));//[2, 8, 1, 2]

        System.out.println(Arrays.toString(arr));//[[I@378bf509, [I@5fd0d5ae, [I@568db2f2, [I@2d98a335]

        System.out.println(Arrays.deepToString(arr));//[[1, 5, 9], [3, 4], [2, 8, 1, 2], [10]]

    }
}
