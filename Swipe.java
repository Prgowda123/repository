package abc;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Swipe {
	public AndroidDriver driver;
@Test
public void sample() throws MalformedURLException, InterruptedException
{
	UiAutomator2Options option = new UiAutomator2Options();
	
	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\pallavi\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js")).usingPort(4723).build();
	option.setDeviceName("Medium Phone");
	option.setApp("D:/code/sddf/app/ApiDemos-debug.apk");
	option.setPlatformName("Android");
	option.setAutomationName("UiAutomator2");
	
	URI uri = URI.create("http://127.0.0.1:4723");
	URL url = uri.toURL();
	
	 driver = new AndroidDriver(url, option);
	WebElement view = driver.findElement(AppiumBy.accessibilityId("Views"));
	view.click();
	Thread.sleep(2000);

	driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	Thread.sleep(2000);

	driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	Thread.sleep(2000);


	WebElement swipe = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]"));

	swipeAction(swipe, "left");
	Thread.sleep(5000);
	
	service.stop();
	driver.quit();
	
	
} 

public void swipeAction(WebElement ele, String direction)
{
	JavascriptExecutor jss = (JavascriptExecutor) driver;
	jss.executeScript("mobile: swipeGesture", ImmutableMap.of(
	    "elementId", ((RemoteWebElement) ele).getId(),
	    "direction", direction,
	    "percent", 0.2
	));
}
}
