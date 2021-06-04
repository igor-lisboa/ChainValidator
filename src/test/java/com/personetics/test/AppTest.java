package com.personetics.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    private ChainValidator cValidator = new ChainValidator();

    @Test
    void testChainOne() {
        java.util.List<Integer> numbers = java.util.Arrays.asList(Integer.parseInt("35"), Integer.parseInt("5"),
                Integer.parseInt("65"), Integer.parseInt("6"), Integer.parseInt("24"), Integer.parseInt("4"));

        java.util.List<Node> nodes = new java.util.ArrayList<Node>();

        numbers.forEach(n -> {
            Node node = new Node(n);
            nodes.add(node);
        });

        assertEquals(false, cValidator.validate(nodes));
    }

    @Test
    void testChainTwo() {
        java.util.List<Integer> numbers = java.util.Arrays.asList(Integer.parseInt("36"), Integer.parseInt("6"),
                Integer.parseInt("24"), Integer.parseInt("4"), Integer.parseInt("47"), Integer.parseInt("7"),
                Integer.parseInt("2"), Integer.parseInt("3"), Integer.parseInt("27"));
        java.util.List<Node> nodes = new java.util.ArrayList<Node>();

        numbers.forEach(n -> {
            Node node = new Node(n);
            nodes.add(node);
        });

        assertEquals(true, cValidator.validate(nodes));
    }

    @Test
    void testChainThree() {
        java.util.List<String> strings = java.util.Arrays.asList("p", "aba", "a", "b", "perso", "o", "r", "e", "s");
        java.util.List<Node> nodes = new java.util.ArrayList<Node>();

        strings.forEach(n -> {
            Node node = new Node(n);
            nodes.add(node);
        });

        assertEquals(true, cValidator.validate(nodes));
    }
}
