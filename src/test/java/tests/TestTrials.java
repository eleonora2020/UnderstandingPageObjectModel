package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BrowserUtils;
import utils.Driver;

public class TestTrials extends TestBase { // to call upon the website that we have refered to the configuration file. Basically, it is going to open up the website.

    @Test(description = "Verify Login")
    public void test1() {

        LoginPage loginPage = new LoginPage(); // to test the login functionality
        loginPage.login();

        System.out.println(Driver.get().getTitle());

    //we used LoginPage(extend PageBase) to call the method that we have created to test below menus
        loginPage.menuNavigation("Drive"); // to test the Drive button
        System.out.println(loginPage.getPageSubtitle()); // to print Drive page subtitle to a console
        BrowserUtils.wait(2);

        loginPage.menuNavigation("Calendar"); // to test the Calendar button
        System.out.println(loginPage.getPageSubtitle()); // to print Calendar page subtitle to a console
        BrowserUtils.wait(2);

        loginPage.menuNavigation("Mail"); // to test the Mail button
        System.out.println(loginPage.getPageSubtitle()); // to print Mail page subtitle to a console
        BrowserUtils.wait(2);

        loginPage.menuNavigation("Contact Center"); // to test the Contact Center button
        System.out.println(loginPage.getPageSubtitle()); // to print Contact Center page subtitle to a console
        BrowserUtils.wait(2);
    }
}
