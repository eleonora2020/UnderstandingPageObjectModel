package tests.SmokeTest_Bitrix24;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.TestBase;

public class MenuItemsSubtitleTest extends TestBase {

    @DataProvider(name = "MenuData")
    public Object[][] data() { //using two dimentional array here

        return new Object[][]{
                {"Activity Stream", "Activity Stream"}, //menuItem, pageSubtitle
                {"Tasks", "My tasks"},
                {"Workgroups", "Workgroups and projects"},
                {"Drive", "My Drive"},
                {"Calendar", "Calendar"},
                {"Mail", "Mailbox Integration"},
                {"Contact Center", "Contact Center"},
                {"Time and Reports", "Absence Chart"},
                {"Employees", "Company Structure"},
                {"Services", "Meeting Rooms"},
                {"Company", "Company"}

        };
    }

    @Test(dataProvider = "MenuData")
    public void menuItemTest(String menuItem, String pageSubtitle) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(); //from the LoginPage we are calling login method
        loginPage.menuNavigation(menuItem); // from loginPage(Basepage) we are calling MenuNavigation method that we have created.
        String expectedTitle = pageSubtitle;
        String actualTitle = loginPage.getPageSubtitle();
        Assert.assertEquals(actualTitle, expectedTitle, menuItem + " Page Subtitle is wrong");
    }

}
//    WE USE BELOW TESTS WITHOUT USING @DATAPROVIDER
//    @Test(description = "Verify that page subtitle is correct for Activity Stream")
//    public void test1() {
//        LoginPage loginPage = new LoginPage();
//        loginPage.login();
//        loginPage.menuNavigation("Activity Stream");
//        String expectedTitle = "Activity Stream";
//        String actualTitle = loginPage.getPageSubtitle();
//        Assert.assertEquals(actualTitle, expectedTitle, "Activity Sream page subtitle is wrong");
//
//    }
//
//    @Test(description = "Verify that page subtitle is correct for Activity Stream")
//    public void test2() {
//        LoginPage loginPage = new LoginPage();
//        loginPage.login();
//        loginPage.menuNavigation("Tasks");
//        String expectedTitle = "My tasks";
//        String actualTitle = loginPage.getPageSubtitle();
//        Assert.assertEquals(actualTitle, expectedTitle, "Tasks page subtitle is wrong");
//
//    }
//
//    @Test(description = "Verify that page subtitle is correct for Activity Stream")
//    public void test3() {
//        LoginPage loginPage = new LoginPage();
//        loginPage.login();
//        loginPage.menuNavigation("Workgroups");
//        String expectedTitle = "Workgroups and projects";
//        String actualTitle = loginPage.getPageSubtitle();
//        Assert.assertEquals(actualTitle, expectedTitle, "Tasks page subtitle is wrong");
//
//    }
//}