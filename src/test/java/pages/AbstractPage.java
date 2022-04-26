package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //Wait Wrapper Methods
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void waitToBeClickable(By elementBy) {
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    //Click Method
    public void click(By elementBy) {
        //waitVisibility(elementBy);
        waitToBeClickable(elementBy);
        driver.findElement(elementBy).click();
    }
    //Is Element Displayed Method
    public void isElementDisplayed(By elementBy) {
        //waitVisibility(elementBy);
        waitToBeClickable(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

}
