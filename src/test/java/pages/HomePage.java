package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    private WebDriver driver;
    private By linkCreatAcc = By.xpath("//div[@id='content']//following::a[contains(@href,'Account')]");

    public WebElement getLinkCreatAcc() {
        return driver.findElement(linkCreatAcc);
    }
}
