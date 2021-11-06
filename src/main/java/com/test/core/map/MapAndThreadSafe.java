package com.test.core.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//https://www.tutorialspoint.com/difference-between-concurrent-hash-map-and-synchronized-hashmap-in-java
public class MapAndThreadSafe {

    // Concurrent hash map applies locks only at bucket level
    private Map<Integer, String> concurrentHashMap() {
        Map<Integer, String> laptopmap = new ConcurrentHashMap<>();
        laptopmap.put(1, "IBM");
        laptopmap.put(2, "Dell");
        laptopmap.put(3, "HCL");
        System.out.println("ConcurrentHashMap is: "+laptopmap);
        return laptopmap;
    }

    //method applies a lock on the entire collection
    private Map<Integer, String> synchronizedHashMap() {
        Map<Integer, String> laptopmap = new HashMap<>();
        laptopmap.put(1, "IBM");
        laptopmap.put(2, "Dell");
        laptopmap.put(3, "HCL");
        // create a synchronized map
        Map<Integer, String> syncmap = Collections.synchronizedMap(laptopmap);
        System.out.println("Synchronized map is : "+syncmap);
        return syncmap;
    }

}
