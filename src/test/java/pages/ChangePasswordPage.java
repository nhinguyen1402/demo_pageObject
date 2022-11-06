package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends BasePage{
    private WebDriver driver;
    private By txtCurentPass = By.xpath("//input[@id='currentPassword']");
    private By txtNewPass = By.xpath("//input[@id='newPassword']");
    private By txtConfirmPass = By.xpath("//input[@id='confirmPassword']");
    private By bntChangePass = By.xpath("//input[contains(@title,'Change')]");

    public WebElement gettxtCurentPass() {
        return driver.findElement(txtCurentPass);
    }
    public WebElement gettxtNewPass() {
        return driver.findElement(txtNewPass);
    }
    public WebElement gettxtConfirmPass() {
        return driver.findElement(txtConfirmPass);
    }
    public WebElement getbntChangePass() {
        return driver.findElement(bntChangePass);
    }

    public void ChangePass(String currentPass, String newPass, String confirmPass) {
        gettxtCurentPass().sendKeys(currentPass);
        gettxtNewPass().sendKeys(newPass);
        gettxtConfirmPass().sendKeys(confirmPass);
        getbntChangePass().click();
    }
}
