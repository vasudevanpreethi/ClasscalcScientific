
package config;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
	public static WebDriver driver;
	
	String method;
	ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;

	@BeforeTest
	public void generatereport()
	{
		htmlReporter = new ExtentHtmlReporter
				(System.getProperty("user.dir") + "/Reports/MyReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	@BeforeMethod
	public void methodname(Method method)
	{
		parentTest = extent.createTest(method.getName());
	}

  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().version("80").setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  extent.flush();
  }

}
