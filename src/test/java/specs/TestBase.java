package specs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DashBoardPage;
import pages.LoginPage;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;
    public LoginPage loginPage;
    public DashBoardPage dashBoardPage;

    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Test case is being run");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);

    }

    @AfterEach
    public void finish() {
        driver.quit();
    }
}
