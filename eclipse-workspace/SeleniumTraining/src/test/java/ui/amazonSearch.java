package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("qa automation with selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/Complete-Guide-Test-Automation-Maintaining/dp/1484238311/ref=sr_1_1?crid=2Y9EWMJOLCI6S&dib=eyJ2IjoiMSJ9.2HE68MGtInKkhCuMySZVNRDICCU51CCAoyda63PouSmMy3X7T8_0qQKCQDIMpxMVOTpdH1KYSTvpC7BCmLgX9qcidP1zZv-heEuwUeX4N71ivN8IEFjLecJwqjrQC1bWwKKzbC7aEb6zsdRXKpoZCtxWdOZ_Jqh6z_ggPXMu1zWyH_zx_baM0EvbtTq-z65aCJf2O-EkA0lXEsb3LOQzHECl1twc6BYhAVtYHqa_ICE.3dkdtOvxi62WLn2kAKFjHYJrqNybQzG56Zhc1QYId70&dib_tag=se&keywords=qa+automation+with+selenium&qid=1722899528&sprefix=qa+automation+with+selenium%2Caps%2C1527&sr=8-1");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.name("submit.add-to-cart")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
