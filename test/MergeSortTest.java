import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    private List<Integer> intList;
    private List<Character> charList;

    @BeforeEach
    void setUp() {
        intList = Arrays.asList(5, 0, 1, 7, 6);
        charList = Arrays.asList('a', 'z', 'd', 'f', 'h', 'c');
    }

    @Test
    void mergeSort() {
        List<Integer> intResult = MergeSort.mergeSort(intList);
        List<Integer> intGroundTruth = Arrays.asList(0, 1, 5, 6, 7);
        assertEquals(intResult, intGroundTruth);

        List<Character> charResult = MergeSort.mergeSort(charList);
        List<Character> charGroundTruth = Arrays.asList('a', 'c', 'd', 'f', 'h', 'z');
        assertEquals(charResult, charGroundTruth);
    }

    @Test
    void mergeSortIterative() {
        List<Integer> intResult = MergeSort.mergeSortIterative(intList);
        List<Integer> intGroundTruth = Arrays.asList(0, 1, 5, 6, 7);
        assertEquals(intResult, intGroundTruth);

        List<Character> charResult = MergeSort.mergeSortIterative(charList);
        List<Character> charGroundTruth = Arrays.asList('a', 'c', 'd', 'f', 'h', 'z');
        assertEquals(charResult, charGroundTruth);
    }

}