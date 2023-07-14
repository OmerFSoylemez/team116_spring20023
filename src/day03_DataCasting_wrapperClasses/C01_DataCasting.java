package day03_DataCasting_wrapperClasses;

public class C01_DataCasting {

    public static void main(String[] args) {

        int in1 =10;
        short shrt = 12;
        byte byt = 15;
        long lng = 20;

        float flt = 1.2f;
        double dbl = 3.2;

        boolean bl = true;

        char chr ='a';



        String str = "Java Candir";

        /* bir data türündeki variable a başka data türünden değer atanabilir mi?
            bazı data turleri deger olarak baska data turlerini ASLA kabul etmez

            Sayisal deger olan primitivi data türlerinde ise
            daha kapsamlı olan data turundeki variable,
            daha dar kapsamli data turundeki değeri otamatik olarak kabul eder.

         */

        //chr = byt;
        //chr = str;
        //chr = flt;

        //bl = in1;
        //bl = "true";

        //str = bl;
        //str = chr;
        //str = shrt;

        //  Gruplar arasında geçiş olmaz.

        in1 = shrt;
        in1 = byt;
        //in1 =lng;
        //in1 =dbl;
        //in1 =flt;

        lng = byt;
        lng = shrt;
        lng = in1;
        //lng = flt;
        //lng = dbl

        // kendinden büyükleri kabul ediyor, kendinden kçükleri kabul etmiyor.

        dbl = byt;
        dbl = shrt;
        dbl = in1;
        dbl = lng;
        dbl = flt;

        // double sayısal olanlarda en büyük data türü olduğundan hepsini kabul etti.

        // byt = shrt
        // byt hiçbirini kabul etmez


    }
}
