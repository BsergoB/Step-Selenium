package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
    String SITE_URL = "http://127.0.0.1:8080/";
    String loginButton = "//button[text()='Login']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(SITE_URL);
    }
    public void clickLoginButton() {
        click(By.xpath(this.loginButton));
    }
    public void loginSite() {
        this.goTo();
        this.clickLoginButton();
    }
}
