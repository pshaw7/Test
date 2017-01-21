package My;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browsers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://xoom.com");
		
		driver.manage().window().maximize();
	
		
		WebElement s = driver.findElement(By.linkText("Sign Up"));

		s.click();
		System.out.println(s.getCssValue("width"));
		
		WebElement first = driver.findElement(By.id("signup-firstName"));
		first.click();
		first.sendKeys("Proper1");
		
		WebElement last = driver.findElement(By.id("signup-lastName"));
		last.click();
		last.sendKeys("Property1");
		
		WebElement pass1 = driver.findElement(By.id("signup-email"));
		pass1.click();
		pass1.sendKeys("Proper1");
		
		WebElement pass2 = driver.findElement(By.id("signup-email-confirm"));
		pass2.click();
		pass2.sendKeys("Property1");
		
		driver.findElement(By.id("signup")).click();
		
		Thread.sleep(50);
		
		driver.close();
		
		driver.quit();
	}
	

}
