package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapsMain {

    public static void main(String[] args) {

        Map<String, Integer> heights = new HashMap<String, Integer>();

        heights.put("Joe", 72);
        heights.put("Jane", 63);
        heights.put("Sally", 65);

        heights.put("Joe", 33); // it won't add a new one it will only replace

        // we can use instead the replace() method
        heights.replace("Sally", 67);
        int sallyHeight = heights.get("Sally");
        System.out.println("Sally's new height after replacing it = " + sallyHeight);

        System.out.println("number of entries in the map = " + heights.size());

        // fetches value of key = "Joe"
        int joeHeight = heights.get("Joe");
        System.out.println("Joe's height = " + joeHeight);

        heights.remove("Jane");

        System.out.println("size of map = " + heights.size());

        // will give you all of the keys in the set
        Set<String> keys = heights.keySet();

        for(String key : keys) {
            System.out.println("Map Keys: " + key + ", Values: " + heights.get(key));
        }

        // will give you all of the values in the set
        Collection<Integer> values = heights.values();

        for (Integer value: values) {
            System.out.println("Map Values: " + value);
        }

        // will give you a set of displaying keys and values
        Set<Map.Entry<String, Integer>> myEntries = heights.entrySet();

        for(Map.Entry<String, Integer> entry :myEntries) {
            System.out.println("KEY - " + entry.getKey() + " : VALUE - " + entry.getValue());
        }
    }
}
