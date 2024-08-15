import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoAutomationClass {

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver", "Documents:\\browserDrivers");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("id="twotabsearchtextbox"
		
	}

}
