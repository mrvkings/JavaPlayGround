package com.mrvkings.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        // Example 1: Collection of Strings
        Collection<String> collection1 = new ArrayList<String>();
        collection1.add(null); // You can add null to the collection
        collection1.add("Hello"); // This will result in a compilation error
        System.out.println(collection1);

        // Example 2: Collection of Integers
        Collection<? extends Object> collection2 = new ArrayList<Integer>();
        collection2.add(null); // You can add null to the collection
        // collection2.add(42); // This will result in a compilation error

        // Example 3: Collection of custom objects
        Collection<? extends Object> collection3 = new ArrayList<CustomObject>();
        collection3.add(null); // You can add null to the collection
        // collection3.add(new CustomObject()); // This will result in a compilation error
    }
}

class CustomObject {
    // Custom class
}
