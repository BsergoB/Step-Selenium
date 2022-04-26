package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends AbstractPage {
    String plansTab  = "ul.nav.navbar-nav li[ng-class*=\"plans\"]";
    String nameHeader = "th.sorting > header";
    String keywordsTab  = "ul.nav.navbar-nav li[ng-class*=\"function\"]";
    String typeHeader = "th.sorting:nth-child(2) > header";

    String parametersTab  = "ul.nav.navbar-nav li[ng-class*=\"parameters\"]";
    String keyHeader = ".sorting_asc > header";
    String executionsTab  = "ul.nav.navbar-nav li[ng-class*=\"executions\"]";
    String executionsList = "//a[@ng-click=\"selectTab(tab.id)\"]";
    String schedulerTab  = "ul.nav.navbar-nav li[ng-class*=\"scheduler\"]";
    String cronExpression = "th.sorting:nth-child(3) > header";
    String gridTab  = "ul.nav.navbar-nav li[ng-class*=\"grid\"]";
    String tokens = "ul.nav.nav-tabs li.uib-tab:nth-child(3) > a";
    String adminTab  = "ul.nav.navbar-nav li[ng-class*=\"admin\"]";
    String settings = "ul.nav.nav-tabs li.uib-tab:nth-child(2) > a";
    public DashBoardPage(WebDriver driver) {
        super(driver);
    }
    public void checkPlansTab() {
        isElementDisplayed(By.cssSelector(this.nameHeader));
        System.out.println("Plans Tab is checked!");
    }
    public void clickKeywordsTab() {
        click(By.cssSelector(this.keywordsTab));
    }

    public void checkKeywordsTab() {
        isElementDisplayed(By.cssSelector(this.typeHeader));
        System.out.println("Keywords Tab is checked!");
    }

    public void clickParametersTab() {
        click(By.cssSelector(this.parametersTab));
    }

    public void checkParametersTab() {
        isElementDisplayed(By.cssSelector(this.keyHeader));
        System.out.println("Parameters Tab is checked!");
    }

    public void clickExecutionsTab() {
        click(By.cssSelector(this.executionsTab));
    }
    public void checkExecutionsTab() {
        isElementDisplayed(By.xpath(this.executionsList));
        System.out.println("Executions Tab is checked!");
    }
    public void clickSchedulerTab() {
        click(By.cssSelector(this.schedulerTab));
    }
    public void checkSchedulerTab() {
        isElementDisplayed(By.cssSelector(this.cronExpression));
        System.out.println("Scheduler Tab is checked!");
    }
    public void clickGridTab() {
        click(By.cssSelector(this.gridTab));
    }
    public void checkGridTab() {
        isElementDisplayed(By.cssSelector(this.tokens));
        System.out.println("Grid Tab is checked!");
    }
    public void clickAdminTab() {
        click(By.cssSelector(this.adminTab));
    }
    public void checkAdminTab() {
        isElementDisplayed(By.cssSelector(this.settings));
        System.out.println("Admin Tab is checked!");
    }
    public void clickPlansTab() {
        click(By.cssSelector(this.plansTab));
    }
}
