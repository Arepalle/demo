package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FB1 {
  @SuppressWarnings("unused")
private WebDriver drive;
  @Test
  public void Loginpage() throws InterruptedException {
	  WebDriver driver;
	  WebDriver driver1 = new ChromeDriver();
	  Thread.sleep(20);
	  driver1.manage().window().maximize();
	  driver1.get("http://www.facebook.com/");
	  driver1.findElement(By.xpath("//input[@id='_R_1h6kqsqppb6amH1_']")).sendKeys("9949648170");
	  driver1.findElement(By.xpath("//input[@id='_R_1hmkqsqppb6amH1_']")). sendKeys("");
	  //driver.findElement(By.xpath("x1lliihq x2lah0s x1k90msu x2h7rmj x1qfuztq x198g3q0 xxk0z11 xvy4d1p")).click();
	  driver1.findElement(By.xpath("//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft'][normalize-space()='Log in']")).click();
	  //driver.close();
  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  
	  
  }

}
