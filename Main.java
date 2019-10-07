package com.shevlik;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String str="Регулярные выражения — формальный язык поиска и осуществления манипуляций с подстроками в тексте, основанный на использовании метасимволов. Для поиска используется строка-образец (шаблон, маска), состоящая из символов и метасимволов и задающая правило поиска. Для манипуляций с текстом дополнительно задаётся строка замены, которая также может содержать в себе специальные символы. Регулярные выражения представляют мощный инструмент для обработки строк. Регулярные выражения позволяют задать шаблон, которому должна соответствовать строка или подстрока.";
        String strLowCase=str.toLowerCase();
        HashSet <String> hashSet=new HashSet<String>();
        /*String[] strArray=strLowCase.split("[\\s.—,\\-\\(\\)!?]+");
        System.out.println(Arrays.toString(strArray));*/
        Collections.addAll(hashSet,strLowCase.split("[\\s.—,\\-\\(\\)!?]+"));
        /*System.out.println(hashSet.toString());*/
        System.out.println(Actions.getCountOfIdenticalWords(hashSet,strLowCase).toString());
    }
}
