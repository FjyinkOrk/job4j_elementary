package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP3K1Square0dot5625() {
        int p = 3;
        double k = 1;
        double expected = 0.5625;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void whenP10K3Square4dot6875() {
        int p = 10;
        double k = 3;
        double expected = 4.6875;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void whenP7K4Square1dot9599() {
        int p = 7;
        double k = 4;
        double expected = 1.9599;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));
    }
}