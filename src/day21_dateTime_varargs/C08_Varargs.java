package day21_dateTime_varargs;

public class C08_Varargs {

    public static void main(String[] args) {



        //verilen değişken sayıdaki tamsayidan
        // ilkinin karesini, diğerinin toplamıyla çarpan ve sonucu yazdıran bir method oluşturun

        islemYap(3,4,5);//(3*3)*(4*5)=81
        islemYap(2,3,4,5);//(2*2)*(3*4*5)=48
        islemYap(4,5,6,7,8,4);
        islemYap(1,2);//İstenilen islem sonucu:2
        islemYap(5);//İstenilen islem sonucu:0

        // varargs değişen sayıda element kabul edilen bir array olduğundan
        // 12.satırda yazılan işlemde varargs eleman kalmaz,varargs=[] boş bir array olur
}
        public static void islemYap(int ilkSayi,int...geriyeKalanSayilar){

        int toplam=0;

        for(int each:geriyeKalanSayilar
        ){
            toplam+=each;
        }

            System.out.println("İstenilen islem sonucu:"+(ilkSayi*ilkSayi*toplam));
        }
}
