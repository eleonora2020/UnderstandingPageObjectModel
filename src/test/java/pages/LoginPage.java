package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigurationReader;
import utils.Driver;

public class LoginPage extends PageBase {

    public LoginPage() { //added constructor. To add construtor go to Code menu -->Generate -->Constructor-->Select None

        //initElements is to initialize elements; Driver.get is to get our browsers. This keyword -> refers to the LoginPage class.
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name="USER_LOGIN")
    private WebElement username; // used private because they do not have to be seen everywhere, until we call/use them
    //if we put them as public then, they will contstantly popup while writing scripts on the testing page.

    @FindBy(name="USER_PASSWORD")
    private WebElement password;

    @FindBy(className="login-btn")
    private WebElement loginButton;

    public void login() { //object oriented method for login

        username.clear(); // to clear the saved username in the username box
        password.clear(); // to be on the safe side clear the password box

        username.sendKeys(ConfigurationReader.getProperty("user_name"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

}
