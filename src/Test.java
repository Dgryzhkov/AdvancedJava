import org.jetbrains.annotations.VisibleForTesting;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) {
        /*
            \\d- одна цифра
            \\w - одна английская буква
            \\w=[a-zA-Z]

            + - 1 или более
            * - 0 или более
            ? - 0 или 1 символов до

            ( | )  -  одна строка из множества строк

            [a-zA-Z] - все английские буквы

            [^abc] - мы хотим все символы кроме abc


           . - любой символ

           {2} - 2  символа до
           {2,} - от 2 символов
           {2, 4} - от 2 до 4 символов

         */

        String a ="-1";
        String b = "2";
        String c = "+3";
        System.out.println(a.matches("(-|\\+|)?\\d+"));
        System.out.println(b.matches("(-|\\+|)?\\d+"));
        System.out.println(c.matches("(-|\\+|)?\\d+"));

        String d ="PaaaSSS312321/+-*";
        System.out.println(d.matches("[a-zA-Z0-9\\-\\+\\*\\/]+"));

        String e = "hello";

        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.ru";

        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));


    }

}