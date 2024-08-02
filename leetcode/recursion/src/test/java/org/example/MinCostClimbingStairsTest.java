package org.example;


import org.example.dynamic_programming.MinCostClimbingStairs;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class MinCostClimbingStairsTest {
    MinCostClimbingStairs minCostClimbingStairs;
    @BeforeTest
    void setUp() {
        minCostClimbingStairs = new MinCostClimbingStairs();
    }


    void tearDown() {
        minCostClimbingStairs=null;
    }

    @Test(dataProvider = "dataprovider")
    public void simplest(int [] cost,int expectedVal){
        Assert.assertEquals(minCostClimbingStairs.minCostClimbingStairs(cost),expectedVal);
    }
    @DataProvider (name = "dataprovider")
    public Object[][] dpMethod() {
        return new Object [][]{
                new Object[]{new int[]{10,15,20}, 15},
                new Object[]{new int[]{1,100,1,1,1,100,1,1,100,1}, 6}
        };
    }

}