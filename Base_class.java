package pojo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base_class {
	public static AndroidDriver driver;
	   public static AndroidDriver getDriver() {
	        return driver;
	    }
	public AppiumDriverLocalService service;
@BeforeTest
public void Open() throws MalformedURLException
{
 UiAutomator2Options option = new UiAutomator2Options();
	
	 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\pallavi\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js")).
			usingPort(4723).build();
	option.setDeviceName("11");
	option.setApp("D:\\code\\sddf\\app\\com.byteflowinnovations.mynest-Signed (1).apk");
	option.setPlatformName("Android");
	option.setAutomationName("UiAutomator2");
	option.setAppPackage("com.byteflowinnovations.mynest");
	option.setAppActivity("crc64618ee5160fd1f32e.MainActivity");
 

	
	URI uri = URI.create("http://127.0.0.1:4723");
	
	URL url = uri.toURL();
	
	 driver = new AndroidDriver(url, option);
}
@AfterTest
public void close() throws InterruptedException
{
	Thread.sleep(2000);
	service.stop();
	driver.quit();
}
}
