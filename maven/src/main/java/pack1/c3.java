package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class c3 {
	
	@Test(groups="two")
	public void rt() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver ob=new ChromeDriver();
	    
	    ob.get("https://mycontactform.com");
	    WebElement ele = ob.findElementByLinkText("JMeter Tutorials");
	    ob.executeScript("arguments[0].scrollIntoView(true);", ele);
	    Thread.sleep(2000);
	    ele.click();
	    
	    
       }



}
