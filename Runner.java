package pojo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(pojo.ListerImplementation.class)
public class Runner extends Base_class {
@Test

public void sample()
{
	Pom_class a = new Pom_class(driver);
	
	a.start();
	a.Phone();
	a.sendotp();
	a.otp1();
	a.otp2();
	a.otp3();
	a.otp4();
	a.Submit();
}


}
