package extend;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class e1 {
	@BeforeClass
	public void startTest()
	{
		report = newExtentReports("C:\\Users\\hp\\eclipse-workspace\\maven\\src\\main\\java\\extend\\kavyaa.html");
	}
}
