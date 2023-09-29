package words;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyCounterTest {

    @Test
    void testCountWordFrequency() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "cherry", "cherry");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 2);
        expected.put("cherry", 3);
        assertEquals(expected, WordFrequencyCounter.countWordFrequency(words));
    }

    @Test
    void testEmptyWordList() {
        List<String> words = Collections.emptyList();
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, WordFrequencyCounter.countWordFrequency(words));
    }

    @Test
    void testSingleWord() {
        List<String> words = Collections.singletonList("apple");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 1);
        assertEquals(expected, WordFrequencyCounter.countWordFrequency(words));
    }

    @Test
    void testMixedCaseWords() {
        List<String> words = Arrays.asList("Apple", "apple", "APPLE");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Apple", 1);
        expected.put("apple", 1);
        expected.put("APPLE", 1);
        assertEquals(expected, WordFrequencyCounter.countWordFrequency(words));
    }

    @Test
    void testMultipleOccurrencesSingleWord() {
        List<String> words = Arrays.asList("apple", "apple", "apple");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 3);
        assertEquals(expected, WordFrequencyCounter.countWordFrequency(words));
    }

}
