package hr.fer.rassus.pdqreview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstantsTest {

    @Test
    public void constantsTest() {
        assertEquals((double) 194 / 143, Constants.v2);
        assertEquals((double) 194 / 715, Constants.v3);
        assertEquals((double) 291 / 715, Constants.v4);
        assertEquals((double) 97 / 143, Constants.v5);
        assertEquals((double) 102 / 143, Constants.v6);
        assertEquals((double) 146 / 143, Constants.v7);
    }

}