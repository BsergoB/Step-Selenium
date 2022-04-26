package specs;

import org.junit.jupiter.api.Test;
public class TestCase001 extends TestBase {
    @Test
    //Login to Site
    public void loginToDashBoard() {
        loginPage.goTo();
        loginPage.clickLoginButton();
    }
    @Test
    //Checking element on Plans Tab
    public void plansTab() {
        loginPage.loginSite();
        dashBoardPage.checkPlansTab();
    }
    @Test
    //Checking element on Keywords Tab
    public void keywordsTab() {
        loginPage.loginSite();
        dashBoardPage.clickKeywordsTab();
        dashBoardPage.checkKeywordsTab();
    }
    @Test
    //Checking element on Parameters Tab
    public void parametersTab() {
        loginPage.loginSite();
        dashBoardPage.clickParametersTab();
        dashBoardPage.checkParametersTab();
    }
    @Test
    //Checking element on Execution Tab
    public void executionsTab() {
        loginPage.loginSite();
        dashBoardPage.clickExecutionsTab();
        dashBoardPage.checkExecutionsTab();
    }
    @Test
    //Checking element on Scheduler Tab
    public void schedulerTab() {
        loginPage.loginSite();
        dashBoardPage.clickSchedulerTab();
        dashBoardPage.checkSchedulerTab();
    }
    @Test
    //Checking element on Grid Tab
    public void gridTab() {
        loginPage.loginSite();
        dashBoardPage.clickGridTab();
        dashBoardPage.checkGridTab();
    }
    @Test
    //Checking element on Admin Tab
    public void adminTab() {
        loginPage.loginSite();
        dashBoardPage.clickAdminTab();
        dashBoardPage.checkAdminTab();
    }

}
