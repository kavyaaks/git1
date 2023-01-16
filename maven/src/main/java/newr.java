import org.testng.annotations.Test;

public class newr {
	@Test
	public void ac()
	{

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");


	//classname objectname= new classname();
	ChromeDriver ob= new ChromeDriver();
	ob.get(&quot;https://www.filemail.com/share/upload-

	file&quot;);

	Thread.sleep(3000);
	ob.findElementByCssSelector(&quot;#addBtn&quot;).click();
	Thread.sleep(3000);
	//Runtime.getRuntime().exec(&quot;D:\\Fileupload.exe&quot;);

}
}