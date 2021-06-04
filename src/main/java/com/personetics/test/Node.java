package com.personetics.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Class to set the Node structure.
 */
public class Node {
    private Object value;

    public Node(Object input) {
        this.setValue(input);
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    /**
     * Function to get all dependencies of this Node.
     */
    public ArrayList<String> getDependencies() {
        ArrayList<String> itemsFromValue = new ArrayList<String>(Arrays.asList(this.getValue().toString().split("")));

        // creating a set to remove items that are repeated
        Set<String> set = new HashSet<>(itemsFromValue);
        itemsFromValue.clear();
        itemsFromValue.addAll(set);

        return itemsFromValue;
    }
}
