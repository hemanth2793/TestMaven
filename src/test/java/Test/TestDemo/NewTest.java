package Test.TestDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void test() {
	  System.setProperty("webdriver.firefox.marionette","/home/pace/Downloads/geckodriver.exe");
	  driver= new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	  driver.get("http://qaclickacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
  }
}
