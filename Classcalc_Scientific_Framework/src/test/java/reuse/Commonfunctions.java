package reuse;

import org.openqa.selenium.WebDriver;

import config.StartBrowser;
import or.HomePage;
import or.LoginPage;
import wdcmds.ActionDriver;

public class Commonfunctions {
	public WebDriver driver;
	public ActionDriver aDriver;
	
	public Commonfunctions()
	{
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}
	
	public String sinCalc() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Calculating sin");
	
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//		driver.switchTo().frame("basic_calc");
		aDriver.click(HomePage.btnTrig, "Trig button");
		aDriver.click(HomePage.btnSin, "sin button");
			aDriver.click(HomePage.btn3,"3 button");
		aDriver.click(HomePage.btn0,"0 button");
//		aDriver.click(HomePage.btn0, "0 button");
		String result=aDriver.getText(HomePage.txtResult);
		System.out.println("the actual result is :"+result);
		return result;
		
	}
	
	public String cosCalc() throws Exception 
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Calulating cos");
		
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//		driver.switchTo().frame("basic_calc");
		aDriver.click(HomePage.btnTrig, "Trig button");
	aDriver.click(HomePage.btnCos, "cos button");			
		aDriver.click(HomePage.btn3,"3 button");
		aDriver.click(HomePage.btn0,"0 button");
				String result=aDriver.getText(HomePage.txtResult);
		System.out.println("the actual result is :"+result);
		return result;
	}
	
	public String numkey1test() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Check num button 1");	
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//	driver.switchTo().frame("basic_calc");
	String sign=aDriver.getText(HomePage.btn1);
	return sign;
	}
	
	public String numkey2test() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Check num button 2");	
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//	driver.switchTo().frame("basic_calc");
	String sign=aDriver.getText(HomePage.btn2);
	return sign;
	}
	
	public String numkey4test() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Check num button 4");	
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//	driver.switchTo().frame("basic_calc");
	String sign=aDriver.getText(HomePage.btn4);
	return sign;
	}
	
	public String numkey3test() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Check num button 3");	
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//	driver.switchTo().frame("basic_calc");
	String sign=aDriver.getText(HomePage.btn3);
	return sign;
	}
	
	public String numkey5test() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Check num button 3");	
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//	driver.switchTo().frame("basic_calc");
	String sign=aDriver.getText(HomePage.btn5);
	return sign;
	}
	
	public String numkey6test() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Check num button 3");	
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//	driver.switchTo().frame("basic_calc");
	String sign=aDriver.getText(HomePage.btn6);
	return sign;
	}
	
	public String numkey7test() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Check num button 3");	
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//	driver.switchTo().frame("basic_calc");
	String sign=aDriver.getText(HomePage.btn7);
	return sign;
	}
	
	public String numkey8test() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Check num button 3");	
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//	driver.switchTo().frame("basic_calc");
	String sign=aDriver.getText(HomePage.btn8);
	return sign;
	}
	
	public String numkey9test() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Check num button 3");	
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//	driver.switchTo().frame("basic_calc");
	String sign=aDriver.getText(HomePage.btn9);
	return sign;
	}
	
	
	
	
	
	
	
	
	
	
	public String plusTest() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Check Plus sign");	
		aDriver.navigateToApplication("https://app.classcalc.com/scientific-calculator");
//	driver.switchTo().frame("basic_calc");
	String sign=aDriver.getText(HomePage.btnplus);
	return sign;
	
	
	
	
}
}
	
