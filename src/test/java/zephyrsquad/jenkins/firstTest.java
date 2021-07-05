package zephyrsquad.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class firstTest {
	
WebDriver driver;
	
//	@BeforeTest
	//public void start()
	//{
	//	DesiredCapabilities caps = new DesiredCapabilities();
	//	caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "lib/phantomjs.exe");
	//	WebDriver driver = new PhantomJSDriver(caps);

	//}
	
	@Test
	public void firsttest()
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "resources/phantomjs.exe");
		driver = new PhantomJSDriver(caps);
		
		driver.get("https://www.google.com/");
		
		driver.close();
		
	}

}
