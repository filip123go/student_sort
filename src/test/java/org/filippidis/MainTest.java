package org.filippidis;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testOrdinal() {
        assertEquals("1st", Main.ordinal(1));
        assertEquals("2nd", Main.ordinal(2));
        assertEquals("3rd", Main.ordinal(3));
        assertEquals("4th", Main.ordinal(4));
        assertEquals("11th", Main.ordinal(11));
        assertEquals("12th", Main.ordinal(12));
        assertEquals("13th", Main.ordinal(13));
        assertEquals("21st", Main.ordinal(21));
        assertEquals("22nd", Main.ordinal(22));
        assertEquals("23rd", Main.ordinal(23));
        assertEquals("24th", Main.ordinal(24));
    }
}