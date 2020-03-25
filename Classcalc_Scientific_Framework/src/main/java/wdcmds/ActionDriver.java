package wdcmds;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;

import config.StartBrowser;

public class ActionDriver {

	public WebDriver driver;


	public ActionDriver()
	{
		driver = StartBrowser.driver;
	}

	/**
	 * Used to navigate to application
	 * @param url -- Application URl
	 */
	public void navigateToApplication(String url)
	{
		try {
			driver.get(url);
			StartBrowser.childTest.pass("Successfully navigated to application : "+url);
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to navigate to application : "+url);

		}
	}
	
	/**
	 * Used to Perform click action on links, buttons, check box and radio buttons
	 * @param locator --Get it from OR
	 * @return 
	 * @throws Exception 
	 */
	public void click(By element, String eleName) throws Exception
	{
		try {
			driver.findElement(element).click();
			StartBrowser.childTest.pass("Performed click action successfully on :"+eleName);

		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to Perform click on :"+eleName ,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}

	}
	
	/**
	 * used to perform type action in text box and Text area
	 * @param locator
	 * @param testData
	 * @throws Exception 
	 */
	public void type(By locator, String testData, String eleName) throws Exception
	{
		try {
			driver.findElement(locator).sendKeys(testData);
			StartBrowser.childTest.pass("Performed type in  :"+eleName + " with data :" +testData);
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to Perform type action in :"+eleName + "with data "+testData ,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}

	
	/**
	 * 
	 * @param locator
	 * @return
	 */

	public String getText(By locator)
	{
		try {
			String x=driver.findElement(locator).getText();
			StartBrowser.childTest.pass("Text is   :"+x);
			return x;
		} catch (Exception e) {
			StartBrowser.childTest.fail("unable to return text");
			return null;
		}

	}
	/**
	 * Perform mouse hover on given element
	 * @param locator --- get it from Or
	 * @param eleName --for reporting
	 * @throws Exception 
	 */
	public void mouseHover(By locator, String eleName) throws Exception
	{
		try {
			Actions a = new Actions(driver);
			WebElement mo=driver.findElement(locator);
			a.moveToElement(mo).build().perform();
			StartBrowser.childTest.pass("Performed mousehover on  :"+eleName );
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to Performed mousehover on  :"+eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}

	/**
	 * 
	 * @param locator
	 * @param expText
	 * @throws Exception
	 */
	public void verifyText(By locator, String expText) throws Exception
	{
		String actualText=getText(locator);
		if(actualText.equals(expText))
		{
			StartBrowser.childTest.pass("Actual Text is equal to expected text");
		}
		else
		{
			StartBrowser.childTest.fail("Actual Text : " +actualText +" is not equal to expected text :"+expText ,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			throw new Exception();
		}
	}
	/**
	 * 
	 * @param locator
	 */
	public void waitForelementVisible(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	/**
	 * 
	 * @param locator
	 * @param index
	 * @throws Exception
	 */
	public void selectByIndex(By locator, int index) throws Exception
	{
		try {
			WebElement dd = driver.findElement(locator);
			Select s = new Select(dd);
			s.selectByIndex(index);
			StartBrowser.childTest.pass("Selected " + index + " value from dropdown");
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to Select " + index + " value from dropdown",
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	
	/**
	 * 
	 * @param locator
	 * @param index
	 * @throws Exception
	 */
	public void selectByVisibleText(By locator, String visibleText) throws Exception
	{
		try {
			WebElement dd = driver.findElement(locator);
			Select s = new Select(dd);
			s.selectByVisibleText(visibleText);
			StartBrowser.childTest.pass("Selected " + visibleText + " value from dropdown");
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to Select " + visibleText + " value from dropdown",
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	/**
	 * 
	 * @return
	 */
	public String getParentwindow()
	{
		return driver.getWindowHandle();
	}
	/**
	 * 
	 * @param locator
	 * @param expText
	 */
	public void swittoChildWindow(By locator,String expText)
	{
		Set<String> windows=driver.getWindowHandles();
		try {
			for (String string : windows) {
				driver.switchTo().window(string);
				{
					if(getText(locator).equals(expText) )
					{
						System.out.println("I am in correct window");
						break;
					}
					else
					{
						System.out.println("I am in wrong window");
					}
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public String screenShot()
	{
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}
/**
 * Perform mouse hover and click on submenu
 * @param menuLocator
 * @param subMenuLocator
 * @param menu
 * @param submenu
 * @throws Exception 
 */
public void mouseHoverAndClickSubMenu(By menuLocator, By subMenuLocator, String menu, String submenu) throws Exception
{
	try {
		 Actions act = new Actions(driver);
	     WebElement ele=driver.findElement(menuLocator);
	     act.moveToElement(ele).build().perform();
	     Thread.sleep(3000);
	     driver.findElement(subMenuLocator).click();
	     StartBrowser.childTest.pass("Successfully mouse hover on Menu: " +menu +" and clicked on submenu :"+submenu);
	} catch (Exception e) {
		StartBrowser.childTest.fail("Unable to mousehover  on Menu: " +menu +" and unable to click on submenu :"+submenu,
				MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
		StartBrowser.childTest.info(e);
		throw e;

	}
}

/**
 * It will return true if the element is the present otherwise false
 * @param locator
 * @return
 * @throws IOException 
 */
public boolean isElePresent(By locator, String elementName) throws IOException
{
	try {
		
		driver.findElement(locator);
		 StartBrowser.childTest.pass("Element : " +elementName +" is present");
		return true;
		
	} catch (Exception e) {
		System.out.println("Element is not present");
		StartBrowser.childTest.info("Element : " +elementName +" is not present" + 
		MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
		return false;
	}
}

}
