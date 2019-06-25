package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
  public static String loginxPath="//*[@id=\"git-nav-user-bar\"]/a[2]";
  public static String userNameId="user_login";
  public static String userPasswordId="user_password";
  public static String loginBtn="commit";
  public static String basePath=System.getProperty("user.dir");
  public static String filePath=basePath+"/src/test/TestData/测试数据_用户表.xlsx";
  public static String sheetName="用户表";
  public static int rowNum=2;
  public static int nameColum=1;
  public static int passwordColum=2;


}
