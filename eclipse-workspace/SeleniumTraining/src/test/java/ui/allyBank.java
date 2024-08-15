package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class allyBank {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ally.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='allysf-header-v1-top-nav-list-item-btn js-top-nav-item']")).click();
		driver.findElement(By.xpath("//*[@class='allysf-content-action-v2-anchor ']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

}
