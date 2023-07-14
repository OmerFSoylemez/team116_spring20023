package day21_dateTime_varargs;

public class C09_Varargs {
    public static void main(String[] args) {

        //son elementi ayırabileceğimiz bir metod oluşturalım

        islemYap(3,4,5);
    }

    public static void islemYap(int...bastakiSayilar){
        //varargs eleman alırken sınır tanımadığı için, ne kadar eleman varsa almaya çalışır
        //kendisinden sonraki parametrelere eleman bırakmaz
        // Bundan dolayı bir metodda ğparametre olarak varargs kullanılacaksa
        //EN SONDA KULLANILMALIDIR

        // Bu mantıkla bir method da birden fazla VARARGS KULLANILMAZ
    }
}
