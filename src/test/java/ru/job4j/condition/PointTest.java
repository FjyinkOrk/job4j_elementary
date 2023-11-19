package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when01To20Then2dot2360() {
        int x1 = 0;
        int x2 = 1;
        int y1 = 2;
        int y2 = 0;
        double expected = 2.2360;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));

    }

    @Test
    void when01To01Then1dot4142() {
        int x1 = 0;
        int x2 = 1;
        int y1 = 0;
        int y2 = 1;
        double expected = 1.4142;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));

    }

    @Test
    void when24To42Then2dot8284() {
        int x1 = 2;
        int x2 = 4;
        int y1 = 4;
        int y2 = 2;
        double expected = 2.8284;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));

    }
}