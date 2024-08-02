//package org.example;
//
//import org.example.dynamic_programming.LongestIncreasingSubsequence;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class LongestIncreasingSubsequenceTest {
//    LongestIncreasingSubsequence longestIncreasingSubsequence;
//    @BeforeMethod
//    public void setUp() {
//        longestIncreasingSubsequence = new LongestIncreasingSubsequence();
//    }
//
//
//    @Test(dataProvider = "dataprovider")
//    public void simplest(int [] nums,int expectedVal){
//        Assert.assertEquals(longestIncreasingSubsequence.lengthOfLIS(nums),expectedVal);
//    }
//    @DataProvider (name = "dataprovider")
//    public Object[][] dpMethod() {
//        return new Object [][]{
//                new Object[]{new int[]{0,1,0,3,2,3}, 4},
//                new Object[]{new int[]{10,9,2,5,3,7,101,18}, 4},
//                new Object[]{new int[]{7,7,7,7,7,7,7},1}
//        };
//    }
//}