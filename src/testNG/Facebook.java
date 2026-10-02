package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Facebook {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.facebook.com");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"_R_1hmkqsqppb6amH1_\"]")).sendKeys("Rajranireddy");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x972fbf x10w94by x1qhh985 x14e42zd x9f619 xtvsq51 xqbgfmv xbe3n85 x7a1id4 x1d9i5bo x1xila8y x1bumbmr xc8cyl1")).click();
	  driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[2]/div/div/div[1]/div/div/svg")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
