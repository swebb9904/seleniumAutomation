package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("error_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Steven");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("28888");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='cancel']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
