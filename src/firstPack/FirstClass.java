package firstPack;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	//public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		/*driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.x.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.quit();
		//driver.close()*/
		

			
			static WebDriver driver;

			@BeforeAll
			static void setUpBeforeClass() throws Exception {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			
			@AfterAll
			static void tearDownAfterClass() throws Exception {
				driver.quit();
			}	

			@Test
			void facebook() {
			driver.get("https://www.facebook.com");
			}
			@Test
			void google() {
			driver.get("https://www.google.com");
			}	
			
			@Test
			void twitter() {
			driver.get("https://www.x.com");
			}
			@Test
			void zomato() {
			driver.get("https://www.zomato.com");
	}
}
