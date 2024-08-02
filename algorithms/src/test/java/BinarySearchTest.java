import org.example.search.BinarySearch;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Parameter;

public class BinarySearchTest {

    @DataProvider(name = "recursiveBinarySearchDataProvider")
    public Object[][] createData() {
        return new Object[][] {
                { 1, 0 },
                { 2, 1 },
                { 3, 2 },
                { 4, 3 },
                { 5, 4 },
                { 6, 5 },
        };
    }

    @Test(dataProvider = "recursiveBinarySearchDataProvider")
    void recursiveBinarySearchTest(int target,int expectedIndex){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int result = BinarySearch.recursiveBinarySearch(arr,0,arr.length-1,target);
        assert result == expectedIndex;

    }


    @Test(dataProvider = "recursiveBinarySearchDataProvider")
    void iterativeBinarySearchTest(int target,int expectedIndex){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int result = BinarySearch.recursiveBinarySearch(arr,0,arr.length-1,target);
        assert result == expectedIndex;

    }
}
