package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when01To20Then2dot2360() {
        Point point1 = new Point(0, 2);
        Point point2 = new Point(1, 0);
        double expected = 2.2360;
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when01To01Then1dot4142() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(1, 1);
        double expected = 1.4142;
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when24To42Then2dot8284() {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(4, 2);
        double expected = 2.8284;
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when01To20To32Then2dot4494() {
        Point point1 = new Point(0, 2, 3);
        Point point2 = new Point(1, 0, 2);
        double expected = 2.4494;
        double out = point1.distance3d(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when01To01To01Then1dot7320() {
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(1, 1, 1);
        double expected = 1.7320;
        double out = point1.distance3d(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when24To42To33Then2dot8284() {
        Point point1 = new Point(2, 4, 3);
        Point point2 = new Point(4, 2, 3);
        double expected = 2.8284;
        double out = point1.distance3d(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.0001));
    }
}