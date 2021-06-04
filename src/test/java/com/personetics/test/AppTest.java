package com.personetics.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
class AppTest {
    private ChainValidator cValidator = new ChainValidator();

    @Test
    void testChainOne() {
        List<Integer> numbers = Arrays.asList(35, 5, 65, 6, 24, 4);

        List<Node> nodes = new ArrayList<Node>();

        numbers.forEach((n) -> {
            Node node = new Node(n);
            nodes.add(node);
        });

        assertEquals(false, cValidator.validate(nodes));
    }

    @Test
    void testChainTwo() {
        List<Integer> numbers = Arrays.asList(36, 6, 24, 4, 47, 7, 2, 3, 27);
        List<Node> nodes = new ArrayList<Node>();

        numbers.forEach((n) -> {
            Node node = new Node(n);
            nodes.add(node);
        });

        assertEquals(true, cValidator.validate(nodes));
    }

    @Test
    void testChainThree() {
        List<String> strings = Arrays.asList("p", "aba", "a", "b", "perso", "o", "r", "e", "s");
        List<Node> nodes = new ArrayList<Node>();

        strings.forEach((n) -> {
            Node node = new Node(n);
            nodes.add(node);
        });

        assertEquals(true, cValidator.validate(nodes));
    }
}
