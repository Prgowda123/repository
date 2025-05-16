package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Pom_class extends Actions {

	@FindBy(className="android.widget.Button")
	private WebElement Get;
	
	@FindBy(className="android.widget.EditText")
	private WebElement mobile;
	
	@FindBy(xpath="//android.widget.Button[@text=\"Send OTP\"]")
	private WebElement send;
	
	@FindBy(xpath = "//androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	private WebElement first;
	
	@FindBy(xpath = "//androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
	private WebElement second;
	
	@FindBy(xpath = "//androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")
	private WebElement third;
	
	@FindBy(xpath = "//androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.EditText")
	private WebElement fourth;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Submit\"]")
	private WebElement submit;
	
	public Pom_class (AndroidDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void start()
	{
		Get.click();
		sleep(2000);
	}
	
	public void Phone()
	{
		mobile.sendKeys("8864885522");
		sleep(2000);
		
	}
	public void sendotp()
	{
		send.click();
		sleep(2000);
	}
	
	public void otp1()
	{
		first.sendKeys("1");
		sleep(1000);
	}
	
	public void otp2()
	{
		second.sendKeys("2");
		sleep(1000);
	}
	
	public void otp3()
	{
		third.sendKeys("3");
		sleep(1000);
	}
	
	public void otp4()
	{
		fourth.sendKeys("4");
		sleep(1000);
		//swipeAction(mobile, "left");
	}
	
	public void Submit()
	{
		submit.click();
		sleep(3000);
	}
	
	
	 private void sleep(int milliseconds) {
	        try {
	            Thread.sleep(milliseconds);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 
}
