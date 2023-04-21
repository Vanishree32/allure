
	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class A {

		@Test
		public void testAllure() {
		  WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");   
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();	
	}
	}


