package auto;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a1 {
	@Test
	public void ac() throws InterruptedException, IOException
	{

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");


  //classname objectname= new classname();
    ChromeDriver ob= new ChromeDriver();
    ob.get("https://www.filemail.com/share/upload-file");
    Thread.sleep(3000);
    ob.findElementByCssSelector("#addBtn").click();
    Thread.sleep(3000);
    Runtime.getRuntime().exec("D:\\abcd.exe");
}
}


