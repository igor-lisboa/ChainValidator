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

        ArrayList<String> dependencies = new ArrayList<String>();

        /* Iterating nodes to get value and dependencies */
        nodes.forEach(node -> {
            items.add(node.getValue().toString());

            List<String> nodeDependencies = node.getDependencies();

            if (nodeDependencies.size() > 1) {

                // remove all itens from dependencies
                nodeDependencies.removeAll(dependencies);

                dependencies.addAll(nodeDependencies);
            }
        });

        /* While Loop for iterating dependencies */
        int countDependencies = 0;
        while (dependencies.size() > countDependencies) {
            String dependency = dependencies.get(countDependencies);

            /* If dependency not in items then this Chain is not valid */
            if (!items.contains(dependency)) {
                return false;
            }
            countDependencies++;
        }

        return true;
    }
}
