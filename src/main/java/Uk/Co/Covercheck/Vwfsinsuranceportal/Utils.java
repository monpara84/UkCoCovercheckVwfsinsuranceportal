package Uk.Co.Covercheck.Vwfsinsuranceportal;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Utils extends BasePage {

    // Reusable method for to click on an element
    public static void clickOnElementMethod(By by) {
        driver.findElement(by).click();
    }

    // Reusable method for to clear the field
    public static void clearOnFieldMethod(By by) {
        driver.findElement(by).clear();
    }

    // Reusable method for to type text in field
    public static void sendKeyMethod(By by, String typeAnyText) {
        driver.findElement(by).sendKeys(typeAnyText);
    }

    //Reusable method for to get text
    public static String getText(By by) {
        return driver.findElement(by).getText();
    }

    // Reusable method for the assert
    public static void assertEqualsMethod(String actualResult, String expectedResult, String message) {
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    //Reusable method for assertTrue
    public static void assertTrueMethod(String message, Boolean booleanCondition) {
        Assert.assertTrue(message, booleanCondition);
    }


}
