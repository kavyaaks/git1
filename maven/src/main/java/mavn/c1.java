package mavn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	@Test(groups="one")
	   public void ls() throws InterruptedException
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    ChromeDriver ob=new ChromeDriver();
		    ob.get("http://www.google.com");
			List<WebElement> s1 = ob.findElementsByTagName("a");
		    System.out.println("Number of links in google:"+s1.size());
		     TimeUnit.SECONDS.sleep(3);
		   
		   
	

}
}