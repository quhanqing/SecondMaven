package GiteeTest;

import MyActions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest {
    WebDriver driver;
    String baseUrl="https://gitee.com/";
    @BeforeClass
    public void beforeClass(){
        String badeDir=System.getProperty("user.dir");
        String driverPath=badeDir+"/src/test/Driver/chromedriver";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void loginTest(){
        Actions actions=new Actions(driver);
        WebElement login1=driver.findElement(By.xpath(LoginPage.loginxPath));
        actions.click(login1);
        WebElement username=driver.findElement(By.id(LoginPage.userNameId));
        username.clear();
        GetDataFromExcel getDataFromExcel=new GetDataFromExcel();
        String[] value=getDataFromExcel.getCellValue(LoginPage.nameColum,LoginPage.passwordColum,LoginPage.filePath,LoginPage.sheetName,LoginPage.rowNum);
        username.sendKeys(value[0]);
        WebElement password=driver.findElement(By.id(LoginPage.userPasswordId));
        password.clear();
        password.sendKeys(value[1]);
        WebElement login2=driver.findElement(By.name(LoginPage.loginBtn));
        actions.click(login2);
    }

}
