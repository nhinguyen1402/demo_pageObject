package pages;

import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.xpath.XPath;

public class LoginPage extends BasePage {
    private WebDriver driver;
    private By txtUserName = By.xpath("//input[@id='username']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@value='Login']");
    private By loginErrorMsg = By.xpath("//p[@class='message error LoginForm']");

    public WebElement getTxtUserName() {
        return driver.findElement(txtUserName);
    }
    public WebElement getTxtPassword() {
        return driver.findElement(txtPassword);
    }
    public WebElement getBtnLogin() {
        return driver.findElement(btnLogin);
    }
    public WebElement getLoginErrorMsg() {
        return driver.findElement(loginErrorMsg);
    }

    public void login(String username, String pass) {
        getTxtUserName().sendKeys(username);
        getTxtPassword().sendKeys(pass);
        getlblLogin().click();
    }
}
