package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SeleniumLocators {
	WebDriver driver;
		
  
  @BeforeTest
  public void beforeTest(){
	
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }
  @Test
  public void facebook(){
	 
	  driver.get("https://www.facebook.com");
  }
  @Test
  public void swiggy(){
	  driver.get("https://www.swiggy.com");

  }
  @Test
  public void twitter(){
	  driver.get("https://www.X.com");

  }
  @Test
  public void google(){
	  driver.get("https://www.google.com");

  }
  @Test
  public void zomato(){
	  driver.get("https://www.zomato.com");

  }
  @Test
  public void redmine() {
	  driver.get("https://www.redmine.com");

  }
 /* @Test
  public void techlearn() {
	  driver.get("https://www.techlearn.com");

  }*/
  @Test
  public void youtube() {
	  driver.get("https://www.youtube.com");

  }
  
  @Test
  public void chatgpt() {
	  driver.get("https://www.chatgpt.com");

  }

}
