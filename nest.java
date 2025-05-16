package sing;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class nest {
@Test
public void sample() throws MalformedURLException, InterruptedException
{
	UiAutomator2Options option = new UiAutomator2Options();
	
	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\pallavi\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js")).
			usingPort(4723).build();
	option.setDeviceName("Medium Phone");
	option.setApp("D:\\code\\sddf\\app\\com.byteflowinnovations.mynest-Signed (1).apk");
	option.setPlatformName("Android");
	option.setAutomationName("UiAutomator2");
	option.setAppPackage("com.byteflowinnovations.mynest");
	option.setAppActivity("crc64618ee5160fd1f32e.MainActivity");
 

	
	URI uri = URI.create("http://127.0.0.1:4723");
	
	URL url = uri.toURL();
	
	AndroidDriver driver = new AndroidDriver(url, option);
	Thread.sleep(2000);
	driver.findElement(AppiumBy.className("android.widget.Button")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("8855997771");
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Send OTP\"]")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")).sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(AppiumBy.xpath("//androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")).sendKeys("2");
	Thread.sleep(1000);
	driver.findElement(AppiumBy.xpath("//androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")).sendKeys("3");
	Thread.sleep(1000);
	driver.findElement(AppiumBy.xpath("//androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.EditText")).sendKeys("4");
	Thread.sleep(1000);
	driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Submit\"]")).click();
	Thread.sleep(2000);
	
	
	service.stop();
	driver.quit();
}
}
