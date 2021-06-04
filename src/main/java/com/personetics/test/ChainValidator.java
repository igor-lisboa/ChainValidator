package com.personetics.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to validate the Chain.
 */
public class ChainValidator {
    /**
     * Validate the chain.
     * @param nodes The chain to be validated.
     */
    boolean validate(List<Node> nodes) {

        List<String> items = new ArrayList<String>();

        ArrayList<ArrayList<String>> dependencies = new ArrayList<ArrayList<String>>();

        /* Iterating nodes to get value and dependencies */
        nodes.forEach(node -> {
            items.add(node.getValue().toString());

            ArrayList<String> nodeDependencies = node.getDependencies();

            if (nodeDependencies.size() > 1) {

                dependencies.add(nodeDependencies);
            }
        });

        /* While Loop for iterating dependencies */
        int countDependencies = 0;
        while (dependencies.size() > countDependencies) {
            ArrayList<String> nodeDependencies = dependencies.get(countDependencies);

            /* While Loop for iterating nodeDependencies */
            int countNodeDependencies = 0;
            while (nodeDependencies.size() > countNodeDependencies) {
                String dependency = nodeDependencies.get(countNodeDependencies);

                /* If dependency not in items then this Chain is not valid */
                if (!items.contains(dependency)) {
                    return false;
                }
                countNodeDependencies++;
            }
            countDependencies++;
        }

        return true;
    }
}
