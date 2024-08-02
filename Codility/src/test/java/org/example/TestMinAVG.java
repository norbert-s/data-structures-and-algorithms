package org.example;

import org.example.prefix_sums.MinAvg;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMinAVG {
    private MinAvg solution;

    @BeforeTest
    public void setUp() {
        solution = new MinAvg();
    }

    @DataProvider(name = "test1")
    public Object [][] createData1() {
        return new Object [][] {
                new Object [] {  new int [] { 4, 2, 2, 5, 1, 5, 8 }, 1 },
                new Object [] {  new int [] { 10000, -10000 }, 0 }
        };
    }

    @Test(dataProvider = "test1")
    public void verifySolution(int [] pA, int pExpected) {
        Assert.assertEquals(solution.solution(pA), pExpected);

    }
}
