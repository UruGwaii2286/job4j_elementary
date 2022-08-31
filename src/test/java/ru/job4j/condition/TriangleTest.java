package ru.job4j.condition;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 1.0;
        double ac = 2.0;
        double bc = 3.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}