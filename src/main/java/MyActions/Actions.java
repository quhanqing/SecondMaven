package MyActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions {
    WebDriver driver;

    public Actions(WebDriver driver){
        this.driver=driver;
    }

    public void click(WebElement webElement){
        webElement.click();
    }
}
