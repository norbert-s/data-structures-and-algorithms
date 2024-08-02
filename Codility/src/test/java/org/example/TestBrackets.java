package org.example;

import org.example.stacks_and_queues.Brackets;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TestBrackets {
    private Brackets solution;

    @BeforeMethod
    public void setUp() {
        solution = new Brackets();
    }

    @DataProvider(name = "test1")
    public Object [][] createData1() {
        return new Object [][] {
                new Object [] { "{[()()]}", 1 },
                new Object [] { "{[(){([])}()]}", 1 },
                new Object [] { "{}", 1 },
                new Object [] { "()", 1 },
                new Object [] { "[]", 1 },
                new Object [] { "[([][])()]", 1 },
                new Object [] { "([)()]", 0 },
                new Object [] { "(]", 0 },
                new Object [] { "", 1 },
                new Object [] { "{{{{", 0 },
                new Object [] { "))", 0 },
        };
    }

    @Test(dataProvider = "test1")
    public void verifySolution(String pS, int pExpected) {
        solution = new Brackets();
        int actual = solution.solution(pS);

        Assert.assertEquals(actual, pExpected);
    }
}