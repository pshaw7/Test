package Profile;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profile {

	public static void main(String[] args) {
		
//		ProfilesIni allprof = new ProfilesIni();
//		FirefoxProfile prof = allprof.getProfile("selenium");
//		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browsers\\geckodriver.exe");
//		
//		
//		Proxy p = new Proxy();
//		
//		p.setProxyAutoconfigUrl("https://proxyAutoconfigUrl.com");
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(CapabilityType.PROXY, p );
//		cap.setBrowserName("Mozilla");
//		cap.setJavascriptEnabled(true);
//		cap.setCapability(CapabilityType.PLATFORM, "Windows");
//		WebDriver driver = new FirefoxDriver(); 
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////		driver.get("https://wwww.cnn.com");
//		
//		List<WebElement> l = driver.findElements(By.tagName("a"));
//		
//		System.out.println(l.size());
//		
//		for(int i=0;i<l.size();i++){
//			System.out.println(l.get(i));
//			
//		}
//		
////		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////		FileUtils.copyFile(srcFile, new File("C:\\Desktop\\1.jpg"));
////		driver.close();
//		
//		WebDriverWait wait = new WebDriverWait(driver, 40);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("sdfsdfsf")));
		
		Set<String> st = new HashSet<String>();
		st.add("Piyush");
		st.add("Poulami");
		Iterator it = st.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		
	
	}

}
