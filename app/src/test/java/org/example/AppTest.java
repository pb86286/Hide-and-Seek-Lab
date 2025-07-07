package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testLinearSearchSorted() {
        FuzzyFinder finder = new FuzzyFinder();
        FuzzyListGenerator generator = new FuzzyListGenerator();
        ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();

        int index = finder.linearSearch(fuzzies);
        assertTrue(index >= 0);
        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    void testBinarySearchSorted() {
        FuzzyFinder finder = new FuzzyFinder();
        FuzzyListGenerator generator = new FuzzyListGenerator();
        ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();

        int index = finder.binarySearch(fuzzies);
        assertTrue(index >= 0);
        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    void testLinearSearchRandom() {
        FuzzyFinder finder = new FuzzyFinder();
        FuzzyListGenerator generator = new FuzzyListGenerator();
        ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();

        int index = finder.linearSearch(fuzzies);
        assertTrue(index >= 0);
        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    void testBinarySearchRandom() {
        FuzzyFinder finder = new FuzzyFinder();
        FuzzyListGenerator generator = new FuzzyListGenerator();
        ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();

        int index = finder.binarySearch(fuzzies);
        System.out.println("Binary search (randomized) result index: " + index);
    }
}