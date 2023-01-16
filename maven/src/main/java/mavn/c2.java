package mavn;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test(groups="one")
public class c2
{
	@Test(groups="one")

public void ab() throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		SoftAssert o= new SoftAssert();
		o.assertEquals(ob.getTitle(), "yahoo");//fail
		o.assertNotEquals(ob.getTitle(), "yahoo");//pass
		WebElement ele = ob.findElementByLinkText("Privacy");
		o.assertTrue(ele.isDisplayed());//pass
		o.assertFalse(ele.isSelected());//pass
		ele.click();
		Thread.sleep(3000);
		ob.quit();
		o.assertAll();

}
}
