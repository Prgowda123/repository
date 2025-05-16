package pojo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class Actions {
	public AndroidDriver driver;
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
