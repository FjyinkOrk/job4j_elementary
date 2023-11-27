package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort34125Then12345() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort78421Then12478() {
        int[] data = new int[]{7, 8, 4, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 4, 7, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort739Then379() {
        int[] data = new int[]{7, 3, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 7, 9};
        assertThat(result).containsExactly(expected);
    }
}