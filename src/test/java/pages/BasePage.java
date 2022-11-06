package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage {
    private WebDriver driver;
//    public BasePage(WebDriver driver) {
//        driver= this.driver;
//    }
    private By lblHome = By.xpath("//div[@id='menu']//following::span[contains(text(),'Home')]");
    private By lblFAQ = By.xpath("//div[@id='menu']//following::span[contains(text(),'FAQ')]");
    private By lblContact = By.xpath("//div[@id='menu']//following::span[contains(text(),'Contact')]");
    private By lblTimetable = By.xpath("//div[@id='menu']//following::span[contains(text(),'Timetable')]");
    private By lblTicketPrice = By.xpath("//div[@id='menu']//following::span[contains(text(),'price')]");
    private By lblBookTicket = By.xpath("//div[@id='menu']//following::span[contains(text(),'Book ticket')]");
    private By lblChangePassword = By.xpath("//div[@id='menu']//following::span[contains(text(),'password')]");
    private By lblRegister = By.xpath("//div[@id='menu']//following::span[contains(text(),'Register')]");
    private By lblLogout = By.xpath("//div[@id='menu']//following::span[contains(text(),'out')]");
    private By lblLogin = By.xpath("//div[@id='menu']//following::span[contains(text(),'in')]");

    public WebElement getLblHome() {
        return driver.findElement(lblHome);
    }

    public WebElement getLblFAQ() {
        return driver.findElement(lblFAQ);
    }

    public WebElement getLblContact() {
        return driver.findElement(lblContact);
    }

    public WebElement getLblTimetable() {
        return driver.findElement(lblTimetable);
    }

    public WebElement getLblTicketPrice() {
        return driver.findElement(lblTicketPrice);
    }

    public WebElement getLblBookTicket() {
        return driver.findElement(lblBookTicket);
    }

    public WebElement getLblChangePassword() {
        return driver.findElement(lblChangePassword);
    }

    public WebElement getLblRegister() {
        return driver.findElement(lblRegister);
    }

    public WebElement getLblLogout() {
        return driver.findElement(lblLogout);
    }

    public WebElement getLblLogin() {
        return driver.findElement(lblLogin);
    }
}
