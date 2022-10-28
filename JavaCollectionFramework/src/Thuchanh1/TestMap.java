package Thuchanh1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Join", 20);
        hashMap.put("Kell", 30);
        hashMap.put("Bell", 50);
        hashMap.put("Candy", 80);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Join", 20);
        linkedHashMap.put("Kell", 30);
        linkedHashMap.put("Bell", 50);
        linkedHashMap.put("Candy", 80);
        System.out.println("\nThe age for "+"Lewis is " + linkedHashMap.get("Lewis"));
    }
}
