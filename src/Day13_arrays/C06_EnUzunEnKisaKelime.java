package Day13_arrays;

public class C06_EnUzunEnKisaKelime {

    public static void main(String[] args) {
        //verilen string bir array'de
        //en uzun ve en kısa kelimeleri yazdıran bir method oluşturun

        String [] arr = {"Saida","Isa","Asil","Kubra","Elif"};
        enUzunveEnKısaElemanlar(arr);
    }

    public static void enUzunveEnKısaElemanlar(String[]arr){

        String enKısaEleman = arr[0];
        String enUzunEleman = arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length() >= enUzunEleman.length()){
                enUzunEleman= arr[i];
            }
            if (arr[i].length()<enKısaEleman.length())
                enKısaEleman= arr[i];


        }

        System.out.println("en uzun kelime : "+enUzunEleman);
        System.out.println("en kısa kelime : "+enKısaEleman);
    }
}
