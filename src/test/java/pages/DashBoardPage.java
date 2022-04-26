package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends AbstractPage {
    String plansTab  = "//li[contains(@ng-class, 'plans')]";
    String newPlanButton = "//button[text()='New plan']";
    String keywordsTab  = "//li[contains(@ng-class, 'functions')]";
    String newKeywordButton = "//button[text()='New keyword']";

    String parametersTab  = "//li[contains(@ng-class, 'parameters')]";
    String newParameterButton = "//button[text()='New parameter']";
    String executionsTab  = "//li[contains(@ng-class, 'executions')]";
    String executionsList = "//a[@ng-click=\"selectTab(tab.id)\"]";
    String schedulerTab  = "//li[contains(@ng-class, 'scheduler')]";
    String newTaskButton = "//button[text()='New task']";
    String gridTab  = "//li[contains(@ng-class, 'grid')]";
    String tokens = "//li[@heading='Tokens']";
    String adminTab  = "//li[contains(@ng-class, 'admin')]";
    String addUserButton = "//button[text()='Add user']";
    public DashBoardPage(WebDriver driver) {
        super(driver);
    }
    public void checkPlansTab() {
        isElementDisplayed(By.xpath(this.newPlanButton));
        System.out.println("Plans Tab is checked!");
    }
    public void clickKeywordsTab() {
        click(By.xpath(this.keywordsTab));
    }

    public void checkKeywordsTab() {
        isElementDisplayed(By.xpath(this.newKeywordButton));
        System.out.println("Keywords Tab is checked!");
    }

    public void clickParametersTab() {
        click(By.xpath(this.parametersTab));
    }

    public void checkParametersTab() {
        isElementDisplayed(By.xpath(this.newParameterButton));
        System.out.println("Parameters Tab is checked!");
    }

    public void clickExecutionsTab() {
        click(By.xpath(this.executionsTab));
    }
    public void checkExecutionsTab() {
        isElementDisplayed(By.xpath(this.executionsList));
        System.out.println("Executions Tab is checked!");
    }
    public void clickSchedulerTab() {
        click(By.xpath(this.schedulerTab));
    }
    public void checkSchedulerTab() {
        isElementDisplayed(By.xpath(this.newTaskButton));
        System.out.println("Scheduler Tab is checked!");
    }
    public void clickGridTab() {
        click(By.xpath(this.gridTab));
    }
    public void checkGridTab() {
        isElementDisplayed(By.xpath(this.tokens));
        System.out.println("Grid Tab is checked!");
    }
    public void clickAdminTab() {
        click(By.xpath(this.adminTab));
    }
    public void checkAdminTab() {
        isElementDisplayed(By.xpath(this.addUserButton));
        System.out.println("Admin Tab is checked!");
    }
    public void clickPlansTab() {
        click(By.xpath(this.plansTab));
    }
}
