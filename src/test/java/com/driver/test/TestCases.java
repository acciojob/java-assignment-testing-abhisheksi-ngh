package com.driver.test;

import com.driver.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCases {

    @Test
    public void testExample1() {
        assertEquals("a", Main.generatePattern(1));
    }

    @Test
    public void testExample2() {
        assertEquals("bac", Main.generatePattern(3));
    }

    @Test
    public void testExample3() {
        assertEquals("dbace", Main.generatePattern(5));
    }

    @Test
    public void testZero() {
        assertEquals("", Main.generatePattern(0));
    }
}
