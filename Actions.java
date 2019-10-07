package com.shevlik;

import java.util.Collection;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Actions {
    public static TreeMap<String,Integer> getCountOfIdenticalWords(Collection<String> collection, String source){
        TreeMap<String,Integer> treeMap=new TreeMap<>();
        for(String s:collection){
            int count=0;
            Pattern pattern=Pattern.compile(s);
            Matcher matcher=pattern.matcher(source);
            while (matcher.find()){
                count++;
            }
            treeMap.put(s,count);

        }
        return treeMap;
    }
}
