package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private WebDriver driver;
    private By lblHome = By.xpath("//div[@id='menu']//following::span[contains(text(),'Home')]");
    private By lblFAQ = By.xpath("//div[@id='menu']//following::span[contains(text(),'FAQ')]");
    private By lblContact = By.xpath("//div[@id='menu']//following::span[contains(text(),'Contact')]");
    private By lblTimetable = By.xpath("//div[@id='menu']//following::span[contains(text(),'Timetable')]");
    private By lblTicketPrice = By.xpath("//div[@id='menu']//following::span[contains(text(),'price')]");
    private By lblBookTicket = By.xpath("//div[@id='menu']//following::span[contains(text(),'Book ticket')]");
    private By lblChangePassword = By.xpath("//div[@id='menu']//following::span[contains(text(),'password')]");
    private By lblLogout = By.xpath("//div[@id='menu']//following::span[contains(text(),'out')]");
    private By lblLogin = By.xpath("//div[@id='menu']//following::span[contains(text(),'in')]");

    public WebElement getlblHome() {
        return driver.findElement(lblHome);
    }
    public WebElement getlblFAQ() {
        return driver.findElement(lblFAQ);
    }
    public WebElement getlblContact() {
        return driver.findElement(lblContact);
    }
    public WebElement getlblTimetable() {
        return driver.findElement(lblTimetable);
    }
    public WebElement getlblTicketPrice() {
        return driver.findElement(lblTicketPrice);
    }
    public WebElement getlblBookTicket() {
        return driver.findElement(lblBookTicket);
    }
    public WebElement getlblChangePassword() {
        return driver.findElement(lblChangePassword);
    }
    public WebElement getlblLogout() {
        return driver.findElement(lblLogout);
    }
    public WebElement getlblLogin() {
        return driver.findElement(lblLogin);
    }
}
