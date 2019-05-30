package com.training;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EightQueensTest {
    EightQueens eightQueens;

    @BeforeMethod
    public void setUp() {
        eightQueens = new EightQueens();
    }

    @Test
    public void test() {
        Assert.assertEquals(eightQueens.printMessage(), "Hello");
    }
}
