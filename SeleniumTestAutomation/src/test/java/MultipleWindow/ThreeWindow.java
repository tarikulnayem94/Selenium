package MultipleWindow;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ThreeWindow {
	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/windows");

		String parentGUID = driver.getWindowHandle();
		driver.findElement(By.cssSelector(".example > a:nth-child(2)")).click();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		System.out.println("    Child window : " + driver.getTitle());

		driver.switchTo().window(parentGUID);
		driver.findElement(By.cssSelector(".example > a:nth-child(2)")).click();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		System.out.println("    Parents window : " + driver.getTitle());

		driver.switchTo().window(parentGUID);
		driver.get("https://www.bing.com/");
		Thread.sleep(1000);
		System.out.println("    Parents window : " + driver.getTitle());
		
		// get all session id of the browser..................................................
		Set<String> allGUID = driver.getWindowHandles();
		System.out.println("All window GUID : " + allGUID);
		
		// print title all the page...........................................................
		System.out.println(" Page title before switchig : " + driver.getTitle());
		System.out.println("Total Window :" + allGUID.size());

	}
}




