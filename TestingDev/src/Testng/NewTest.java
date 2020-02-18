package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("http://172.16.8.93/");
			driver.findElement(By.xpath("//a[@class='btn btn-link']")).click();
			Thread.sleep(1000);
	  }

  @Test
  public void f() throws Exception {
	  driver.findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/div[1]/div[1]/div[1]/ng-component[1]/form[1]/div[1]/input[1]")).sendKeys("Omkar");
		driver.findElement(By.xpath("//div[2]//input[1]")).sendKeys("More");
		driver.findElement(By.xpath("//div[3]//input[1]")).sendKeys("Omii");
		driver.findElement(By.xpath("//div[4]//input[1]")).sendKeys("Omkar123");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/div[1]/div[1]/div[1]/ng-component[1]/form[1]/div[1]/input[1]")).sendKeys("Omii");
		driver.findElement(By.xpath("//div[2]//input[1]")).sendKeys("Omkar123");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html[1]/body[1]/app[1]/nav[1]/div[1]/a[2]")).click();
		Thread.sleep(2000);
  }
  
  @AfterTest
  public void afterTest() {
  }

}
