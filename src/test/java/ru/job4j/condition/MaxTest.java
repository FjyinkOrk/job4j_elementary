package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To5Then10() {
        int left = 10;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To10Then10() {
        int left = 5;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To0Then2() {
        int left = 1;
        int right = 2;
        int third = 0;
        int result = Max.max(left, right, third);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To5To2Then10() {
        int left = 10;
        int right = 5;
        int third = 2;
        int result = Max.max(left, right, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To10To15Then15() {
        int left = 5;
        int right = 10;
        int third = 15;
        int result = Max.max(left, right, third);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To10To10Then10() {
        int left = 10;
        int right = 10;
        int third = 10;
        int result = Max.max(left, right, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To0To1Then2() {
        int left = 1;
        int right = 2;
        int third = 0;
        int fourth = 1;
        int result = Max.max(left, right, third, fourth);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To5To2To1Then10() {
        int left = 10;
        int right = 5;
        int third = 2;
        int fourth = 1;
        int result = Max.max(left, right, third, fourth);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To10To15To20Then20() {
        int left = 5;
        int right = 10;
        int third = 15;
        int fourth = 20;
        int result = Max.max(left, right, third, fourth);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To10To10To10Then10() {
        int left = 10;
        int right = 10;
        int third = 10;
        int fourth = 10;
        int result = Max.max(left, right, third, fourth);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}