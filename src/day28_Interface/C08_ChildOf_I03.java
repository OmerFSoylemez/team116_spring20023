package day28_Interface;

public class C08_ChildOf_I03 implements I03_BodyOlanMethod{
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    public static void main(String[] args) {
        //method5(); method5 static olmadığı için, static olan main method içinde direk kullanılamaz.
        I03_BodyOlanMethod.method6();

    }

    public void method7(){
        method5();
        I03_BodyOlanMethod.method6();
    }
}
