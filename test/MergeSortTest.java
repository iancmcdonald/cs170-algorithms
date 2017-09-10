import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    private List<Integer> intList;
    private List<Integer> intGroundTruth;
    private List<Character> charList;
    private List<Character> charGroundTruth;

    @BeforeEach
    void setUp() {
        intList = Arrays.asList(5, 0, 1, 7, 6);
        intGroundTruth = Arrays.asList(0, 1, 5, 6, 7);
        charList = Arrays.asList('a', 'z', 'd', 'f', 'h', 'c');
        charGroundTruth = Arrays.asList('a', 'c', 'd', 'f', 'h', 'z');
    }

    @Test
    void mergeSort() {
        List<Integer> intResult = MergeSort.mergeSort(intList);
        assertEquals(intResult, intGroundTruth);

        List<Character> charResult = MergeSort.mergeSort(charList);
        assertEquals(charResult, charGroundTruth);
    }

    @Test
    void mergeSortIterative() {
        List<Integer> intResult = MergeSort.mergeSortIterative(intList);
        assertEquals(intResult, intGroundTruth);

        List<Character> charResult = MergeSort.mergeSortIterative(charList);
        assertEquals(charResult, charGroundTruth);
    }

}