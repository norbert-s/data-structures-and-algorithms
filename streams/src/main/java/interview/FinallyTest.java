package interview;

public class FinallyTest {
    public static int getValue() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }

//    public static void main(String[] args) {
//        WebElement searchBox = driver.findElement(By.id("search"));
//        driver.navigate().refresh();
//        searchBox.sendKeys("Selenium");
//
//    }


}


