
public class auto2 {
	
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;
	import com.relevantcodes.extentreports.LogStatus
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ce=new ChromeDriver();
		
		ce.get("http://jqueryui.com/autocomplete/");
		
		ce.switchTo().frame(0);
		WebDriverWait wait= new WebDriverWait(ce,4);
		WebElement textelement = ce.findElementById("tags");
		textelement.sendKeys("a");
		WebElement autoOptions = ce.findElement(By.id("ui-id-1"));
		wait.until(ExpectedConditions.visibilityOf(autoOptions));

		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		for(WebElement option : optionsToSelect){
	        if(option.getText().equals("Java")) {
	        	System.out.println("Trying to select: "+"Java");
	            option.click();
	            break;
	}


}
