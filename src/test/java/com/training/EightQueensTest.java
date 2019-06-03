package com.training;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class EightQueensTest {
    EightQueens eightQueens;

    @BeforeMethod
    public void setUp() {
        eightQueens = new EightQueens();
    }

    @Test
    public void test() {
        eightQueens.solve();
    }
}
