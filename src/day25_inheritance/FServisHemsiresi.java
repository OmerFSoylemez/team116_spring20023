package day25_inheritance;

public class FServisHemsiresi extends DHemsire{

    String str = "Servis Hemsiresi";
    int numara=20;


    public static void main(String[] args) {
        FServisHemsiresi sh1= new FServisHemsiresi();
        sh1.staticOlmayanMethod();




    }
    public void staticOlmayanMethod(){
        nobet();//3
        this.nobet();//3
        super.nobet();//2

        maas();//2000
        this.maas();//2000
        super.maas();//2000

        calısmaGunu();//4
        this.calısmaGunu();//4
        //super.calısmagunu();//CTE

        String str="Method";

        System.out.println(str);//Method
        System.out.println(this.str);//Servis Hemsiresi
        System.out.println(super.str);//Hemşire

        System.out.println(numara);//20
        System.out.println(this.numara);//20
        System.out.println(super.numara);//30

        System.out.println(izindeMi);//false    scope-class-parent
        System.out.println(this.izindeMi);//false   class-parent
        System.out.println(super.izindeMi);//false  parent

        char ilkHarf='J';
        System.out.println(ilkHarf);//J
        //System.out.println(this.ilkHarf);//CTE
        //System.out.println(super.ilkHarf);//CTE


    }
    public void nobet(){
        System.out.println("Servis hemşireleri haftada 3 gün nöbet tutar");
    }
    public void calısmaGunu(){
        System.out.println("Servis hemşireleri haftada 4 gün çalışır");
    }

}
