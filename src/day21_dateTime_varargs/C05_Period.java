package day21_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C05_Period {

    public static void main(String[] args) {


        LocalDate dogumtarihi = LocalDate.of(1981,8,19);
        LocalDate bugun = LocalDate.now();

        Period yasOmer = Period.between(dogumtarihi,bugun);
        System.out.println(yasOmer);//P41Y8M6D

        System.out.println("Omer'in yası:"+yasOmer.getYears());//Omer'in yası:41
    }
}
