package ant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  
  public static void test1()
  {
  WebDriver driver=new FirefoxDriver();
  driver.get("https://www.facebook.com/");
  driver.manage().window().maximize();
  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sach@b.com");
  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pass1");
  System.out.println(driver.getTitle());
  }
  @Test
  public static void test2()
  {
  WebDriver driver=new FirefoxDriver();
  driver.get("https://www.facebook.com/");
  driver.manage().window().maximize();
  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lev@b.com");
  driver.findElement(By.xpath("//input[@id='pa']")).sendKeys("pass1");
  System.out.println(driver.getTitle());
  }
}
